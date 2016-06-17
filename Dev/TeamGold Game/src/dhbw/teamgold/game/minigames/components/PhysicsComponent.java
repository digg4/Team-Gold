package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class PhysicsComponent extends Component {

	private static final float GRAVTY = 9.81f;
	private static final float FRICTION = 0.99f;
	private static final float MASS = 30.5f;

	@Require
	private AreaComponent areaComponent;

	private float verticalForce;
	private float horizontalForce;
	private float verticalSpeed;
	private float horizontalSpeed;
	private boolean applyPhysics = true;

	private int sceneHeight;

	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		sceneHeight = getGameObject().getScene().getSceneHeight();
	}

	@Override
	public void onUpdate(UpdateArguments arguments) {
		double time = arguments.getSecondsSinceLastUpdate();

		if (isApplyPhysics()) {
			applyGravity(time);
			applyFriction(time);
			applyForce(time);
			applySpeed(time);
		} else {
			reset();
		}
		
		checkForGrounded();
	}

	private void applyGravity(double time) {
		verticalSpeed += GRAVTY * MASS * time;
	}

	private void applyFriction(double time) {
		verticalForce *= FRICTION * MASS * time;
		horizontalForce *= FRICTION * MASS * time;
	}

	private void applyForce(double time) {
		verticalSpeed += verticalForce * time;
		horizontalSpeed += horizontalForce * time;
	}

	private void applySpeed(double time) {
		float x = areaComponent.getAbsoluteArea().getX();
		float y = areaComponent.getAbsoluteArea().getY();
		areaComponent.getAbsoluteArea().setX((float) (x + horizontalSpeed * time));
		areaComponent.getAbsoluteArea().setY((float) (y + verticalSpeed * time));
	}

	private void checkForGrounded() {
		if (isGrounded()) {
			reset();
		}
		ensureObjectIsNotUnderGround();
	}

	private void reset() {
		verticalSpeed = 0;
		verticalForce = 0;
		horizontalSpeed = 0;
		horizontalForce = 0;
	}

	private boolean isGrounded() {
		return areaComponent.getAbsoluteArea().getMaxY() >= sceneHeight;
	}

	private void ensureObjectIsNotUnderGround() {
		if (areaComponent.getAbsoluteArea().getMaxY() > sceneHeight) {
			float height = areaComponent.getAbsoluteArea().getHeight();
			areaComponent.getAbsoluteArea().setY(sceneHeight - height);
		}
	}

	public float getVerticalForce() {
		return verticalForce;
	}

	public void setVerticalForce(float verticalForce) {
		this.verticalForce = verticalForce;
	}

	public float getHorizontalForce() {
		return horizontalForce;
	}

	public void setHorizontalForce(float horizontalForce) {
		this.horizontalForce = horizontalForce;
	}

	public boolean isApplyPhysics() {
		return applyPhysics;
	}

	public void setApplyPhysics(boolean applyPhysics) {
		this.applyPhysics = applyPhysics;
	}
	
	public void setHorizontalSpeed(float horizontalSpeed) {
		this.horizontalSpeed = horizontalSpeed;
	}
	
	public void setVerticalSpeed(float verticalSpeed) {
		this.verticalSpeed = verticalSpeed;
	}
	
	public float getVerticalSpeed() {
		return verticalSpeed;
	}
	
	public float getHorizontalSpeed() {
		return horizontalSpeed;
	}

}

package dhbw.teamgold.engine.core.services;

import java.util.Stack;

import dhbw.teamgold.engine.service.Provider;

public class SceneHistoryServiceProvider implements Provider<SceneHistoryService> {

	@Override
	public SceneHistoryService createService() {
		return new SceneHistoryServiceImpl();
	}

	@Override
	public Class<SceneHistoryService> getType() {
		return SceneHistoryService.class;
	}
	
	private static class SceneHistoryServiceImpl implements SceneHistoryService {

		private static final int LOAD_SIZE = 10;
		private Stack<Integer> history = new Stack<>();
		
		@Override
		public int popLastSceneId() {
			return history.pop();
		}

		@Override
		public void pushSceneId(int id) {
			history.push(id);
			limitStackSize();
		}

		private void limitStackSize() {
			if (history.size() > LOAD_SIZE) {
				history.remove(0);
			}
		}
	}
}

package dhbw.teamgold.engine.service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * You can annotate members of classes which are Services with this annotation
 * to easily get it through the <code>injectInto</code>-method. <br/>
 * You should use this in Service-implementations since the
 * <code>injectInto</code>-methods is automatically called on them. <br/>
 * Also note that you should not use this on classes that have many instances
 * since that might lead to performance-problems. Services should generally
 * "injected" in a static way since they basically are singletons. But if a
 * class has not many instances you might consider using this annotations since
 * it is much easier.
 * 
 * @author Daniel Spaniol
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Inject {
}

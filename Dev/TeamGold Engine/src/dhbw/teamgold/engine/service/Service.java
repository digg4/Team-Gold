package dhbw.teamgold.engine.service;

/**
 * This is a flag-interface to mark every kind of service. We use this in order
 * to get some type-safety in the Services-class. <br/>
 * Services are basically singletons which are created by their own Provider.
 * But they are easier to code since you don't have to worry about hiding the
 * constructor, providing a static access-point, etc.
 * 
 * @author Daniel Spaniol
 */
public interface Service {
}

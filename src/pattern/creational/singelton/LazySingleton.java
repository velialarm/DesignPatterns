package pattern.creational.singelton;

/**
 * In computer programming, lazy initialization is the tactics of delaying the
 * creation of an object, the calculation of a value, or some other expensive
 * process until the first time it is needed. In singleton pattern, it restricts
 * the creation of instance until requested first time.
 */
public class LazySingleton {
	private static volatile LazySingleton instance = null;

	public LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}
		return instance;
	}
}

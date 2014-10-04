package pattern.creational.singelton;

public class EagerSingletonEnd {
	/**
	 * JVM has only allocated the memory and constructor code is still not executed. In this case, your other thread, which refer to uninitialized object may throw null pointer exception and can even crash the whole application.
	 */
	 // use volatile where reference of instance is returned before actually the object is constructed
	private static volatile EagerSingletonEnd instance = null;

	public EagerSingletonEnd() {
	}

	public static EagerSingletonEnd getInstance() {
		if (instance==null) {
			synchronized (EagerSingletonEnd.class) {
				//double check
				if (instance == null) {
					instance = new EagerSingletonEnd();
				}
			}
		}
		return instance;
	}
	
}

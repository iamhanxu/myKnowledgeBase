package singleton;

public class ThreadPool {

	private ThreadPool() {
	}

	private static ThreadPool instance = null;

	public static ThreadPool getInstance() {
		if (instance == null) {
			synchronized (ThreadPool.class) {
				if (instance == null) {
					instance = new ThreadPool();
				}
			}
		}

		return instance;
	}

}

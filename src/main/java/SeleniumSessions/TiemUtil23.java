package SeleniumSessions;

public class TiemUtil23 {

	public static final long SMALL_TIME_OUT = 1000;
	public static final long MEDIUM_TIME_OUT = 5000;
	public static final long LARGE_TIME_OUT = 10000;
	public static final long EXTRA_LARGE_TIME_OUT = 20000;

	// don use throw else whle calling the method we have to use throw
	public static void smallWait() {
		try {
			Thread.sleep(SMALL_TIME_OUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void mediumWait() {
		try {
			Thread.sleep(MEDIUM_TIME_OUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void largeWait() {
		try {
			Thread.sleep(LARGE_TIME_OUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void extraLargeWait() {
		try {
			Thread.sleep(EXTRA_LARGE_TIME_OUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void applyWait(long time) {
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

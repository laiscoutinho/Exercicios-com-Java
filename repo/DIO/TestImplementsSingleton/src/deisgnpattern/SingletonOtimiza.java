package deisgnpattern;

public class SingletonOtimiza {

	private static class InstanceHolder {
		private static SingletonOtimiza inst = new SingletonOtimiza();
	}
	
	private SingletonOtimiza () {
		super ();
	}
	
	public static SingletonOtimiza getInstancia() {
		return InstanceHolder.inst;
	}
}

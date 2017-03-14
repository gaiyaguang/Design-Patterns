package singleton;

/**
 * 懒汉式单例，此种方式是线程不安全的，在高并发情况下，可能会出现多个实例
 */
public class Singleton {
	
	private static Singleton mInstance=null;//唯一实例
	
	private Singleton(){};//私有构造方法，保障Singleton不能在类外部实例化
	/**
	 * 静态公共方法，提供给外部，用于获取Singleton的唯一实例
	 */
	public static Singleton getInstance(){
		if(mInstance==null){//实例为空时才创建
			mInstance=new Singleton();
		}
		return mInstance;
	}
	
}

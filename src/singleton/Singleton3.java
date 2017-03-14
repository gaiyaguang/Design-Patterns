package singleton;
/**
 * 懒汉式单例，双重检验，只有在第一次初始化的时候才同步，既保障线程安全，又不影响性能
 */
public class Singleton3 {
	
private static Singleton3 mInstance=null;//唯一实例
	
	private Singleton3(){};//私有构造方法，保障Singleton不能在类外部实例化
	/**
	 * 静态公共方法，提供给外部，用于获取Singleton的唯一实例
	 */
	public static Singleton3 getInstance(){
		if(mInstance==null){
			synchronized(Singleton3.class){
				if(mInstance==null){//实例为空时才创建
					mInstance=new Singleton3();
				}
			}
		}
		return mInstance;
	}
}

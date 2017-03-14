package singleton;
/**
 * 懒汉式单例，通过synchronized关键字保障线程安全，缺点是每次调用方法都要同步，影响性能
 */
public class Singleton2 {

private static Singleton2 mInstance=null;//唯一实例
	
	private Singleton2(){};//私有构造方法，保障Singleton不能在类外部实例化
	/**
	 * 静态公共方法，提供给外部，用于获取Singleton的唯一实例
	 */
	public static synchronized Singleton2 getInstance(){
		if(mInstance==null){//实例为空时才创建
			mInstance=new Singleton2();
		}
		return mInstance;
	}
}

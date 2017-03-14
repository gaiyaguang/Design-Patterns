package singleton;

/**
 * 饿汉式单例，类初始化的时候即创建一个实例，以后不再改变，天生线程安全。
 */
public class Singleton5 {
	
	private static final Singleton5 mInstance=new Singleton5();//唯一实例
	
	private Singleton5(){};//私有构造方法，保障外部不能实例化
	
	public static Singleton5 getInstance(){//静态公共方法，用于外部获取唯一实例
		return mInstance;
	}
}

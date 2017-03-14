package singleton;

/**
 * 懒汉式单例，定义一个静态内部流泪，用classloader的机制保障初始化mInstance的时候只有一个线程，既保障线程安全，又不影响性能。
 */
public class Singleton4 {
	//静态内部类
	private static class InnerClass{
		private static Singleton4 mInstance=new Singleton4();//唯一实例
	}
	
	private Singleton4(){};//私有构造方法
	
	public static Singleton4 getInstance(){//静态公共方法，获取唯一实例
		return InnerClass.mInstance;
	}

}

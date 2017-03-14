package singleton;
/**
 * ����ʽ������ͨ��synchronized�ؼ��ֱ����̰߳�ȫ��ȱ����ÿ�ε��÷�����Ҫͬ����Ӱ������
 */
public class Singleton2 {

private static Singleton2 mInstance=null;//Ψһʵ��
	
	private Singleton2(){};//˽�й��췽��������Singleton���������ⲿʵ����
	/**
	 * ��̬�����������ṩ���ⲿ�����ڻ�ȡSingleton��Ψһʵ��
	 */
	public static synchronized Singleton2 getInstance(){
		if(mInstance==null){//ʵ��Ϊ��ʱ�Ŵ���
			mInstance=new Singleton2();
		}
		return mInstance;
	}
}

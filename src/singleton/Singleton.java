package singleton;

/**
 * ����ʽ���������ַ�ʽ���̲߳���ȫ�ģ��ڸ߲�������£����ܻ���ֶ��ʵ��
 */
public class Singleton {
	
	private static Singleton mInstance=null;//Ψһʵ��
	
	private Singleton(){};//˽�й��췽��������Singleton���������ⲿʵ����
	/**
	 * ��̬�����������ṩ���ⲿ�����ڻ�ȡSingleton��Ψһʵ��
	 */
	public static Singleton getInstance(){
		if(mInstance==null){//ʵ��Ϊ��ʱ�Ŵ���
			mInstance=new Singleton();
		}
		return mInstance;
	}
	
}

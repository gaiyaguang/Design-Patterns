package singleton;
/**
 * ����ʽ������˫�ؼ��飬ֻ���ڵ�һ�γ�ʼ����ʱ���ͬ�����ȱ����̰߳�ȫ���ֲ�Ӱ������
 */
public class Singleton3 {
	
private static Singleton3 mInstance=null;//Ψһʵ��
	
	private Singleton3(){};//˽�й��췽��������Singleton���������ⲿʵ����
	/**
	 * ��̬�����������ṩ���ⲿ�����ڻ�ȡSingleton��Ψһʵ��
	 */
	public static Singleton3 getInstance(){
		if(mInstance==null){
			synchronized(Singleton3.class){
				if(mInstance==null){//ʵ��Ϊ��ʱ�Ŵ���
					mInstance=new Singleton3();
				}
			}
		}
		return mInstance;
	}
}

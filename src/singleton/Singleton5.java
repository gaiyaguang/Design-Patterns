package singleton;

/**
 * ����ʽ���������ʼ����ʱ�򼴴���һ��ʵ�����Ժ��ٸı䣬�����̰߳�ȫ��
 */
public class Singleton5 {
	
	private static final Singleton5 mInstance=new Singleton5();//Ψһʵ��
	
	private Singleton5(){};//˽�й��췽���������ⲿ����ʵ����
	
	public static Singleton5 getInstance(){//��̬���������������ⲿ��ȡΨһʵ��
		return mInstance;
	}
}

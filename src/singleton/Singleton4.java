package singleton;

/**
 * ����ʽ����������һ����̬�ڲ����ᣬ��classloader�Ļ��Ʊ��ϳ�ʼ��mInstance��ʱ��ֻ��һ���̣߳��ȱ����̰߳�ȫ���ֲ�Ӱ�����ܡ�
 */
public class Singleton4 {
	//��̬�ڲ���
	private static class InnerClass{
		private static Singleton4 mInstance=new Singleton4();//Ψһʵ��
	}
	
	private Singleton4(){};//˽�й��췽��
	
	public static Singleton4 getInstance(){//��̬������������ȡΨһʵ��
		return InnerClass.mInstance;
	}

}

package strategy;
/**
 * ��װ�࣬������
 */
public class Context {

	private Calculator mCalculator;//Ҫִ�еĲ���ʵ��
	
	public Context(Calculator calculator){//���캯���������Ĳ���ʵ��
		this.mCalculator=calculator;
	}
	
	public int exec(int a,int b){
		return this.mCalculator.exec(a, b);//ִ�о���Ĳ��Է���
	}
}

package builder;

import java.util.ArrayList;

/**
 * ����Benz���Ĵ����࣬ʵ�ֳ��󴴽��ӿڵķ���
 */
public class BenzCarBuilder implements CarBuilder{
	
	private BenzCarModel benz=new BenzCarModel();//Benz��ģ��

	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.benz.setSequence(sequence);//��Benz��ģ������ִ��˳��
	}

	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.benz;//����Benz��ģ��ʵ��
	}

}

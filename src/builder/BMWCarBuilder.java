package builder;

import java.util.ArrayList;

/**
 * BMW���ľ��崴���࣬ʵ�ֳ���ӿڵķ���
 */
public class BMWCarBuilder implements CarBuilder{
	
	private BMWCarModel bmw=new BMWCarModel();//BWM��ģ��

	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		bmw.setSequence(sequence);//��BMWģ������ִ��˳��
	}

	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.bmw;//����BMWģ��ʵ��
	}

}

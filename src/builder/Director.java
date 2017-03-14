package builder;

import java.util.ArrayList;

/**
 * �����࣬���𴴽���ͬ������ģ��
 */
public class Director {
	
	private BenzCarBuilder benzBuilder=new BenzCarBuilder();//Benz��������
	
	private BMWCarBuilder bmwBuilder=new BMWCarBuilder();//BMW��������
	
	private ArrayList<String> sequence=new ArrayList<String>(){};//����ִ��˳��
	
	/**
	 * A��Benz��ģ�ͣ���������Ȼ��ֹͣ�������������������������춼û��
	 */
	public CarModel getABenzCarModel(){
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		benzBuilder.setSequence(this.sequence);
		return benzBuilder.getCarModel();
	}
	
	/**
	 * B��Benz��ģ�ͣ����������棬��������Ȼ��ֹͣ��û����������
	 */
	public CarModel getBBenzCarModel(){
		this.sequence.clear();
		this.sequence.add("engineBoom");
		this.sequence.add("start");
		this.sequence.add("stop");
		benzBuilder.setSequence(sequence);
		return benzBuilder.getCarModel();
	}
	
	/**
	 * C��BMW��ģ�ͣ��������죬��������Ȼ��ֹͣ��û����������
	 */
	public CarModel getCBMWCarModel(){
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		bmwBuilder.setSequence(this.sequence);
		return bmwBuilder.getCarModel();
	}
	
	/**
	 * D��BMW��ģ�ͣ��������죬��������������������Ȼ��ֹͣ
	 */
	public CarModel getDBMWCarModel(){
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("engineBoom");
		this.sequence.add("stop");
		bmwBuilder.setSequence(this.sequence);
		return bmwBuilder.getCarModel();
	}

}

package builder;

import java.util.ArrayList;

/**
 * 导演类，负责创建不同的汽车模型
 */
public class Director {
	
	private BenzCarBuilder benzBuilder=new BenzCarBuilder();//Benz车建造器
	
	private BMWCarBuilder bmwBuilder=new BMWCarBuilder();//BMW车建造器
	
	private ArrayList<String> sequence=new ArrayList<String>(){};//车辆执行顺序
	
	/**
	 * A类Benz车模型，先启动，然后停止，其它的引擎启动，喇叭声响都没有
	 */
	public CarModel getABenzCarModel(){
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		benzBuilder.setSequence(this.sequence);
		return benzBuilder.getCarModel();
	}
	
	/**
	 * B类Benz车模型，先启动引擎，再启动，然后停止，没有喇叭声响
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
	 * C类BMW车模型，先喇叭响，再启动，然后停止，没有引擎启动
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
	 * D类BMW车模型，先喇叭响，再启动，再引擎启动，然后停止
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

package builder;

import java.util.ArrayList;

/**
 * 具体Benz车的创建类，实现抽象创建接口的方法
 */
public class BenzCarBuilder implements CarBuilder{
	
	private BenzCarModel benz=new BenzCarModel();//Benz车模型

	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.benz.setSequence(sequence);//给Benz车模型设置执行顺序
	}

	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.benz;//返回Benz车模型实例
	}

}

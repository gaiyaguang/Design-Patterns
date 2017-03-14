package builder;

import java.util.ArrayList;

/**
 * BMW车的具体创建类，实现抽象接口的方法
 */
public class BMWCarBuilder implements CarBuilder{
	
	private BMWCarModel bmw=new BMWCarModel();//BWM车模型

	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		bmw.setSequence(sequence);//给BMW模型设置执行顺序
	}

	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.bmw;//返回BMW模型实例
	}

}

package builder;

import java.util.ArrayList;

/**
 * 汽车创建类的接口，定义具体汽车创建类的规范方法
 */
public interface CarBuilder {
	
	public void setSequence(ArrayList<String> sequence);//设置车辆启动顺序
	
	public CarModel getCarModel();//获取车辆模型

}

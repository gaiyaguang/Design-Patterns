package builder;

import java.util.ArrayList;

/**
 * 汽车抽象模板，定义汽车类执行顺序的基本方法,并实现控制汽车执行顺序的模板方法
 */
public abstract class CarModel {
	
	private ArrayList<String> sequence=new ArrayList<String>();//放置汽车执行顺序的集合
	
	protected abstract void start();//启动
	
	protected abstract void engineBoom();//引擎启动
	
	protected abstract void alarm(); //喇叭声响
	
	protected abstract void stop(); //停止
	
	final public void run(){//运行
		
		for(String str:sequence){//遍历车辆运行的顺序列表，根据顺序运行车辆
		if(str.equalsIgnoreCase("start")){//车辆启动
			this.start();
		}else if(str.equalsIgnoreCase("engineBoom")){//车辆引擎启动
			this.engineBoom();
		}else if(str.equalsIgnoreCase("alarm")){//车辆喇叭声响
			this.alarm();
		}else if(str.equalsIgnoreCase("stop")){//车辆停止运行
			this.stop();
		}
		}
	}
	
	final public void setSequence(ArrayList<String> sequence){//给车辆设置运行顺序
		
		this.sequence=sequence;
	}

}

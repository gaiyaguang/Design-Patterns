package command;
/**
 * 组抽象类，定义各组的基本行为
 */
public abstract class Group {

	public abstract void find();//找到对应的组
	
	public abstract void add();//增加
	
	public abstract void delete();//减少
	
	public abstract void change();//更改
	
	public abstract void plan();//规划
}

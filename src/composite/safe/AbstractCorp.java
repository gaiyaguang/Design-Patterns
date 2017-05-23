package composite.safe;

import java.util.ArrayList;

/**
 * 抽象类，定义树枝节点和叶子节点的公共属性，方法
 */
public abstract class AbstractCorp {
	
	private String name;//姓名
	private String position;//职位
	private String salary;//薪水
	
	//构造方法
	public AbstractCorp(String name,String position,String salary){
		this.name=name;
		this.position=position;
		this.salary=salary;
	}
	
	//返回信息
	protected void getInfo(){
		System.out.println("姓名："+this.name+" 职位："+this.position+" 薪资："+this.salary);
	}

}

package composite.transparent;
import java.util.ArrayList;
/**
 * 抽象类，定义组合对象和单个对象的公共属性，方法
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
	
	//抽象方法 增加一个下级节点,可能是树枝节点，也可能是树叶节点
	public abstract void addSubordinate(AbstractCorp corp);
			
	//抽象方法 返回所有的下级节点
	public abstract ArrayList<AbstractCorp> getAllSubordinates();
	
	//返回信息
	protected void getInfo(){
		System.out.println("姓名："+this.name+" 职位："+this.position+" 薪资："+this.salary);
	}

}

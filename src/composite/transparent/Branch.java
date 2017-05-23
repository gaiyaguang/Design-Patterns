package composite.transparent;

import java.util.ArrayList;

import composite.transparent.AbstractCorp;
/**
 * 组合对象类
 */
public class Branch extends AbstractCorp{

	private ArrayList<AbstractCorp> subordinateList=new ArrayList<AbstractCorp>();//下级节点集合
	
	//构造方法，调用父类的构造方法
	public Branch(String name, String position, String salary) {
		super(name, position, salary);
		// TODO Auto-generated constructor stub
	}
	
	//实现抽象类的方法 增加一个下级节点,可能是树枝节点，也可能是树叶节点
	@Override
	public void addSubordinate(AbstractCorp corp) {
		// TODO Auto-generated method stub
		if(this.subordinateList!=null){
			this.subordinateList.add(corp);
		}
	}

	//实现抽象类的方法 返回所有的下级节点
	@Override
	public ArrayList<AbstractCorp> getAllSubordinates() {
		// TODO Auto-generated method stub
		return this.subordinateList;
	}

}

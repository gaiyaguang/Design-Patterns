package composite.safe;

import java.util.ArrayList;

/**
 * 树枝节点类
 */
public class Branch extends AbstractCorp{
	
	private ArrayList<AbstractCorp> subordinateList=new ArrayList<AbstractCorp>();//子节点集合

	//构造方法，调用父类的构造方法
	public Branch(String name, String position, String salary) {
		super(name, position, salary);
		// TODO Auto-generated constructor stub
	}
	
	//增加一个子节点,可能是树枝节点，也可能是树叶节点
	public void addSubordinate(AbstractCorp corp){
		if(this.subordinateList!=null){
			this.subordinateList.add(corp);
		}
	}
	
	//返回所有的子节点
	public ArrayList<AbstractCorp> getAllSubordinates(){
		return this.subordinateList;
	}

}

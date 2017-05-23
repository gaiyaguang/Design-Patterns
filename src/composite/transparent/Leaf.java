package composite.transparent;

import java.util.ArrayList;

/**
 * 叶子节点
 */
public class Leaf extends AbstractCorp{

	//构造方法，调用父类的构造方法
	public Leaf(String name, String position, String salary) {
		super(name, position, salary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 实现抽象类的方法，叶子节点不能再添加子节点，所以
	 * @Deprecated注解，表示“不建议使用”,
	 * 方法空实现抛出一个UnsupportedOperationException异常
	 */
	@Deprecated
	@Override
	public void addSubordinate(AbstractCorp corp){
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();////空实现,直接抛弃一个"不支持请求"异常
	}

	/**
	 * 实现抽象类的方法，叶子节点不包含任何子节点，所以
	 * @Deprecated注解，表示“不建议使用”,
	 * 方法空实现抛出一个UnsupportedOperationException异常
	 */
	@Deprecated
	@Override
	public ArrayList<AbstractCorp> getAllSubordinates() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();////空实现,直接抛弃一个"不支持请求"异常
	}

}

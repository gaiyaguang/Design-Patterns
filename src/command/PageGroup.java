package command;
/**
 * 页面组
 */
public class PageGroup extends Group{

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("找到页面组...");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("客户要求增加一个页面...");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("客户要求删除一个页面...");
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("客户要求更改一个页面...");
	}

	@Override
	public void plan() {
		// TODO Auto-generated method stub
		System.out.println("客户要求页面变更计划...");
	}

}

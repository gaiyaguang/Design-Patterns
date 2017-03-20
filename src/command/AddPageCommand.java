package command;
/**
 * 增加页面命令类
 */
public class AddPageCommand extends Command{

	@Override
	public void exec() {//调用父类的页面组对象，实现具体的增加页面命令
		// TODO Auto-generated method stub
		super.pageGroup.find();
		super.pageGroup.add();
		super.pageGroup.plan();
	}

}

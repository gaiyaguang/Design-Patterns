package command;
/**
 * 需求变更命令类
 */
public class RequirementChangeCommand extends Command{

	@Override
	public void exec() {//调用父类的需求组对象，实现具体的需求变更
		// TODO Auto-generated method stub
		super.requireGroup.find();
		super.requireGroup.change();
		super.requireGroup.plan();
	}

}

package command;
/**
 * ������������
 */
public class RequirementChangeCommand extends Command{

	@Override
	public void exec() {//���ø�������������ʵ�־����������
		// TODO Auto-generated method stub
		super.requireGroup.find();
		super.requireGroup.change();
		super.requireGroup.plan();
	}

}

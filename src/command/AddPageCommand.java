package command;
/**
 * ����ҳ��������
 */
public class AddPageCommand extends Command{

	@Override
	public void exec() {//���ø����ҳ�������ʵ�־��������ҳ������
		// TODO Auto-generated method stub
		super.pageGroup.find();
		super.pageGroup.add();
		super.pageGroup.plan();
	}

}

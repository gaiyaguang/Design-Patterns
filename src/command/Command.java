package command;
/**
 * ��������࣬��������Ļ������Ժ���Ϊ
 */
public abstract class Command {

    protected RequirementGroup requireGroup=new RequirementGroup();//������
	
	protected PageGroup pageGroup=new PageGroup();//ҳ����
	
	protected CodeGroup codeGroup=new CodeGroup();//������
	
	public abstract void exec();//�¼�ִ�з���
}

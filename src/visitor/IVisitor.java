package visitor;
/**
 * �����߽ӿ���
 */
public interface IVisitor {

	//������ְͨ��
	public void visit(CommonEmployee employee);
	
	//���ʹ�����ְ��
	public void visit(ManagerEmployee employee);
}

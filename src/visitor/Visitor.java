package visitor;
/**
 * ������ʵ����
 */
public class Visitor implements IVisitor{

	//������ְͨ��
	public void visit(CommonEmployee employee) {
		// TODO Auto-generated method stub
		System.out.println("��ְͨ��:"+" ������"+employee.getName()+" ,�Ա�"+employee.getSex()+" ,������"+employee.getJob());//��ӡ��ְͨ���ߵ���Ϣ
	}

	//���ʹ�����ְ��
	public void visit(ManagerEmployee employee) {
		// TODO Auto-generated method stub
		System.out.println("����Աְ��:"+" ������"+employee.getName()+" ,�Ա�"+employee.getSex()+" ,ҵ����"+employee.getPerformance());//��ӡ��ְͨ���ߵ���Ϣ
	}

}

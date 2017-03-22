package decorator;
/**
 * ����װ�����࣬�̳г���ɼ�����
 */
public abstract class AbstractDecorator extends AbstractReport{
	
	private AbstractReport report;//�ɼ���
	
	public AbstractDecorator(AbstractReport report){//���캯��������һ��Ҫװ�εĳɼ���
		this.report=report;
	}

	@Override
	public void report() {//չʾ�ɼ�
		// TODO Auto-generated method stub
		this.report.report();//���óɼ�����report����
	}

	@Override
	public void sign(String name) {//�ҳ�ǩ��
		// TODO Auto-generated method stub
		this.report.sign(name);//���óɼ�����sign����
	}
	
	
}

package decorator;
/**
 * ����װ����
 */
public class SortDecorator extends AbstractDecorator{

	public SortDecorator(AbstractReport report) {
		super(report);//���ø���Ĺ��췽��
		// TODO Auto-generated constructor stub
	}

	@Override
	public void report() {//չʾ�ɼ�
		// TODO Auto-generated method stub
		sortReport();//����ɼ�ǰ���ȱ���༶����
		super.report();//���ø����report����
	}

	@Override
	public void sign(String name) {//ǩ��
		// TODO Auto-generated method stub
		super.sign(name);//���ø����sign����
	}

	private void sortReport(){//���汾�ο��Եİ༶����
		System.out.println("����ο��Եİ༶�����ǣ�13");
	}
}

package decorator;
/**
 * ��߳ɼ���������
 */
public class HighScoreDecorator extends AbstractDecorator{

	public HighScoreDecorator(AbstractReport report) {
		super(report);//���ø���Ĺ��췽��
		// TODO Auto-generated constructor stub
	}

	@Override
	public void report() {//չʾ�ɼ�
		// TODO Auto-generated method stub
		reportHighScore();//����ɼ�ǰ���ȱ�����߳ɼ�
		super.report();//���ø���ı��淽��
	}

	@Override
	public void sign(String name) {//�ҳ�ǩ��
		// TODO Auto-generated method stub
		super.sign(name);//���ø����ǩ������
	}
	
	private void reportHighScore(){//������߳ɼ�
		System.out.println("��ο���������ߣ�87�֣���ѧ73�֣�Ӣ��67��");
	}

}

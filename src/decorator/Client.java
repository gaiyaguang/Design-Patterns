package decorator;
/**
 * ������
 */
public class Client {

	public static void main(String[] args){
		AbstractReport report;//�ɼ�������
		report=new ForthReport();//ԭװ�ĳɼ���
		report=new HighScoreDecorator(report);//������߳ɼ����εĳɼ���
		report=new SortDecorator(report);//�ټ��ϰ༶�����ĳɼ���
		report.report();//����ɼ�
		report.sign("��������");
	}
}

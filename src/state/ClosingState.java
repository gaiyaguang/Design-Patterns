package state;
/**
 * �����Źر�״̬
 */
public class ClosingState extends AbstractState{

	//�򿪵�����
	@Override
	public void open() {
		// TODO Auto-generated method stub
		super.context.setState(Context.STATE_OPENING);//�л�����״̬
		super.context.getState().open();//���û����ĵ�ǰ״̬���в���
	}

	//��������
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.context.setState(Context.STATE_RUNING);//�л�����״̬
		super.context.getState().run();//���û����ĵ�ǰ״̬���в��� 
	}

	//�����Źرգ��϶���ֹͣ�ģ�ʲôҲ����
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		//do nothing 
	}

	//��ɹرյ���������߼�������ֻ�Ǵ�ӡһ����Ϣ
	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("�رյ�����...");
	}

}

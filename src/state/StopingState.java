package state;
/**
 * ����ֹͣ״̬
 */
public class StopingState extends AbstractState{

	//���ݻ�ֹͣ���򿪵�����
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
		super.context.setState(Context.STATE_STOPING);//�л�����״̬
		super.context.getState().run();//���û����ĵ�ǰ״̬���в���
	}

	//��ɵ���ֹͣ����߼�������ֻ�Ǵ�ӡһ����Ϣ
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("ֹͣ��������...");
	}

	//���ݻ�ûֹͣ�������ſ϶��ǹرյģ�ʲôҲ����
	@Override
	public void close() {
		// TODO Auto-generated method stub
		// do nothing 
	}

}
package state;
/**
 * ������������״̬
 */
public class RuningState extends AbstractState{

	//��������״̬�£����ܴ򿪵�����,ʲôҲ����
	@Override
	public void open() {
		// TODO Auto-generated method stub
		//do nothing
	}

	//������е������ҵ���߼�,����ֻ�Ǵ�ӡһ����Ϣ
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("������������...");
	}

	//ֹͣ����
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.context.setState(Context.STATE_STOPING);//�л�����״̬
		super.context.getState().stop();//���û����ĵ�ǰ״̬���в���
	}

	//��������״̬�£����ݿ϶��ǹرյģ�ʲôҲ����
	@Override
	public void close() {
		// TODO Auto-generated method stub
		//do nothing
	}

}

package state;
/**
 * �����Ŵ�״̬
 */
public class OpeningState extends AbstractState{
	
	//��ɴ򿪵���������߼�,����ֻ�Ǵ�ӡһ����Ϣ
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("�򿪵�����...");
	}

	//�����Ŵ򿪣��϶��������У�ʲôҲ����
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//do nothing
	}

	//�����Ŵ򿪣����ݿ϶���ֹͣ�ģ�ʲôҲ����
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		//do nothing 
	}

	//���������ڴ򿪣���ʱ����ѡ��رյ�����
	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.context.setState(Context.STATE_CLOSING);//�л�����״̬
		super.context.getState().close();//���û����ĵ�ǰ״̬���в���
	}

}

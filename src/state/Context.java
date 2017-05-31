package state;
/**
 * ������,�û����ʽӿ�
 * ���浱ǰ״̬
 * ��������״̬����ľ�̬����
 * �ṩ����״̬��������з�����ڣ�����ִ��ʹ��ί�з�ʽ
 */
public class Context {
	
	public static final OpeningState STATE_OPENING=new OpeningState();//�����Ŵ�״̬
	public static final RuningState STATE_RUNING=new RuningState();//��������״̬
	public static final StopingState STATE_STOPING=new StopingState();//����ֹͣ״̬
	public static final ClosingState STATE_CLOSING=new ClosingState();//�����Źر�״̬

	private AbstractState state;//��ǰ״̬

	//��ȡ��ǰ������״̬
	public AbstractState getState() {
		return state;
	}

	//���õ�ǰ������״̬
	public void setState(AbstractState state) {
		this.state = state;
		this.state.setContext(this);
	}
	
	//�򿪵�����
	public void open(){
		this.state.open();//ί�е�ǰ״̬ȥ�򿪵�����
	}
	
	//���е���
	public void run(){
		this.state.run();//ί�е�ǰ״̬ȥ���е���
	}
	
	//ֹͣ����
	public void stop(){
		this.state.stop();//ί�е�ǰ״̬ȥֹͣ��������
	}
	
	//�رյ�����
	public void close(){
		this.state.close();//ί�е�ǰ״̬ȥ�رյ�����
	}
}

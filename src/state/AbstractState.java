package state;
/**
 * ״̬������
 * ����һ���ܱ����Ļ���������������ʣ�
 * ��������״̬�ĳ�����Ϊ��������ʵ��
 */
public abstract class AbstractState {

	protected Context context;//��������
	
	//���õ�ǰ�Ļ���
	public void setContext(Context context) {
		this.context = context;
	}

	public abstract void open();//���ݴ�
	
	public abstract void run();//��������
	
	public abstract void stop();//����ֹͣ
	
	public abstract void close();//���ݹر�
}

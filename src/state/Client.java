package state;
/**
 * ������
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context=new Context();//����һ������������Ϊ�û����ʵĶ���
		context.setState(Context.STATE_CLOSING);//�տ�ʼ����Ϊ�ر�״̬
		context.open();//�򿪵�����
		context.close();//�رյ�����
		context.run();//���е���
		context.stop();//ֹͣ����
		context.open();//�򿪵�����
	}

}

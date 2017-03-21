package chain;
/**
 * �����߳�����
 */
public abstract class AbstractHandler {
	public static final int FATHER_LEVEL_REQUEST=0;//δ��
	public static final int HUSBAND_LEVEL_REQUEST=1;//�ѻ�
	public static final int SON_LEVEL_REQUEST=2;//����
	
	private int level=0;//������
	private AbstractHandler nextHander;//��һ��������
	
	public AbstractHandler(int level){
		this.level=level;//���ô�����
	}

	public final void handleMessage(IWomen women){//����������Ѱ�ҵ����ʵĴ�����.final ������д
		if(women.getType()==this.level){//Ϊ�Լ��Ĵ�����
			this.response(women);//�����Լ��Ĵ�����
		}else{
			if(this.nextHander!=null){
				this.nextHander.handleMessage(women);//����һ�������ߣ��򽻸���һ�������ߴ���
			}else{
				System.out.println("û�д����ߣ�����ͬ�⴦��...");
			}
		}
	}
	
	public void setNext(AbstractHandler nextHandler){//������һ��������
		this.nextHander=nextHandler;
	}
	
	public abstract void response(IWomen women);//������,����ʵ��
}

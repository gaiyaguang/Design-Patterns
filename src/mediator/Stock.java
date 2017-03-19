package mediator;
/**
 * �ֿ���
 */
public class Stock extends AbstractColleague{
	
	private static int CURRENT_NUM=100;//��ǰ��棬��ʼֵ100

	public Stock(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ���ӿ��
	 */
	public void increaseStock(int num){
		CURRENT_NUM=CURRENT_NUM+num;//���ӿ����Ŀ������Ҫ�����ⲿ������
		System.out.println("�����������"+num+"...");
	}
	
	/**
	 * ���ٿ��
	 */
	public void decreaseStock(int num){
	   CURRENT_NUM=CURRENT_NUM-num;//���ٿ����������Ҫ�����ⲿ������
	   System.out.println("�����������"+num+"...");
	}
	
	/**
	 * ��ȡ�������
	 */
	public int getStockNum(){
		System.out.println("�������Ϊ"+CURRENT_NUM+"...");
		return CURRENT_NUM;//��ȡ�����������Ҫ�����ⲿ������
	}
	
	/**
	 * ��տ��
	 */
	public void clearStock(){
		super.mediator.exec("stock.clear");//�ɹ�����Ҫ�ٲɹ������۴�������
		CURRENT_NUM=0;
	}

}

package mediator;
/**
 * �ɹ���
 */
public class Purchase extends AbstractColleague{

	public Purchase(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * �ɹ�һ����Ŀ����Ʒ
	 */
	public void purchase(int number){
		super.mediator.exec("purchase.purchase",number);//�������۶��󣬻�ȡ����������ֿ�ҲҪ����������
	}
	
	/**
	 * ֹͣ�ɹ�
	 */
	public void refusePurchase(){
		System.out.println("Purchase���ٲɹ���Ʒ...");//�������������Ҫ�����ⲿ����.
	}
		
}

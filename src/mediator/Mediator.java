package mediator;
/**
 * �н���ʵ����
 */
public class Mediator extends AbstractMediator{

	@Override
	public void exec(String str, Object... objects) {//�¼�������������������֮��Ĺ�ϵ
		// TODO Auto-generated method stub
		if(str.equals("purchase.purchase")){//����
			purchase((Integer)objects[0]);
		}else if(str.equals("sale.sale")){//����
			sale((Integer)objects[0]);
		}else if(str.equals("sale.offsale")){//��������
			offSale();
		}else if(str.equals("stock.clear")){//���
			clearStock();
		}
	}
	
	/**
	 * �ɹ���Ʒ
	 */
	private void purchase(int num){
		int saleStatus=super.sale.getStatus();
		if(saleStatus>80){//�����������
			System.out.println("�ɹ�"+num+"����Ʒ...");
			super.stock.increaseStock(num);//�ֿ�����num��Ʒ
		}else{
			System.out.println("�ɹ�"+num/2+"����Ʒ...");
			super.stock.increaseStock(num/2);//�ֿ�����num��Ʒ
		}
	}
	
	/**
	 * ������Ʒ
	 */
	private void sale(int num){
		if(super.stock.getStockNum()<num){//��治��
			super.purchase.purchase(num);//����num��Ʒ
		}
		System.out.println("����"+num+"����Ʒ...");
		super.stock.decreaseStock(num);//�ֿ����num��Ʒ
	}
	
	/**
	 * ��������
	 */
	private void offSale(){
		int stockNum=super.stock.getStockNum();//��ȡ�ֿ����
		System.out.println("��������"+stockNum+"����Ʒ"+"...");
	}
	
	/**
	 * ��ִ���
	 */
	private void clearStock(){
		super.purchase.refusePurchase();//���ٹ�����Ʒ
		super.sale.offSale();//��������
	}
}

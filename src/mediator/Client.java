package mediator;

/**
 * ������
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMediator mediator=new Mediator();
		System.out.println("------�ɹ���Ա�ɹ�100����Ʒ------");
		Purchase purchase=new Purchase(mediator);
		purchase.purchase(100);
		System.out.println("------������Ա����50����Ʒ------");
		Sale sale=new Sale(mediator);
		sale.sale(50);
		System.out.println("------�ֿ����------");
		Stock stock=new Stock(mediator);
		stock.clearStock();
	}

}

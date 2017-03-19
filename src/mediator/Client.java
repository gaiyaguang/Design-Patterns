package mediator;

/**
 * 场景类
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMediator mediator=new Mediator();
		System.out.println("------采购人员采购100件商品------");
		Purchase purchase=new Purchase(mediator);
		purchase.purchase(100);
		System.out.println("------销售人员销售50件商品------");
		Sale sale=new Sale(mediator);
		sale.sale(50);
		System.out.println("------仓库清仓------");
		Stock stock=new Stock(mediator);
		stock.clearStock();
	}

}

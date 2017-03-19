package mediator;
/**
 * 采购类
 */
public class Purchase extends AbstractColleague{

	public Purchase(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 采购一定数目的商品
	 */
	public void purchase(int number){
		super.mediator.exec("purchase.purchase",number);//访问销售对象，获取销售情况。仓库也要做增减处理。
	}
	
	/**
	 * 停止采购
	 */
	public void refusePurchase(){
		System.out.println("Purchase不再采购商品...");//本类操作，不需要依赖外部对象.
	}
		
}

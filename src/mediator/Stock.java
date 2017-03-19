package mediator;
/**
 * 仓库类
 */
public class Stock extends AbstractColleague{
	
	private static int CURRENT_NUM=100;//当前库存，初始值100

	public Stock(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 增加库存
	 */
	public void increaseStock(int num){
		CURRENT_NUM=CURRENT_NUM+num;//增加库存数目。不需要调用外部方法。
		System.out.println("库存数量增加"+num+"...");
	}
	
	/**
	 * 减少库存
	 */
	public void decreaseStock(int num){
	   CURRENT_NUM=CURRENT_NUM-num;//减少库存量，不需要调用外部方法。
	   System.out.println("库存数量减少"+num+"...");
	}
	
	/**
	 * 获取库存数量
	 */
	public int getStockNum(){
		System.out.println("库存数量为"+CURRENT_NUM+"...");
		return CURRENT_NUM;//获取库存量，不需要调用外部方法。
	}
	
	/**
	 * 清空库存
	 */
	public void clearStock(){
		super.mediator.exec("stock.clear");//采购不需要再采购，销售打折销售
		CURRENT_NUM=0;
	}

}

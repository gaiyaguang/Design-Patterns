package mediator;
/**
 * 中介者实现类
 */
public class Mediator extends AbstractMediator{

	@Override
	public void exec(String str, Object... objects) {//事件处理方法，处理多个对象之间的关系
		// TODO Auto-generated method stub
		if(str.equals("purchase.purchase")){//购买
			purchase((Integer)objects[0]);
		}else if(str.equals("sale.sale")){//销售
			sale((Integer)objects[0]);
		}else if(str.equals("sale.offsale")){//打折销售
			offSale();
		}else if(str.equals("stock.clear")){//清仓
			clearStock();
		}
	}
	
	/**
	 * 采购商品
	 */
	private void purchase(int num){
		int saleStatus=super.sale.getStatus();
		if(saleStatus>80){//销售情况良好
			System.out.println("采购"+num+"件商品...");
			super.stock.increaseStock(num);//仓库增加num商品
		}else{
			System.out.println("采购"+num/2+"件商品...");
			super.stock.increaseStock(num/2);//仓库增加num商品
		}
	}
	
	/**
	 * 销售商品
	 */
	private void sale(int num){
		if(super.stock.getStockNum()<num){//库存不足
			super.purchase.purchase(num);//购买num商品
		}
		System.out.println("销售"+num+"件商品...");
		super.stock.decreaseStock(num);//仓库减少num商品
	}
	
	/**
	 * 打折销售
	 */
	private void offSale(){
		int stockNum=super.stock.getStockNum();//获取仓库存量
		System.out.println("打折销售"+stockNum+"件商品"+"...");
	}
	
	/**
	 * 清仓处理
	 */
	private void clearStock(){
		super.purchase.refusePurchase();//不再购买商品
		super.sale.offSale();//打折销售
	}
}

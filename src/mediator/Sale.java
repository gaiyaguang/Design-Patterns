package mediator;

import java.util.Random;

/**
 * 销售类
 */
public class Sale extends AbstractColleague{

	public Sale(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 销售一定数目的商品
	 */
	public void sale(int num){
		super.mediator.exec("sale.sale",num);//获取库存量，如果库存不如，则要采购进行采购。
	}
	
	/**
	 * 获取销售状况
	 */
	public int getStatus(){
		Random random=new Random();
		int result=random.nextInt(100);//随机返回一个0-100的数值，0代表没人买，100代表非常畅销。本类操作，不依赖外部类，不需要放到中介者中执行。
		if(result>80){
			System.out.println("销售情况良好...");
		}else{
			System.out.println("销售情况不好...");
		}
		return result;
	}
	
	/**
	 * 打折销售
	 */
	public void offSale(){
		super.mediator.exec("sale.offsale");//采购停止采购，仓库清仓。
	}
}

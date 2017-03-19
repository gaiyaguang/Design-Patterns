package mediator;
/**
 * 抽象终结者类
 */
public abstract class AbstractMediator {
	
	protected Purchase purchase;//采购对象
	
	protected Sale sale;//销售对象
	
	protected Stock stock;//仓库对象
	
	public AbstractMediator(){
		this.purchase=new Purchase(this);
		this.sale=new Sale(this);
		this.stock=new Stock(this);
	}
	
	//中介者最重要的方法叫事件处理方法，负责处理多个对象之间的关系
	public abstract void exec(String str,Object ...objects);

}

package mediator;
/**
 * 抽象同事类，定义同事的公共部分
 */
public abstract class AbstractColleague {

	protected AbstractMediator mediator;//中介者
	
	public AbstractColleague(AbstractMediator mediator){//构造方法，传入一个中介者对象
		this.mediator=mediator;
	}
}

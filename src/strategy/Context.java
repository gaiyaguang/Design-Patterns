package strategy;
/**
 * 包装类，上下文
 */
public class Context {

	private Calculator mCalculator;//要执行的策略实例
	
	public Context(Calculator calculator){//构造函数传入具体的策略实例
		this.mCalculator=calculator;
	}
	
	public int exec(int a,int b){
		return this.mCalculator.exec(a, b);//执行具体的策略方法
	}
}

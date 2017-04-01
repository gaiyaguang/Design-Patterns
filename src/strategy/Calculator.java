package strategy;
/**
 * 抽象接口，定义每个策略或算法必须具有的方法和属性
 */
public interface Calculator {

	public int exec(int a,int b);//抽象方法，传入参与运算的数值
}

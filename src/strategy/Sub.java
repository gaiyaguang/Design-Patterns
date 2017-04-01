package strategy;
/**
 * 减法算法
 */
public class Sub implements Calculator{//实现抽象策略接口

	public int exec(int a, int b) {
		return a-b;//返回a-b的数值
	}

}

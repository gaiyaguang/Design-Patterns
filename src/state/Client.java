package state;
/**
 * 场景类
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context=new Context();//创建一个环境变量作为用户访问的对象
		context.setState(Context.STATE_CLOSING);//刚开始电梯为关闭状态
		context.open();//打开电梯门
		context.close();//关闭电梯门
		context.run();//运行电梯
		context.stop();//停止运行
		context.open();//打开电梯门
	}

}

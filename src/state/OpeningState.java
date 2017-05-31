package state;
/**
 * 电梯门打开状态
 */
public class OpeningState extends AbstractState{
	
	//完成打开电梯门相关逻辑,这里只是打印一条信息
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("打开电梯门...");
	}

	//电梯门打开，肯定不能运行，什么也不做
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//do nothing
	}

	//电梯门打开，电梯肯定是停止的，什么也不做
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		//do nothing 
	}

	//电梯门正在打开，此时可以选择关闭电梯门
	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.context.setState(Context.STATE_CLOSING);//切换环境状态
		super.context.getState().close();//调用环境的当前状态进行操作
	}

}

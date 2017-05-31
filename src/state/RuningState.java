package state;
/**
 * 电梯正在运行状态
 */
public class RuningState extends AbstractState{

	//电梯运行状态下，不能打开电梯门,什么也不做
	@Override
	public void open() {
		// TODO Auto-generated method stub
		//do nothing
	}

	//完成运行电梯相关业务逻辑,这里只是打印一行信息
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("电梯正在运行...");
	}

	//停止电梯
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.context.setState(Context.STATE_STOPING);//切换环境状态
		super.context.getState().stop();//调用环境的当前状态进行操作
	}

	//电梯运行状态下，电梯肯定是关闭的，什么也不做
	@Override
	public void close() {
		// TODO Auto-generated method stub
		//do nothing
	}

}

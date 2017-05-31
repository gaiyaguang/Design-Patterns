package state;
/**
 * 电梯门关闭状态
 */
public class ClosingState extends AbstractState{

	//打开电梯门
	@Override
	public void open() {
		// TODO Auto-generated method stub
		super.context.setState(Context.STATE_OPENING);//切换环境状态
		super.context.getState().open();//调用环境的当前状态进行操作
	}

	//电梯运行
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.context.setState(Context.STATE_RUNING);//切换环境状态
		super.context.getState().run();//调用环境的当前状态进行操作 
	}

	//电梯门关闭，肯定是停止的，什么也不做
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		//do nothing 
	}

	//完成关闭电梯门相关逻辑，这里只是打印一条信息
	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭电梯门...");
	}

}

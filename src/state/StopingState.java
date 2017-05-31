package state;
/**
 * 电梯停止状态
 */
public class StopingState extends AbstractState{

	//电梯还停止，打开电梯门
	@Override
	public void open() {
		// TODO Auto-generated method stub
		super.context.setState(Context.STATE_OPENING);//切换环境状态
		super.context.getState().open();//调用换进的当前状态进行操作
	}

	//电梯运行
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.context.setState(Context.STATE_STOPING);//切换环境状态
		super.context.getState().run();//调用换进的当前状态进行操作
	}

	//完成电梯停止相关逻辑，这里只是打印一条信息
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("停止电梯运行...");
	}

	//电梯还没停止，电梯门肯定是关闭的，什么也不做
	@Override
	public void close() {
		// TODO Auto-generated method stub
		// do nothing 
	}

}

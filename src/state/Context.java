package state;
/**
 * 环境类,用户访问接口
 * 保存当前状态
 * 声明各个状态对象的静态常量
 * 提供抽象状态定义的所有方法入口，具体执行使用委托方式
 */
public class Context {
	
	public static final OpeningState STATE_OPENING=new OpeningState();//电梯门打开状态
	public static final RuningState STATE_RUNING=new RuningState();//电梯运行状态
	public static final StopingState STATE_STOPING=new StopingState();//电梯停止状态
	public static final ClosingState STATE_CLOSING=new ClosingState();//电梯门关闭状态

	private AbstractState state;//当前状态

	//获取当前环境的状态
	public AbstractState getState() {
		return state;
	}

	//设置当前环境的状态
	public void setState(AbstractState state) {
		this.state = state;
		this.state.setContext(this);
	}
	
	//打开电梯门
	public void open(){
		this.state.open();//委托当前状态去打开电梯门
	}
	
	//运行电梯
	public void run(){
		this.state.run();//委托当前状态去运行电梯
	}
	
	//停止电梯
	public void stop(){
		this.state.stop();//委托当前状态去停止电梯运行
	}
	
	//关闭电梯门
	public void close(){
		this.state.close();//委托当前状态去关闭电梯门
	}
}

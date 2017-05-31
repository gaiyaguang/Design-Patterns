package state;
/**
 * 状态抽象类
 * 声明一个受保护的环境变量供子类访问，
 * 定义所有状态的抽象行为，供子类实现
 */
public abstract class AbstractState {

	protected Context context;//环境变量
	
	//设置当前的环境
	public void setContext(Context context) {
		this.context = context;
	}

	public abstract void open();//电梯打开
	
	public abstract void run();//电梯运行
	
	public abstract void stop();//电梯停止
	
	public abstract void close();//电梯关闭
}

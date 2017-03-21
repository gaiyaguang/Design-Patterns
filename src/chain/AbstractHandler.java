package chain;
/**
 * 处理者抽象类
 */
public abstract class AbstractHandler {
	public static final int FATHER_LEVEL_REQUEST=0;//未婚
	public static final int HUSBAND_LEVEL_REQUEST=1;//已婚
	public static final int SON_LEVEL_REQUEST=2;//夫亡
	
	private int level=0;//处理级别
	private AbstractHandler nextHander;//下一个处理者
	
	public AbstractHandler(int level){
		this.level=level;//设置处理级别
	}

	public final void handleMessage(IWomen women){//公共方法，寻找到合适的处理者.final 不可重写
		if(women.getType()==this.level){//为自己的处理级别
			this.response(women);//调用自己的处理函数
		}else{
			if(this.nextHander!=null){
				this.nextHander.handleMessage(women);//有下一个处理者，则交给下一个处理者处理
			}else{
				System.out.println("没有处理者，按不同意处理...");
			}
		}
	}
	
	public void setNext(AbstractHandler nextHandler){//设置下一级处理者
		this.nextHander=nextHandler;
	}
	
	public abstract void response(IWomen women);//处理函数,必须实现
}

package chain;
/**
 * 儿子处理者
 */
public class SonHandler extends AbstractHandler{

	public SonHandler() {
		super(AbstractHandler.SON_LEVEL_REQUEST);//设置处理级别
		// TODO Auto-generated constructor stub
	}

	@Override
	public void response(IWomen women) {//处理请求
		// TODO Auto-generated method stub
		System.out.println(women.getRequest());
		System.out.println("儿子的处理结果是:同意");
	}
}

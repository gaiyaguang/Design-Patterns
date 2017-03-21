package chain;
/**
 * 丈夫处理者
 */
public class HusbandHandler extends AbstractHandler{

	public HusbandHandler() {
		super(AbstractHandler.HUSBAND_LEVEL_REQUEST);//设置处理级别为丈夫
		// TODO Auto-generated constructor stub
	}

	@Override
	public void response(IWomen women) {//处理请求
		// TODO Auto-generated method stub
		System.out.println(women.getRequest());
		System.out.println("丈夫的处理结果是:同意");
	}

}

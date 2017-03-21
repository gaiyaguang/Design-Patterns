package chain;
/**
 * 父亲处理者
 */
public class FatherHandler extends AbstractHandler{

	public FatherHandler() {
		super(AbstractHandler.FATHER_LEVEL_REQUEST);//设置处理级别
		// TODO Auto-generated constructor stub
	}

	@Override
	public void response(IWomen women) {//处理函数，处理请求
		// TODO Auto-generated method stub
		System.out.println(women.getRequest());
		System.out.println("父亲的处理结果是：不同意...");
	}

}

package chain;
/**
 * ���Ӵ�����
 */
public class SonHandler extends AbstractHandler{

	public SonHandler() {
		super(AbstractHandler.SON_LEVEL_REQUEST);//���ô�����
		// TODO Auto-generated constructor stub
	}

	@Override
	public void response(IWomen women) {//��������
		// TODO Auto-generated method stub
		System.out.println(women.getRequest());
		System.out.println("���ӵĴ�������:ͬ��");
	}
}

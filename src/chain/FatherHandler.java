package chain;
/**
 * ���״�����
 */
public class FatherHandler extends AbstractHandler{

	public FatherHandler() {
		super(AbstractHandler.FATHER_LEVEL_REQUEST);//���ô�����
		// TODO Auto-generated constructor stub
	}

	@Override
	public void response(IWomen women) {//����������������
		// TODO Auto-generated method stub
		System.out.println(women.getRequest());
		System.out.println("���׵Ĵ������ǣ���ͬ��...");
	}

}

package chain;
/**
 * �ɷ�����
 */
public class HusbandHandler extends AbstractHandler{

	public HusbandHandler() {
		super(AbstractHandler.HUSBAND_LEVEL_REQUEST);//���ô�����Ϊ�ɷ�
		// TODO Auto-generated constructor stub
	}

	@Override
	public void response(IWomen women) {//��������
		// TODO Auto-generated method stub
		System.out.println(women.getRequest());
		System.out.println("�ɷ�Ĵ�������:ͬ��");
	}

}

package facade;
/**
 * д��ʵ����
 * @author 77473
 *
 */
public class LetterProcessImpl implements ILetterProcess{

	public void writeContext(String context) {
		// TODO Auto-generated method stub
		System.out.println("��д�ŵ�����:"+context);
	}

	public void writeEnvelope(String address) {
		// TODO Auto-generated method stub
		System.out.println("��д�ռ��˵�ַ������:"+address);
	}

	public void putLetterIntoEnvelope() {
		// TODO Auto-generated method stub
		System.out.println("���ŷ����ŷ���...");
	}

	public void sendLetter() {
		// TODO Auto-generated method stub
		System.out.println("�ʼ��ż�....");
	}

}

package facade;
/**
 * �ִ��ʾ���
 * @author 77473
 *
 */
public class ModernPostOffice {

	private ILetterProcess letterProcess=new LetterProcessImpl();
	private Police police=new Police();//��������
	
	//д�ţ���װ��Ͷ��һ�廯
	public void sendLetter(String context,String address){
		//д�ŵ�����
		letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to..");
		//д�ŷ��ַ
		letterProcess.writeEnvelope("Happy Road No. 666,God Province,Heaven");
		police.checkLetter(letterProcess);//�����������ŵ�����ʱ�򽡿�
		//���ŷ����ŷ�
		letterProcess.putLetterIntoEnvelope();
		//�ʵ��ż�
		letterProcess.sendLetter();
	}
}

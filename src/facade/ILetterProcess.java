package facade;
/**
 * д�Žӿ�
 * @author 77473
 *
 */
public interface ILetterProcess {
	
	public void writeContext(String context);//д�ŵ�����
	
	public void writeEnvelope(String address);//д�ŷ��ַ
	
	public void putLetterIntoEnvelope();//���ŷ����ŷ�
	
	public void sendLetter();//����

}

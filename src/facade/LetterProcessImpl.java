package facade;
/**
 * 写信实现类
 * @author 77473
 *
 */
public class LetterProcessImpl implements ILetterProcess{

	public void writeContext(String context) {
		// TODO Auto-generated method stub
		System.out.println("填写信的内容:"+context);
	}

	public void writeEnvelope(String address) {
		// TODO Auto-generated method stub
		System.out.println("填写收件人地址及姓名:"+address);
	}

	public void putLetterIntoEnvelope() {
		// TODO Auto-generated method stub
		System.out.println("将信放入信封中...");
	}

	public void sendLetter() {
		// TODO Auto-generated method stub
		System.out.println("邮寄信件....");
	}

}

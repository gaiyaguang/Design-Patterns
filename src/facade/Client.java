package facade;
/**
 * ≥°æ∞¿‡
 * @author 77473
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ILetterProcess letterProcess=new LetterProcessImpl();
		letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to..");
		letterProcess.writeEnvelope("Happy Road No. 666,God Province,Heaven");
		letterProcess.putLetterIntoEnvelope();
		letterProcess.sendLetter();*/
		ModernPostOffice office=new ModernPostOffice();
		office.sendLetter("Hello,It's me,do you know who I am? I'm your old lover. I'd like to..", "Happy Road No. 666,God Province,Heaven");
	}

}

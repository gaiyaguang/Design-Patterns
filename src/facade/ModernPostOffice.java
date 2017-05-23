package facade;
/**
 * 现代邮局类
 * @author 77473
 *
 */
public class ModernPostOffice {

	private ILetterProcess letterProcess=new LetterProcessImpl();
	private Police police=new Police();//警察叔叔
	
	//写信，封装，投递一体化
	public void sendLetter(String context,String address){
		//写信的内容
		letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to..");
		//写信封地址
		letterProcess.writeEnvelope("Happy Road No. 666,God Province,Heaven");
		police.checkLetter(letterProcess);//警察叔叔检查信的内容时候健康
		//将信放入信封
		letterProcess.putLetterIntoEnvelope();
		//邮递信件
		letterProcess.sendLetter();
	}
}

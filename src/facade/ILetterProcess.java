package facade;
/**
 * 写信接口
 * @author 77473
 *
 */
public interface ILetterProcess {
	
	public void writeContext(String context);//写信的内容
	
	public void writeEnvelope(String address);//写信封地址
	
	public void putLetterIntoEnvelope();//将信放入信封
	
	public void sendLetter();//寄信

}

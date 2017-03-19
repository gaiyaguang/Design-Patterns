package clone;

import java.util.Random;

/**
 * 场景类,发送邮件
 */
public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int MAX_COUNT=5;//发送邮件的最大数量
		Mail mail=new Mail(new MailTemplate());//新建一个Mail实例，此实例含有公共的属性
		int i=0;
		while(i<MAX_COUNT){
			Mail cloneMail=(Mail) mail.clone();//通过克隆方式一个新的Mail实例
			cloneMail.setReceiver(getRandomStr(5)+"@"+getRandomStr(8)+".com");//改变mail实例的个性部分
			sendMail(cloneMail);
			i++;
		}
	}
	
	/**
	 * 发送邮件
	 */
	private static void sendMail(Mail mail){
		System.out.println("标题："+mail.getTitle()+"\t内容："+mail.getContent()+"\t收件人："+mail.getReceiver()+"\t"+mail.getAppelcation()+"\t"+mail.getTail()+"\t发送成功...");
	}
	
	/**
	 * 获取一串随机字符
	 */
	private static String getRandomStr(int count){
		StringBuilder strBuilder=new StringBuilder();
		String origin="agakgahgadhgjkkhgauoiqrhiagnaigqergk";
		Random random=new Random();
		int i=0;
		while(i<count){
			strBuilder.append(origin.charAt(random.nextInt(origin.length())));
			i++;
		}
		return strBuilder.toString();
	}

}

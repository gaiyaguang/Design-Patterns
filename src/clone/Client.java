package clone;

import java.util.Random;

/**
 * ������,�����ʼ�
 */
public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int MAX_COUNT=5;//�����ʼ����������
		Mail mail=new Mail(new MailTemplate());//�½�һ��Mailʵ������ʵ�����й���������
		int i=0;
		while(i<MAX_COUNT){
			Mail cloneMail=(Mail) mail.clone();//ͨ����¡��ʽһ���µ�Mailʵ��
			cloneMail.setReceiver(getRandomStr(5)+"@"+getRandomStr(8)+".com");//�ı�mailʵ���ĸ��Բ���
			sendMail(cloneMail);
			i++;
		}
	}
	
	/**
	 * �����ʼ�
	 */
	private static void sendMail(Mail mail){
		System.out.println("���⣺"+mail.getTitle()+"\t���ݣ�"+mail.getContent()+"\t�ռ��ˣ�"+mail.getReceiver()+"\t"+mail.getAppelcation()+"\t"+mail.getTail()+"\t���ͳɹ�...");
	}
	
	/**
	 * ��ȡһ������ַ�
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

package clone;

import java.util.ArrayList;

/**
 * �ʼ��࣬����һ���ʼ�����������.ʵ��Cloneable�ӿڣ���дclone������
 */
public class Mail implements Cloneable{

	private String receiver;//�ʼ�������
	
	private String appelcation;//��ν��Ůʿ/����
	
	private String title;//�ʼ�����
	
	private String content;//�ʼ�����
	
	private String tail;//�ʼ�ĩβ��XXX��Ȩ����
	
	private ArrayList<String> arrayList=new ArrayList<String>(){};
	
	public Mail(MailTemplate template){//�������Դ�ģ�����л�ȡ
		if(template!=null){
			this.title=template.getTitle();
			this.appelcation=template.getAppelcation();
			this.content=template.getContent();
			this.tail=template.getTail();
		}
	}
	
	@Override
	protected Object clone(){
		// TODO Auto-generated method stub
		Mail mail=null;
		try {
			mail=(Mail) super.clone();
			mail.arrayList=(ArrayList<String>) this.arrayList.clone();//Object��clone����������ǳ�������������´�����Ա�����в��ɱ�����飬���ö����������Ҫʵ�����������Ҫ���ÿ�������ٷֱ𿽱���
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mail;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getAppelcation() {
		return appelcation;
	}

	public void setAppelcation(String appelcation) {
		this.appelcation = appelcation;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
	
}

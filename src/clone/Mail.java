package clone;

import java.util.ArrayList;

/**
 * 邮件类，定义一封邮件的所有属性.实现Cloneable接口，复写clone方法。
 */
public class Mail implements Cloneable{

	private String receiver;//邮件接收者
	
	private String appelcation;//称谓：女士/先生
	
	private String title;//邮件名称
	
	private String content;//邮件内容
	
	private String tail;//邮件末尾：XXX版权所有
	
	private ArrayList<String> arrayList=new ArrayList<String>(){};
	
	public Mail(MailTemplate template){//公共属性从模板类中获取
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
			mail.arrayList=(ArrayList<String>) this.arrayList.clone();//Object的clone（）方法是浅拷贝方法，不会拷贝类成员变量中不可变的数组，引用对象变量。若要实现深拷贝，则需要针对每个变量再分别拷贝。
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

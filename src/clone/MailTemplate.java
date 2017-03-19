package clone;
/**
 * 邮件模板类，定义邮件中的公共属性
 */
public class MailTemplate {
	
	private String title="xx银行国庆信用卡抽奖活动";//标题
	
	private String appelcation="先生（女士）";//称谓
	
	private String content="国庆抽奖活动通知:只要刷卡就送100万...";//内容
	
	private String tail="xx银行版权所有";//尾部

	public String getTitle() {
		return this.title;
	}
	
	public String getAppelcation(){
		return this.appelcation;
	}
	public String getContent(){
		return this.content;
	}

	public String getTail() {
		return this.tail;
	}

}

package memento;
/**
 * 备份类
 */
public class Memento {
	
	private String text;//备份文本
	
	//构造方法
	public Memento(String text) {
		super();
		this.text = text;
	}

	//获取备份文本
	public String getText() {
		return text;
	}

	//设置备份文本
	public void setText(String text) {
		this.text = text;
	}
	

}

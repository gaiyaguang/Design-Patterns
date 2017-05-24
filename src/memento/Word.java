package memento;
/**
 * 文档类
 */
public class Word {
	
	private String text;//文本
	
	//获取文本内容
	public String getText() {
		return text;
	}
	
	//设置文本内容
	public void setText(String text) {
		this.text = text;
	}

	//创建备份
	public Memento createMemento(String text){
		return new Memento(text);//新建一个备份对象，并返回
	}
	
	//从备份中恢复文本
	public void restoreText(Memento memento){
		this.setText(memento.getText());
	}

}

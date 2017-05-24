package memento;
/**
 * 实现Cloneable接口，既是发起者角色，也是备忘录角色
 */
public class CloneableWord implements Cloneable{

    private String text;//文本
	
	private CloneableWord backup;//备份
	
	//获取文本内容
	public String getText() {
		return text;
	}
	
	//设置文本内容
	public void setText(String text) {
		this.text = text;
	}

	//创建备份
	public void createMemento(){
		this.backup=(CloneableWord) this.clone();
	}
	
	//从备份中恢复文本
	public void restoreText(){
		this.setText(this.backup.getText());
	}

	@Override
	protected Object clone() {
		try{
			return (CloneableWord)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return null;
	}
}

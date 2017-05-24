package memento;
/**
 * ʵ��Cloneable�ӿڣ����Ƿ����߽�ɫ��Ҳ�Ǳ���¼��ɫ
 */
public class CloneableWord implements Cloneable{

    private String text;//�ı�
	
	private CloneableWord backup;//����
	
	//��ȡ�ı�����
	public String getText() {
		return text;
	}
	
	//�����ı�����
	public void setText(String text) {
		this.text = text;
	}

	//��������
	public void createMemento(){
		this.backup=(CloneableWord) this.clone();
	}
	
	//�ӱ����лָ��ı�
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

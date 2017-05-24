package memento;
/**
 * �ĵ���
 */
public class Word {
	
	private String text;//�ı�
	
	//��ȡ�ı�����
	public String getText() {
		return text;
	}
	
	//�����ı�����
	public void setText(String text) {
		this.text = text;
	}

	//��������
	public Memento createMemento(String text){
		return new Memento(text);//�½�һ�����ݶ��󣬲�����
	}
	
	//�ӱ����лָ��ı�
	public void restoreText(Memento memento){
		this.setText(memento.getText());
	}

}

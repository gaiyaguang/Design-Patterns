package memento;
/**
 * ������
 */
public class Memento {
	
	private String text;//�����ı�
	
	//���췽��
	public Memento(String text) {
		super();
		this.text = text;
	}

	//��ȡ�����ı�
	public String getText() {
		return text;
	}

	//���ñ����ı�
	public void setText(String text) {
		this.text = text;
	}
	

}

package memento;
/**
 * ������
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneableWord word=new CloneableWord();//�½�һ���ĵ�
		word.setText("��һ���ı�");//д���һ���ı�
		System.out.println("д���ı�����ǰ�ı�:\n"+word.getText());
		word.createMemento();//����
		System.out.println("======����======");
		word.setText("��һ���ı�\n�ڶ����ı�");//д��ڶ����ı�
		System.out.println("д���ı�����ǰ�ı�:\n"+word.getText());
		word.restoreText();//�ָ��ı�
		System.out.println("�ָ�����ǰ�ı�:\n"+word.getText());
	}

}

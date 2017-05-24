package memento;
/**
 * 场景类
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneableWord word=new CloneableWord();//新建一个文档
		word.setText("第一行文本");//写入第一行文本
		System.out.println("写入文本，当前文本:\n"+word.getText());
		word.createMemento();//备份
		System.out.println("======备份======");
		word.setText("第一行文本\n第二行文本");//写入第二行文本
		System.out.println("写入文本，当前文本:\n"+word.getText());
		word.restoreText();//恢复文本
		System.out.println("恢复，当前文本:\n"+word.getText());
	}

}

package command;
/**
 * ���������
 */
public class Invoker {
	
	private Command command;//���յ�������
	
	public void setCommand(Command command){//���յ��ͻ�����������
		this.command=command;
	}
	
	public void action(){
		this.command.exec();//ִ������
	}
	
}

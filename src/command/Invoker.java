package command;
/**
 * 命令接收者
 */
public class Invoker {
	
	private Command command;//接收到的命令
	
	public void setCommand(Command command){//接收到客户发出的命令
		this.command=command;
	}
	
	public void action(){
		this.command.exec();//执行命令
	}
	
}

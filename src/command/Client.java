package command;
/**
 * 场景类
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoker invoker=new Invoker();//创建一个命令接收者
		System.out.println("------客户要求更改一个需求------");
		invoker.setCommand(new RequirementChangeCommand());//接受命令
		invoker.action();//执行命令
		System.out.println("------客户要求增加一个页面------");
		invoker.setCommand(new AddPageCommand());//接受命令
		invoker.action();//执行命令
	}

}

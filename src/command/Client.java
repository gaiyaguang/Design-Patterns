package command;
/**
 * ������
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoker invoker=new Invoker();//����һ�����������
		System.out.println("------�ͻ�Ҫ�����һ������------");
		invoker.setCommand(new RequirementChangeCommand());//��������
		invoker.action();//ִ������
		System.out.println("------�ͻ�Ҫ������һ��ҳ��------");
		invoker.setCommand(new AddPageCommand());//��������
		invoker.action();//ִ������
	}

}

package visitor;

import java.util.ArrayList;

/**
 * ������
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<AbstractEmployee> employees=new ArrayList<AbstractEmployee>();//ְ������
		AbstractEmployee employee0=new CommonEmployee("����","��",10000,"����IOS�˵Ŀ�������");
		AbstractEmployee employee1=new CommonEmployee("κͥ��","��",13000,"����Android�˵Ŀ�������");
		AbstractEmployee employee2=new ManagerEmployee("����","��",15000,"��Ŀ�Ѿ��ɹ�����,��������Ҫ�����Ż�");
		employees.add(employee0);
		employees.add(employee1);
		employees.add(employee2);
		//��������ְ������
		for(AbstractEmployee employee:employees){
			employee.visit(new Visitor());//Visitor���ʸ���ְ������
		}
	}

}

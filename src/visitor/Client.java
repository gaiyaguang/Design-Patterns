package visitor;

import java.util.ArrayList;

/**
 * 场景类
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<AbstractEmployee> employees=new ArrayList<AbstractEmployee>();//职工集合
		AbstractEmployee employee0=new CommonEmployee("张涛","男",10000,"负责IOS端的开发工作");
		AbstractEmployee employee1=new CommonEmployee("魏庭聪","男",13000,"负责Android端的开发工作");
		AbstractEmployee employee2=new ManagerEmployee("冯适","男",15000,"项目已经成功上线,接下来主要完善优化");
		employees.add(employee0);
		employees.add(employee1);
		employees.add(employee2);
		//遍历所有职工对象
		for(AbstractEmployee employee:employees){
			employee.visit(new Visitor());//Visitor访问各个职工对象
		}
	}

}

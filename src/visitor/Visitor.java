package visitor;
/**
 * 访问者实现类
 */
public class Visitor implements IVisitor{

	//访问普通职工
	public void visit(CommonEmployee employee) {
		// TODO Auto-generated method stub
		System.out.println("普通职工:"+" 姓名："+employee.getName()+" ,性别："+employee.getSex()+" ,工作："+employee.getJob());//打印普通职工者的信息
	}

	//访问管理者职工
	public void visit(ManagerEmployee employee) {
		// TODO Auto-generated method stub
		System.out.println("管理员职工:"+" 姓名："+employee.getName()+" ,性别："+employee.getSex()+" ,业绩："+employee.getPerformance());//打印普通职工者的信息
	}

}

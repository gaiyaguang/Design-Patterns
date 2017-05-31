package visitor;
/**
 * 访问者接口类
 */
public interface IVisitor {

	//访问普通职工
	public void visit(CommonEmployee employee);
	
	//访问管理者职工
	public void visit(ManagerEmployee employee);
}

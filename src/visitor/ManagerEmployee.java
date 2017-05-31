package visitor;
/**
 * ������ְ��
 */
public class ManagerEmployee extends AbstractEmployee{
	
	private String performance;//ҵ��
	
	public ManagerEmployee(String name, String sex, int salary,String performance) {
		super(name, sex, salary);
		this.performance=performance;
		// TODO Auto-generated constructor stub
	}
	
	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	@Override
	public void visit(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);//��������߷����Լ�
	}

}

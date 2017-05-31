package visitor;
/**
 * �չ�ְ��
 */
public class CommonEmployee extends AbstractEmployee{
	
	private String job;//����
	
	public CommonEmployee(String name, String sex, int salary,String job) {
		super(name, sex, salary);
		this.job=job;
		// TODO Auto-generated constructor stub
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public void visit(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);//��������߷����Լ�
	}
	
}

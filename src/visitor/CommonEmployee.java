package visitor;
/**
 * 普工职工
 */
public class CommonEmployee extends AbstractEmployee{
	
	private String job;//工作
	
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
		visitor.visit(this);//允许访问者访问自己
	}
	
}

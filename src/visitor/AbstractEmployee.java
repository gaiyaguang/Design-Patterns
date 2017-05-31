package visitor;
/**
 * 职工抽象类
 */
public abstract class AbstractEmployee {
	
	private String name;//姓名
	private String sex;//性别
	private int salary;//薪水
	
	
	//构造防范
	public AbstractEmployee(String name, String sex, int salary) {
		super();
		this.name = name;
		this.sex = sex;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//允许一个访问者访问
	public abstract void visit(IVisitor visitor);
	
}

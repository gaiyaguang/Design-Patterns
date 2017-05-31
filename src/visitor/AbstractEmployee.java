package visitor;
/**
 * ְ��������
 */
public abstract class AbstractEmployee {
	
	private String name;//����
	private String sex;//�Ա�
	private int salary;//нˮ
	
	
	//�������
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
	
	//����һ�������߷���
	public abstract void visit(IVisitor visitor);
	
}

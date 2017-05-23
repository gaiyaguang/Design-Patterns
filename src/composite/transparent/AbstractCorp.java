package composite.transparent;
import java.util.ArrayList;
/**
 * �����࣬������϶���͵�������Ĺ������ԣ�����
 */
public abstract class AbstractCorp {
	
	private String name;//����
	private String position;//ְλ
	private String salary;//нˮ
	
	//���췽��
	public AbstractCorp(String name,String position,String salary){
		this.name=name;
		this.position=position;
		this.salary=salary;
	}
	
	//���󷽷� ����һ���¼��ڵ�,��������֦�ڵ㣬Ҳ��������Ҷ�ڵ�
	public abstract void addSubordinate(AbstractCorp corp);
			
	//���󷽷� �������е��¼��ڵ�
	public abstract ArrayList<AbstractCorp> getAllSubordinates();
	
	//������Ϣ
	protected void getInfo(){
		System.out.println("������"+this.name+" ְλ��"+this.position+" н�ʣ�"+this.salary);
	}

}

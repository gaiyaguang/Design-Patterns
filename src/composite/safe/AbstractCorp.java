package composite.safe;

import java.util.ArrayList;

/**
 * �����࣬������֦�ڵ��Ҷ�ӽڵ�Ĺ������ԣ�����
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
	
	//������Ϣ
	protected void getInfo(){
		System.out.println("������"+this.name+" ְλ��"+this.position+" н�ʣ�"+this.salary);
	}

}

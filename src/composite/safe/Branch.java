package composite.safe;

import java.util.ArrayList;

/**
 * ��֦�ڵ���
 */
public class Branch extends AbstractCorp{
	
	private ArrayList<AbstractCorp> subordinateList=new ArrayList<AbstractCorp>();//�ӽڵ㼯��

	//���췽�������ø���Ĺ��췽��
	public Branch(String name, String position, String salary) {
		super(name, position, salary);
		// TODO Auto-generated constructor stub
	}
	
	//����һ���ӽڵ�,��������֦�ڵ㣬Ҳ��������Ҷ�ڵ�
	public void addSubordinate(AbstractCorp corp){
		if(this.subordinateList!=null){
			this.subordinateList.add(corp);
		}
	}
	
	//�������е��ӽڵ�
	public ArrayList<AbstractCorp> getAllSubordinates(){
		return this.subordinateList;
	}

}

package composite.transparent;

import java.util.ArrayList;

import composite.transparent.AbstractCorp;
/**
 * ��϶�����
 */
public class Branch extends AbstractCorp{

	private ArrayList<AbstractCorp> subordinateList=new ArrayList<AbstractCorp>();//�¼��ڵ㼯��
	
	//���췽�������ø���Ĺ��췽��
	public Branch(String name, String position, String salary) {
		super(name, position, salary);
		// TODO Auto-generated constructor stub
	}
	
	//ʵ�ֳ�����ķ��� ����һ���¼��ڵ�,��������֦�ڵ㣬Ҳ��������Ҷ�ڵ�
	@Override
	public void addSubordinate(AbstractCorp corp) {
		// TODO Auto-generated method stub
		if(this.subordinateList!=null){
			this.subordinateList.add(corp);
		}
	}

	//ʵ�ֳ�����ķ��� �������е��¼��ڵ�
	@Override
	public ArrayList<AbstractCorp> getAllSubordinates() {
		// TODO Auto-generated method stub
		return this.subordinateList;
	}

}

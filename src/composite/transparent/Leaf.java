package composite.transparent;

import java.util.ArrayList;

/**
 * Ҷ�ӽڵ�
 */
public class Leaf extends AbstractCorp{

	//���췽�������ø���Ĺ��췽��
	public Leaf(String name, String position, String salary) {
		super(name, position, salary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * ʵ�ֳ�����ķ�����Ҷ�ӽڵ㲻��������ӽڵ㣬����
	 * @Deprecatedע�⣬��ʾ��������ʹ�á�,
	 * ������ʵ���׳�һ��UnsupportedOperationException�쳣
	 */
	@Deprecated
	@Override
	public void addSubordinate(AbstractCorp corp){
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();////��ʵ��,ֱ������һ��"��֧������"�쳣
	}

	/**
	 * ʵ�ֳ�����ķ�����Ҷ�ӽڵ㲻�����κ��ӽڵ㣬����
	 * @Deprecatedע�⣬��ʾ��������ʹ�á�,
	 * ������ʵ���׳�һ��UnsupportedOperationException�쳣
	 */
	@Deprecated
	@Override
	public ArrayList<AbstractCorp> getAllSubordinates() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();////��ʵ��,ֱ������һ��"��֧������"�쳣
	}

}

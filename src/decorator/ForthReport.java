package decorator;
/**
 * ���꼶�ɼ���
 */
public class ForthReport extends AbstractReport{

	@Override
	public void report() {//չʾ�ɼ�
		// TODO Auto-generated method stub
		System.out.println("�𾴵�xxx�ҳ�");
		System.out.println(".............");
		System.out.println("����87 ��ѧ 73 Ӣ�� 67");
		System.out.println(".............");
	}

	@Override
	public void sign(String name) {//�ҳ�ǩ��
		// TODO Auto-generated method stub
		System.out.println("�ҳ�ǩ��Ϊ��"+name);
	}

}

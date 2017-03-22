package decorator;
/**
 * 四年级成绩单
 */
public class ForthReport extends AbstractReport{

	@Override
	public void report() {//展示成绩
		// TODO Auto-generated method stub
		System.out.println("尊敬的xxx家长");
		System.out.println(".............");
		System.out.println("语文87 数学 73 英语 67");
		System.out.println(".............");
	}

	@Override
	public void sign(String name) {//家长签名
		// TODO Auto-generated method stub
		System.out.println("家长签名为："+name);
	}

}

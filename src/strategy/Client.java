package strategy;
/**
 * ������
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		args=new String[]{"37","symbol_add","43"};
		int a=Integer.parseInt(args[0]);//�����㷨����ֵ
		String symbol=args[1];//�㷨���Ա�ʶ
		int b=Integer.parseInt(args[2]);//�����㷨����ֵ
		Context context=null;//��װ��ʵ��
		String tag="";//�㷨�ķ���
		if(symbol.equals("symbol_add")){//�����㷨��ʶ�жϾ����㷨
			context=new Context(new Add());//���ӷ��㷨���Դ��ݸ���װ��
			tag="+";
		}else if(symbol.equals("symbol_sub")){
			context=new Context(new Sub());//�������㷨���Դ��ݸ���װ��
			tag="-";
		}
		if(context!=null){
			System.out.println(a+tag+b+"="+context.exec(a, b));//�ϲ�ģ��ֻ�����context��ִ�з���,context������þ���ִ�в���
		}
	}

}

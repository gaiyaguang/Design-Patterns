package strategy;
/**
 * 场景类
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		args=new String[]{"37","symbol_add","43"};
		int a=Integer.parseInt(args[0]);//参与算法的数值
		String symbol=args[1];//算法策略标识
		int b=Integer.parseInt(args[2]);//参与算法的数值
		Context context=null;//封装类实例
		String tag="";//算法的符号
		if(symbol.equals("symbol_add")){//根据算法标识判断具体算法
			context=new Context(new Add());//将加法算法策略传递给封装类
			tag="+";
		}else if(symbol.equals("symbol_sub")){
			context=new Context(new Sub());//将减法算法策略传递给封装类
			tag="-";
		}
		if(context!=null){
			System.out.println(a+tag+b+"="+context.exec(a, b));//上层模块只需调用context的执行方法,context负责调用具体执行策略
		}
	}

}

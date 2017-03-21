package chain;
/**
 * 女子类
 */
public class Women implements IWomen{
	
	private int type;//女子婚姻情况 0未婚 1出嫁 2夫死
	
	private String request;//请求字符串
	
	public Women(int type,String request){//构造函数，传入个人婚姻情况和请求字符串
		this.type=type;
		switch(this.type){
		case 0:
			this.request="女儿的请求："+request;
			break;
		case 1:
			this.request="妻子的请求："+request;
			break;
		case 2:
			this.request="母亲的请求："+request;
			break;
			default:
				this.request=request;
				break;
		}
		
	}

	public int getType() {//获取个人婚姻情况
		// TODO Auto-generated method stub
		return this.type;
	}

	public String getRequest() {//获取请求字符串
		// TODO Auto-generated method stub
		return this.request;
	}

}

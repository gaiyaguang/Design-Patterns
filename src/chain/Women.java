package chain;
/**
 * Ů����
 */
public class Women implements IWomen{
	
	private int type;//Ů�ӻ������ 0δ�� 1���� 2����
	
	private String request;//�����ַ���
	
	public Women(int type,String request){//���캯����������˻�������������ַ���
		this.type=type;
		switch(this.type){
		case 0:
			this.request="Ů��������"+request;
			break;
		case 1:
			this.request="���ӵ�����"+request;
			break;
		case 2:
			this.request="ĸ�׵�����"+request;
			break;
			default:
				this.request=request;
				break;
		}
		
	}

	public int getType() {//��ȡ���˻������
		// TODO Auto-generated method stub
		return this.type;
	}

	public String getRequest() {//��ȡ�����ַ���
		// TODO Auto-generated method stub
		return this.request;
	}

}

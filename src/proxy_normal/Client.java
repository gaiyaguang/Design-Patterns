package proxy_normal;
/**
 * ��ͨ�����ͻ���ֻ�ܷ��ʴ����ɫ�����ܷ�����ʵ��ɫ
 */
public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamePlayer gamePlayer=new GamePlayer();//��ʵ���
		GameProxy gameProxy=new GameProxy(gamePlayer);//�������
		gameProxy.login("whiteLoyal","123456");//��¼
		gameProxy.killBoss();//ɱ��
		gameProxy.update();//����
	}
}

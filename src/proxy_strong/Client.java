package proxy_strong;
/**
 * ǿ�ƴ����ͻ��˱������ʵ��ɫ�������ָ���Ĵ���Ȼ����ͨ�����������ʵ��ɫ
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamePlayer gamePlayer=new GamePlayer();
		GameProxy gameProxy=(GameProxy) gamePlayer.getProxy();
		gameProxy.login("whiteLoyal","123456");
		gameProxy.killBoss();
		gameProxy.update();
	}

}

package proxy_dynamic;

import proxy_dynamic.IGamePlayer;
/**
 * ��Ϸ��ҽӿڣ�������Ϸ��ҵĻ�����Ϊ
 */
public interface IGamePlayer {

	public void login(String name,String password);//��½��Ϸ
	
	public void killBoss();//ɱ��
	
	public void update();//����
	
}

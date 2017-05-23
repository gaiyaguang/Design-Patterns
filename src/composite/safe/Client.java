package composite.safe;

import java.util.ArrayList;
/**
 * ������
 */
public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch ceo=new Branch("�½���","�ܾ���","200w");//�ܾ���
		Branch techDirector=new Branch("���¾�","�����ܼ�","100w");//�����ܼ�
		techDirector.addSubordinate(new Leaf("����","IOS��������ʦ","20k"));//ios��������ʦ
		techDirector.addSubordinate(new Leaf("κͥ��","Android��������ʦ","20k"));//android��������ʦ
		techDirector.addSubordinate(new Leaf("����","PHP��������ʦ","20k"));//php��������ʦ
		Branch marketDirector=new Branch("����","�г��ܼ�","100w");//�г��ܼ�
		marketDirector.addSubordinate(new Leaf("����","�г�Ӫ��","30k"));//�г�Ӫ��
		marketDirector.addSubordinate(new Leaf("ʷ˧","�г�Ӫ��","30k"));//�г�Ӫ��
		marketDirector.addSubordinate(new Leaf("��ҫ","�г�Ӫ��","30k"));//�г�Ӫ��
		ceo.addSubordinate(techDirector);
		ceo.addSubordinate(marketDirector);
		print(ceo);//�������нڵ���Ϣ
	}
	
	/**
	 * ��ӡ���нڵ���Ϣ
	 * @param root ���ڵ�
	 */
	private static void print(Branch root){
		ArrayList<AbstractCorp> subordinates=root.getAllSubordinates();
		for(AbstractCorp subordinate:subordinates){
			if(subordinate instanceof Leaf){//Ҷ�ӽڵ�
				subordinate.getInfo();//��ӡҶ�ӽڵ����Ϣ
			}else{
				subordinate.getInfo();//��ӡ��֦�ڵ���Ϣ
				print((Branch)subordinate);//�ݹ������֦�ڵ�
			}
		}
	}

}

package dataStruct;

public class LinkedList implements List {
  int length;// ����ĳ���  
  Node head;// ����ͷָ�� 


  public LinkedList() {  
      head = new Node("ͷ���");// ��ʼ��ͷ��㣬��ͷָ��ָ��ͷ���
      length = 0; 
      head.next = null;
  }  
  /** ������ĩβ���һ��Ԫ�� */
  public void addElement(Node node) {
      Node  lastNode = head;
      while(lastNode.next != null) 
      {
        lastNode = lastNode.next;
      }
      lastNode.next = node;
      length++;
  }
  /** ���������ض�λ�����һ��Ԫ��,Ĭ��indexΪ1��ʼ����*/ 
  public void insert(int index,Node node) {
    if(index <= 0 || index > length) {
      System.out.println("������Χ");
    }
    else {
        Node  breakNode = head;
        for(int i = 0;i < index-1;i++) {//�ҵ�index��ǰһ���ڵ�
            breakNode = breakNode.next;
            }
        Node nextNode = breakNode.next;//�ҵ�����indexλ�õĽڵ�
        node.next = nextNode; //���ýڵ�����Ϊ����ڵ�ĺ��ýڵ�
        breakNode.next = node;//������Ľڵ���Ϊindexǰһ���ڵ�ĺ��ýڵ�
        }
        length++;
    }
  /** ������ĩβɾ��Ԫ�� */
  public void removeLastElement() 
  {
    if(length == 0)
      System.out.println("�Ѿ�����̳��ȣ�����ɾ��");
    else {
      Node lastNode  = head;
      while(lastNode.next != null && lastNode.next.next!=null) 
      {//һֱ�ҵ�ĩβǰ��һ���ڵ�
        lastNode = lastNode.next;
      }
      lastNode.next = null;
      System.out.println(lastNode);
      length--;
    }
  }
  /**��ָ��λ��ɾ��Ԫ��,Ĭ��index��1��ʼ����*/
  public void delete(int index) 
  {
    if(index <= 0)
      System.out.println("������Χ");
    else 
    {
      if(index <=length) {
      Node breakNode = head;
      for(int i = 0;i < index-1;i++) 
      {
        breakNode = breakNode.next; //�ҵ�����indexǰһ���ڵ�
      }
      Node node = breakNode.next.next;//�ҵ�����index�ĺ�һ���ڵ�
      breakNode.next = node;    //���ýڵ�����Ϊindexǰһ���ڵ�ĺ��ýڵ�
      }
    }   
      length--;
  }
  /*��λ��index�Ľڵ�*/
  public Node get(int index) {
    Node  breakNode = head;
    for(int i = 0;i <= index;i++) {//�ҵ�index��ǰһ���ڵ�
        breakNode = breakNode.next;
        }
   return breakNode;
  }
 
  @Override
  public String toString() {
    String str = "";
    Node node = head;
    for(int i = 0;i <= length; i++) 
    {
      str += node.data+"--";
      node = node.next;
    }
    return str;
  }
}

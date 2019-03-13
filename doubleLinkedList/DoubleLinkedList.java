package doubleLinkeslist;
/**
 * ˫����
 * @author admin
 *
 */
public class DoubleLinkedList implements List{
  int length;//������
  Node head; //ͷָ��
  Node currentNode;//��ǰ���
  public DoubleLinkedList() {
    head = new Node("ͷ���");// ��ʼ��ͷ��㣬��ͷָ��ָ��ͷ���
    this.length = 0;
  }
  /**������ĩβ����Ԫ��*/
  public void addElement(Node node) {
    Node lastNode = head;
    while(lastNode.next != null)
      lastNode = lastNode.next;
    lastNode.next = node;
    node.prior = lastNode;
    length++;
  }

  
  /* index��0��ʼ���� */
  public void insert(int index, Node node) {
    if (index < 0 || index > length-1) {
      System.out.println("������Χ");
      return;
    }
    //��λ����ǰ���
    index(index);
    node.next = currentNode;
    node.prior = currentNode.prior;
    currentNode.prior.next = node;
    currentNode.prior = node;
    length++;

    /*while(breakNode.next != currentNode)//�ҵ���ǰ�ڵ��ǰһ�����
        breakNode = breakNode.next;
      node.prior  = breakNode;
      node.next = breakNode.next;
      breakNode.next.prior = node;
      breakNode.next = node;*/
    /*else if (index == 0) {//��һ�ڵ�Ϊͷ���
      node.next = breakNode.next;
      breakNode.next = node;
      node.prior = head;
      length++;
      return;
    }
    for(int i = 0 ; i <= index - 1;i++) {//�ҵ��ýڵ��ǰһ�ڵ�
      breakNode = breakNode.next;
      node.next = breakNode.next;
      breakNode.next = node;
      node.prior = breakNode;
      length++;
    } */
    
  }
  /**ɾ�����һ���ڵ�*/
  public void removeLastElement() {
    Node lastNode = head;
    while(lastNode.next != null ) //�ҵ����һ���ڵ�
      lastNode = lastNode.next;
    Node preNode = lastNode.prior;//�ҵ����ڵ��ǰһ���ڵ�
    preNode.next = null;          //���ýڵ����һ���ڵ���Ϊnull
    length--;
  }
  /*ɾ��ָ��λ�ýڵ�*/
  @Override
  public void delete(int index) {
    index(index);//��λ����ǰ�ڵ�
    currentNode.prior.next = currentNode.next;
    currentNode.next.prior = currentNode.prior;
    length--;
  }

  /*��ȡ��index���ڵ㣬index��0��ʼ����*/
  public Node get(int index) {
    index(index);
    return currentNode;
  }
  /** ��λ����ǰ���*/
  public void index(int index) {
    if(index < 0 || index > length-1)
      System.out.println("������Χ");
    Node breakNode = head;
    for(int i = 0;i <= index;i++)
      breakNode = breakNode.next;
    currentNode = breakNode;
  }

}

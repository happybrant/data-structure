package dataStruct;

public class TestLinkedList {
  public static void main(String[] args) {

    LinkedList linkedList = new LinkedList();
    Operation operation = new Operation();
    Node node1 = new Node("��һ���ڵ�");
    Node node2 = new Node("�ڶ����ڵ�");
    Node node3 = new Node("�������ڵ�");
    Node node4 = new Node("���ĸ��ڵ�");
    Node node5 = new Node("����ڵ�");
    linkedList.addElement(node1);
    linkedList.addElement(node2);
    linkedList.addElement(node3);
    linkedList.addElement(node4);
    System.out.println(operation.judgeLoop2(linkedList));
    /* System.out.println("����֮ǰ--"+linkedList);
       linkedList.insert(node5,1);
    System.out.println("����֮��--"+linkedList);
    //linkedList.deleteLastElement();
    //System.out.println("ɾ�����ڵ��"+linkedList);   
    linkedList.deleteElement(1);
    System.out.println("ɾ��ָ���ڵ��--"+linkedList);
    System.out.println(linkedList.index(3).next);*/
    
  }
}

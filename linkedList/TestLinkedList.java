package dataStruct;

public class TestLinkedList {
  public static void main(String[] args) {

    LinkedList linkedList = new LinkedList();
    Operation operation = new Operation();
    Node node1 = new Node("第一个节点");
    Node node2 = new Node("第二个节点");
    Node node3 = new Node("第三个节点");
    Node node4 = new Node("第四个节点");
    Node node5 = new Node("插入节点");
    linkedList.addElement(node1);
    linkedList.addElement(node2);
    linkedList.addElement(node3);
    linkedList.addElement(node4);
    System.out.println(operation.judgeLoop2(linkedList));
    /* System.out.println("插入之前--"+linkedList);
       linkedList.insert(node5,1);
    System.out.println("插入之后--"+linkedList);
    //linkedList.deleteLastElement();
    //System.out.println("删除最后节点后"+linkedList);   
    linkedList.deleteElement(1);
    System.out.println("删除指定节点后--"+linkedList);
    System.out.println(linkedList.index(3).next);*/
    
  }
}

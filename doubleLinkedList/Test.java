package doubleLinkeslist;
/**
 * ����˫����
 * @author admin
 *
 */
public class Test {
public static void main(String[] args) {
  DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
  doubleLinkedList.addElement(new Node("���һ"));
  doubleLinkedList.addElement(new Node("����"));
  doubleLinkedList.addElement(new Node("�����"));
  System.out.println("��˫���������");
  printList(doubleLinkedList);
  doubleLinkedList.insert(2, new Node("������"));
  System.out.println("���������");
  printList(doubleLinkedList);
  doubleLinkedList.delete(2);
  System.out.println("ָ�����ɾ�����");
  printList(doubleLinkedList);
  doubleLinkedList.removeLastElement();
  System.out.println("ĩβ���ɾ�����");
  printList(doubleLinkedList);
}
  public static void printList(DoubleLinkedList doubleLinkedList){
    System.out.print("null<--["+doubleLinkedList.head.data+"]<---->");
    for(int i = 0;i<doubleLinkedList.length;i++) {
      if(i == doubleLinkedList.length-1)
        System.out.println("["+doubleLinkedList.get(i).data+"]-->null");
      else
        System.out.print("["+doubleLinkedList.get(i).data+"]<---->");
    }
  }
}

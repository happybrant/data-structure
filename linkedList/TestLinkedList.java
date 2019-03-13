package dataStruct;
/**
 * ���Ե�����
 * @author admin
 *
 */
public class TestLinkedList {
  public static void main(String[] args) {

    LinkedList linkedList = new LinkedList();
    linkedList.addElement(new Node("���һ"));
    linkedList.addElement(new Node("����"));
    linkedList.addElement(new Node("�����"));
    System.out.println("�����������");
    printList(linkedList);
    linkedList.insert(2, new Node("������"));
    System.out.println("ָ�����������");
    printList(linkedList);
    linkedList.delete(2);
    System.out.println("ָ�����ɾ�����");
    printList(linkedList);
    linkedList.removeLastElement();
    System.out.println("ĩβ���ɾ�����");
    printList(linkedList);
  }
  
  public static void printList(LinkedList linkedList) {
    System.out.print("["+linkedList.head.data+"]-->");
    for(int i = 0;i < linkedList.length;i++)
      if(i == linkedList.length-1)
        System.out.println("["+linkedList.get(i).data+"]");
      else
        System.out.print("["+linkedList.get(i).data+"]-->");
  }
}

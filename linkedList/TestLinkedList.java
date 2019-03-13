package dataStruct;
/**
 * 测试单链表
 * @author admin
 *
 */
public class TestLinkedList {
  public static void main(String[] args) {

    LinkedList linkedList = new LinkedList();
    linkedList.addElement(new Node("结点一"));
    linkedList.addElement(new Node("结点二"));
    linkedList.addElement(new Node("结点三"));
    System.out.println("单链表创建完毕");
    printList(linkedList);
    linkedList.insert(2, new Node("插入结点"));
    System.out.println("指定结点插入完毕");
    printList(linkedList);
    linkedList.delete(2);
    System.out.println("指定结点删除完毕");
    printList(linkedList);
    linkedList.removeLastElement();
    System.out.println("末尾结点删除完毕");
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

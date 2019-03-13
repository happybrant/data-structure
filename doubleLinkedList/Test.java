package doubleLinkeslist;
/**
 * 测试双链表
 * @author admin
 *
 */
public class Test {
public static void main(String[] args) {
  DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
  doubleLinkedList.addElement(new Node("结点一"));
  doubleLinkedList.addElement(new Node("结点二"));
  doubleLinkedList.addElement(new Node("结点三"));
  System.out.println("新双链表创建完毕");
  printList(doubleLinkedList);
  doubleLinkedList.insert(2, new Node("插入结点"));
  System.out.println("结点插入完毕");
  printList(doubleLinkedList);
  doubleLinkedList.delete(2);
  System.out.println("指定结点删除完毕");
  printList(doubleLinkedList);
  doubleLinkedList.removeLastElement();
  System.out.println("末尾结点删除完毕");
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

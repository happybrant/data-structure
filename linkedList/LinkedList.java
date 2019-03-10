package dataStruct;

public class LinkedList implements List {
  int length;// 链表的长度  
  Node head;// 定义头指针 


  public LinkedList() {  
      head = new Node("头结点");// 初始化头结点，让头指针指向头结点
      length = 0; 
      head.next = null;
  }  
  /** 在链表末尾添加一个元素 */
  public void addElement(Node node) {
      Node  lastNode = head;
      while(lastNode.next != null) 
      {
        lastNode = lastNode.next;
      }
      lastNode.next = node;
      length++;
  }
  /** 在链表中特定位置添加一个元素,默认index为1开始计算*/ 
  public void insert(int index,Node node) {
    if(index <= 0 || index > length) {
      System.out.println("超出范围");
    }
    else {
        Node  breakNode = head;
        for(int i = 0;i < index-1;i++) {//找到index的前一个节点
            breakNode = breakNode.next;
            }
        Node nextNode = breakNode.next;//找到处于index位置的节点
        node.next = nextNode; //将该节点设置为插入节点的后置节点
        breakNode.next = node;//将插入的节点设为index前一个节点的后置节点
        }
        length++;
    }
  /** 在链表末尾删除元素 */
  public void removeLastElement() 
  {
    if(length == 0)
      System.out.println("已经是最短长度，不能删除");
    else {
      Node lastNode  = head;
      while(lastNode.next != null && lastNode.next.next!=null) 
      {//一直找到末尾前的一个节点
        lastNode = lastNode.next;
      }
      lastNode.next = null;
      System.out.println(lastNode);
      length--;
    }
  }
  /**在指定位置删除元素,默认index从1开始计算*/
  public void delete(int index) 
  {
    if(index <= 0)
      System.out.println("超出范围");
    else 
    {
      if(index <=length) {
      Node breakNode = head;
      for(int i = 0;i < index-1;i++) 
      {
        breakNode = breakNode.next; //找到处于index前一个节点
      }
      Node node = breakNode.next.next;//找到处于index的后一个节点
      breakNode.next = node;    //将该节点设置为index前一个节点的后置节点
      }
    }   
      length--;
  }
  /*定位到index的节点*/
  public Node get(int index) {
    Node  breakNode = head;
    for(int i = 0;i <= index;i++) {//找到index的前一个节点
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

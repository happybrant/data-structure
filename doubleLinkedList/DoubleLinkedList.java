package doubleLinkeslist;
/**
 * 双链表
 * @author admin
 *
 */
public class DoubleLinkedList implements List{
  int length;//链表长度
  Node head; //头指针
  Node currentNode;//当前结点
  public DoubleLinkedList() {
    head = new Node("头结点");// 初始化头结点，让头指针指向头结点
    this.length = 0;
  }
  /**在链表末尾插入元素*/
  public void addElement(Node node) {
    Node lastNode = head;
    while(lastNode.next != null)
      lastNode = lastNode.next;
    lastNode.next = node;
    node.prior = lastNode;
    length++;
  }

  
  /* index从0开始计算 */
  public void insert(int index, Node node) {
    if (index < 0 || index > length-1) {
      System.out.println("超出范围");
      return;
    }
    //定位到当前结点
    index(index);
    node.next = currentNode;
    node.prior = currentNode.prior;
    currentNode.prior.next = node;
    currentNode.prior = node;
    length++;

    /*while(breakNode.next != currentNode)//找到当前节点的前一个结点
        breakNode = breakNode.next;
      node.prior  = breakNode;
      node.next = breakNode.next;
      breakNode.next.prior = node;
      breakNode.next = node;*/
    /*else if (index == 0) {//上一节点为头结点
      node.next = breakNode.next;
      breakNode.next = node;
      node.prior = head;
      length++;
      return;
    }
    for(int i = 0 ; i <= index - 1;i++) {//找到该节点的前一节点
      breakNode = breakNode.next;
      node.next = breakNode.next;
      breakNode.next = node;
      node.prior = breakNode;
      length++;
    } */
    
  }
  /**删除最后一个节点*/
  public void removeLastElement() {
    Node lastNode = head;
    while(lastNode.next != null ) //找到最后一个节点
      lastNode = lastNode.next;
    Node preNode = lastNode.prior;//找到最后节点的前一个节点
    preNode.next = null;          //将该节点的下一个节点设为null
    length--;
  }
  /*删除指定位置节点*/
  @Override
  public void delete(int index) {
    index(index);//定位到当前节点
    currentNode.prior.next = currentNode.next;
    currentNode.next.prior = currentNode.prior;
    length--;
  }

  /*获取第index个节点，index从0开始计算*/
  public Node get(int index) {
    index(index);
    return currentNode;
  }
  /** 定位到当前结点*/
  public void index(int index) {
    if(index < 0 || index > length-1)
      System.out.println("超出范围");
    Node breakNode = head;
    for(int i = 0;i <= index;i++)
      breakNode = breakNode.next;
    currentNode = breakNode;
  }

}

package doubleLinkeslist;

public class Node {
  String data;//数据域
  Node next;//后继节点
  Node prior;//前驱节点

  public Node(String data) {  
    this.data = data;  
    this.next = null;
    this.prior = null;
}
  @Override
  public String toString() {
    return "Node [data=" + data +"]";
  }
}

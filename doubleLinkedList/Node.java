package doubleLinkeslist;

public class Node {
  String data;//������
  Node next;//��̽ڵ�
  Node prior;//ǰ���ڵ�

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

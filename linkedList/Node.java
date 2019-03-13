package dataStruct;

public class Node {
  String data;//������
  Node next;//����

  public Node(String data) {  
    this.data = data;  
    next = null;  
}
  

  @Override
  public String toString() {
    return "Node [data=" + data +"]";
  }

  public void setNext(Node next) {
    this.next = next;
  }  
  
}

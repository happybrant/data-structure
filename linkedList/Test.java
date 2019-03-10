package dataStruct;

public class Test {
public static void main(String[] args) {
 /* Node node = new Node("haha");
  //update1(node);
  Node node1 = new Node("dadaa");
  //node.next = node1;
  Node node2 = node;
  node2.data = "ccc";
   node2 = node2.next;
  node2 =null;
  System.out.println(node2);
  System.out.println(node);*/
  Game game = new Game(10, 4);
  game.play();
}
public static void update1(Node node) {
/* Node node1  = new Node("hhh");
 node = node1;*/
 node.data = "ccc";
}
}

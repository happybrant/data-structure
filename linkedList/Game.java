package dataStruct;
/**
 * 单循环链表实现游戏
 * 游戏规则：N个人围成一个圈，从第一个人开始传花，当数到M时，该人退出游戏，直到剩下最后一个人。
 * @author admin
 *
 */
public class Game {

  LinkedList linkedList = new LinkedList();
  //参与的人数
  int num;
  //数到几退出
  int key;
  public Game(int num, int key) {
    super();
    this.num = num;
    this.key = key;
  }
  public void play() {
    for(int i = 1;i <= num;i++) {
      linkedList.addElement(new Node(i+""));
    }
    System.out.println("-------游戏开始之前-------");
    printNum(linkedList);
    System.out.println("-------游戏开始-------");
    int flag = key;
    int count = num;
    for(int i = 0;i < num-1;i++) {
      linkedList.delete(flag);
      printNum(linkedList);
      if(flag + key <= count)
        flag = flag + key - 1;
      else {
        if((flag + key)%count !=0)
          flag = (flag + key)%count;
        else
          flag = count-1;
      }
      count--;
    }
  }
  
  public void printNum(LinkedList linkedList) {
    for(int i = 0;i < linkedList.length;i++) {
      if(i != linkedList.length-1)
        System.out.print(linkedList.get(i).data+",");
      else
        System.out.println(linkedList.get(i).data);  
    }
  }
}

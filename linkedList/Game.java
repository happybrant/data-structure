package dataStruct;
/**
 * ��ѭ������ʵ����Ϸ
 * ��Ϸ����N����Χ��һ��Ȧ���ӵ�һ���˿�ʼ������������Mʱ�������˳���Ϸ��ֱ��ʣ�����һ���ˡ�
 * @author admin
 *
 */
public class Game {

  LinkedList linkedList = new LinkedList();
  //���������
  int num;
  //�������˳�
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
    System.out.println("-------��Ϸ��ʼ֮ǰ-------");
    printNum(linkedList);
    System.out.println("-------��Ϸ��ʼ-------");
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

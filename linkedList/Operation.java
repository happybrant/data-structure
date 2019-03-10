package dataStruct;

public class Operation {

  /**
   * 判断是否有环，知道链表长度
   * @param linkedList
   * @return
   */
  public boolean JudgeLoop1(LinkedList linkedList) {
    Node node = linkedList.head;
    for(int i = 0;i<linkedList.length;i++) {
      node = node.next;
    }
    if(node.next == null)
      return false;
    return true;
  }
  /**
   * 不知道长度
   * @param linkedList
   * @return
   */
  public boolean judgeLoop2(LinkedList linkedList) {
    Node node1 = linkedList.head;
    Node node2 = linkedList.head;
    while(node2 != null) {
      if(node2.next == null || node2.next.next == null )
        return false;
      node1 = node1.next;
      node2 = node2.next.next;
      if(node1 == node2)
        return true;
    }
    return false;
  }
}

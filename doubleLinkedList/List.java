package doubleLinkeslist;

public interface List {

  //在链表末尾插入元素
  public void  addElement(Node node);
  //在指定位置插入元素
  public void insert(int index, Node node);
  //删除链表末尾元素
  public void removeLastElement();
  //删除指定位置元素
  public void delete(int index);
  //定位到指定元素
  public void index(int index);
  //获取指定位置元素
  public Node get(int index);
  
}

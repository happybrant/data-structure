package dataStruct;

public interface List {

  //������ĩβ����Ԫ��
  public void  addElement(Node node);
  //��ָ��λ�ò���Ԫ��
  public void insert(int index, Node node);
  //ɾ������ĩβԪ��
  public void removeLastElement();
  //ɾ��ָ��λ��Ԫ��
  public void delete(int index);
  //��ȡָ��λ��Ԫ��
  public Node get(int index);
}
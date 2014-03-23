/**
 * Created with IntelliJ IDEA.
 * User: Reigan
 * Date: 20.03.14
 * Time: 22:23
 * To change this template use File | Settings | File Templates.
 */
public interface Collections<E> {

    public boolean add(E e);
    public boolean addAll(Collections c);
    public void clear();
    public boolean contains(E e);
    public boolean containsAll(Collections c);
    public boolean equals(Object o);
    public boolean isEmpty();
  //  public boolean iterator();
    public boolean remove(E e);
    public boolean removeAll(Collections c);
    public void retainAll(Collections c);
    public int size();
    public Object get(int i);
    public boolean set(int i, E e);
    public Object[] toArray();

}

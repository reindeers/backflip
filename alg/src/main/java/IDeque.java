/**
 * Created by Reigan on 16.03.14.
 */
import java.util.Iterator;

public interface IDeque<Item> extends Iterable<Item>{
    java.util.Iterator<Item> iterator();
    public boolean isEmpty();
    public int size();
    public void pushLeft(Item item);
    public void pushRight(Item item);
    public Item popLeft();
    public Item popRight();
}

/**
 * Created with IntelliJ IDEA.
 * User: Reigan
 * Date: 20.03.14
 * Time: 22:50
 * To change this template use File | Settings | File Templates.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class SetTest {

    Set set;
    Set set2;

    @Before

    @Test
    public void testIsSetWithoutParameters(){
        set = new Set<Integer>();
    }

    @Test
    public void testIsSetWithParameter(){
        set = new Set<Integer>(1);
    }

    @Test
    public void testIsSetWithParameters(){
        set = new Set<Integer>(1, 2, 3);
        assertEquals(1, set.get(0));
    }

    @Test
    public void testIsSetWithParametersAndNotInteger(){
        set = new Set<String>("gbz", "rer");
        assertEquals("gbz", set.get(0));
    }

    @Test
    public void testAddParameter(){
        set = new Set<Integer>();
        assertEquals(true, set.add(1));
        assertEquals(false, set.add(1));

    }


    @Test
    public void testAddAllParameters(){
        set = new Set<Integer>(1, 2, 3);
        set2 = new Set<Integer>(4, 5, 6);
        assertEquals(true, set.addAll(set2));
        assertEquals(3, set.get(2));
        assertEquals(6, set.get(5));

    }


    @Test
    public void testClear(){
        set = new Set<Integer>(1, 2, 3);
        set.clear();
        assertEquals(0, set.size());

    }

    @Test
    public void testContains(){
        set = new Set<Integer>(1, 2, 3);
        set2 = new Set<Integer>(2, 3);
        assertEquals(true, set.contains(1));
        assertEquals(false, set2.contains(1));

    }

    @Test
    public void testContainsAll(){
        set = new Set<Integer>(1, 2, 3, 4);
        set2 = new Set<Integer>(1, 2);
        assertEquals(true, set.containsAll(set2));
        set2 = new Set<Integer>(1, 2, 7);
        assertEquals(false, set.containsAll(set2));
        set2 = new Set<Integer>(8, 9);
        assertEquals(false, set.containsAll(set2));


    }

    @Test
    public void testEquals(){
        set = new Set<Integer>();
      //  assertEquals(true, set.add(1));

    }

    @Test
    public void testIsEmpty(){
        set = new Set<Integer>();
        assertEquals(true, set.isEmpty());

    }

    @Test
    public void testIsNotEmpty(){
        set = new Set<Integer>(1);
        assertEquals(false, set.isEmpty());

    }

    @Test
    public void testRemove(){
        set = new Set<Integer>(1, 2, 3, 4);
        assertEquals(true, set.remove(2));
        String str = "";
        for (int i = 0; i < set.toArray().length; i++){
            str += set.get(i);
        }
        assertEquals("134", str);

    }

    @Test
    public void testRemoveAll(){
        set = new Set<Integer>(1, 2, 3, 4);
        set2 = new Set<Integer>(1, 4);
        assertEquals(true, set.remove(set2));
        String str = "";
        for (int i = 0; i < set.toArray().length; i++){
            str += set.get(i);
        }
        assertEquals("23", str);

    }

    @Test
    public void testRetainAll(){
        set = new Set<Integer>();
     //   assertEquals(true, set.add(1));

    }

    @Test
    public void testSize(){
        set = new Set<Integer>(1, 2);
        assertEquals(2, set.size());

    }

    @Test
    public void testGet(){
        set = new Set<Integer>(1, 2);
        assertEquals(2, set.get(1));

    }

    @Test
    public void testSet(){
        set = new Set<Integer>(1, 2);
        set.set(0, 1);
        assertEquals(1, set.get(0));

    }

}

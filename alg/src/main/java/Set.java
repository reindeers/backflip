/**
 * Created with IntelliJ IDEA.
 * User: Reigan
 * Date: 20.03.14
 * Time: 22:22
 * To change this template use File | Settings | File Templates.
 */

import com.sun.xml.internal.bind.v2.TODO;

import java.util.List;
//TODO: hashcode
public class Set<E> implements Collections<E>{
    private Object[] set;
    private Object[] setOld;

    public Set(){
        set =  new Object[0];
    }

    public Set(E... e){
        int len = e.length;
        set =  new Object[len];
        for (int i = 0; i < len; i++){
            set[i] = e[i] ;
        }
        //TODO: уникальность, массивыколлекции

    }
    public boolean add(E e){
        try{
            if (!isUniq(e)){return false;}
            setOld = set;
            int len = set.length;
            set = new Object[len+1];
            for (int i = 0; i < len; i++){
                set[i] = setOld[i];
            }
            set[len] = e;


            return true;
        }
        catch (Exception ex){
            return false;
        }
    };

    public boolean addAll(Collections col) {
        try{
          // TODO:  if (!isUniq(col)){return false;}
            setOld = set;
            int lenOld = set.length;
            int len = col.size();
            set = new Object[lenOld+len];
            for (int i = 0; i < lenOld; i++){
                set[i] = setOld[i];
            }
            for (int i = lenOld; i < lenOld+len; i++){
                set[i] = col.get(i-lenOld);
            // TODO: соответствие типов
            }


            return true;
        }
        catch (Exception ex){
            return false;
        }
    };

    public void clear(){
        set = new Object[0];

    };
    public boolean contains(E e){
        int count = 0;

         for (Object s: set){
             if (e.equals(s)) return true;
         }

     return false;
    };

    public boolean containsAll(Collections c){
        int count = 0;
        for (Object o: c.toArray()){
            for (Object s: set){
                if (o.equals(s)) count++;
            }
        }
        if (count == c.size()) return true;
        else return false;
    };
    public boolean equals(Object o){
        //TODO:
       /* for (Object s: set){
            for (Object oo: o){
                if (s)
            }

        }    */
        return true;
    };

    public boolean isEmpty(){
        if (set.length == 0){
        return true;
        }
        else return false;

    };
  //  public boolean iterator();
    public boolean remove(E e){
        int len = set.length;
        for (int i=0; i < len; i++){

                if (set[i].equals(e)){
                    delete(i);
                    return true;
                }

        }
        return false;


    };
    public boolean removeAll(Collections c){   //ошибка
        Object[] obj = c.toArray();
        int len = set.length;
        int count = 0;
        for (Object o: obj){
        for (int i=0; i < len; i++){

            if (set[i].equals(o)){
                delete(i);
                count ++;
            }

        }
       }
        if (count == obj.length) return true;
        return false;


    };
    public void retainAll(Collections c){};
    public int size(){
       return set.length;
    };
   public Object[] toArray(){
        return set;
    };

    public Object get(int i){
      return set[i];
    }

    public boolean set(int i, E e){
        try{
            set[i] = e;
            return  true;
        }   catch (Exception ex){
             return false;
        }

    }

    private boolean isUniq(E e){
        for (Object o: set){
          if (o.equals(e)) return false;
        }
        return true;
    }

    private void delete(int count){
       int len = set.length;
        Object[] setOld = new Object[len - 1];
       for (int i=0; i < count; i++){
            setOld[i] = set[i];
       }

       for (int i=count; i < len-1; i++){
            setOld[i] = set[i+1];
        }

        set = new Set[len - 1];
        set = setOld.clone();
    }

}

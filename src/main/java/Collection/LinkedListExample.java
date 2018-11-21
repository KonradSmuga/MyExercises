package Collection;

import java.util.LinkedList;

public class LinkedListExample {

    public void linkedList(){
     LinkedList<Integer> theList = new LinkedList<>();
     for(int n = 0; n < 1000; n++){
         theList.add(n*2);
     }
    }
}

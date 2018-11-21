package Collection;

import java.util.ArrayList;

public class IterableTest {
        public void iterableTest(){

            ArrayList<String> theList = new ArrayList<String>();
            theList.add("object 1");
            theList.add("object 2");
            theList.add("object 3");
            theList.add("object 4");
            theList.add("object 5");
            //Displaying the list using Iterable interface and for-each loop
            for(String theObject: theList){
                System.out.println(theObject);
            }
          System.out.print(theList.isEmpty());
        }
    }

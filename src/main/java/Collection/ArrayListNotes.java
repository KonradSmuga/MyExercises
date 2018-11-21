package Collection;

import java.util.ArrayList;

public class ArrayListNotes {
    private int maxScore = Integer.MIN_VALUE;
    private int minScore = Integer.MAX_VALUE;

    public void informaticaNotes() {

        ArrayList<Integer> notes = new ArrayList<>();

        notes.add(1);
        notes.add(2);
        notes.add(5);
        notes.add(4);
        notes.add(2);
        notes.add(5);
        notes.add(5);
        double sum = 0;
        for (int note : notes) {

            sum += note;
            System.out.println(" " + note);
       if(minScore < notes.get(note) ){
           minScore = note;
           notes.remove(minScore);
       }

        }

        System.out.println(sum / notes.size());
    }
    }

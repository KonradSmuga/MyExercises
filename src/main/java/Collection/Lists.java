package Collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/*
Część 1
Napisz program przy użyciu listy ArrayList, zawierającej kilkanaście ocen z przedmiotu Informatyka w liceum.
Wypełnij listę przykładowymi ocenami.
Następnie przy pomocy pętli for oblicz średnią ocenę ucznia (średnia arytmetyczna), ale w taki sposób, że pominięte zostaną skrajne oceny — JEDNA najmniejsza i JEDNA największa.
Oceny największą i najmniejszą należy odnaleźć. Przykładowo, dla ocen:
,3,4,4,4,5,5,5,6 — do obliczenia średniej wzięte zostaną oceny: 3,4,4,4,5,5,5
4,4,4,4,4,4,4 — do obliczenia średniej wzięte zostaną oceny: 4,4,4,4,4

1.	Napisz program przy użyciu listy LinkedList, zawierającej obiekty opisujące książki. Każda książka powinna posiadać tytuł i rok wydania.
2.	Wypełnij listę kilkoma przykładowymi pozycjami.
3.	Następnie przy pomocy pętli for-each wyświetl tylko te książki z listy, których rok wydania jest nie starszy niż 2000.

 */
public class Lists {


    public void informaticaNotes() {

        ArrayList<Integer> notes = new ArrayList<>(Arrays.asList(3, 4, 4, 4, 4, 6));
        notes.remove(Collections.min(notes));
        notes.remove(Collections.max(notes));
        double sum = 0;

        for (int i = 0; i < notes.size(); i++) {

            sum += notes.get(i);

            System.out.println(notes.get(i));
        }

        notes.remove(Collections.max(notes));
        System.out.println(sum / notes.size());
    }

    public void linkedList() {
        LinkedList<Book> books= new LinkedList<>();
       books.add(new Book("harry potter", 1990));
       books.add(new Book("Lord of the rings", 1989));
       books.add(new Book("Hobbit", 2001));
       books.add(new Book("A Journey Into the Earth", 2000));
       books.add(new Book("Binary Death", 2000));
       books.add(new Book("Breaking Bad", 2017));
       books.add(new Book("50000 miles undersea journey", 1994));
       books.add(new Book("the Titanfall", 2013));

        for(Book book: books){

        if(book.getYearOfPublished(books.indexOf(book))>2000){

            System.out.println(book);
        };

    }
}

    }

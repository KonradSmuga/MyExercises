package Collection;

import java.util.ArrayList;

class ArrayListAndForLoop
{
    public static void main (String[] args) throws java.lang.Exception
    {
        ArrayList<String> library = new ArrayList<String>();

        library.add("50 Shades of Grey");
        library.add("Sherlock Holmes");
        library.add("The Last of the Mohicans");
        library.add("The Infinity");
        library.add("Better Call Saul");
        library.add("Journey to the Center of the Earth");
        library.add("Binary Death");
        library.add("Breaking Bad");
        library.add("Twenty Thousand Leagues Under the Sea");
        library.add("The Titanfall");
        library.add("Coma");
        library.add("Of Ants and Men");
        library.add("To Understand a Woman");
        library.add("Neverending Story");
        library.add("The Jungle Book");



        System.out.println("Removing last object from collection.");
        library.remove(library.size()-1);
        library.size();

        for(String book : library) {
            System.out.println(book);
        System.out.print("Biblioteka posiada" +library.size() +" Książeks");
        }
    }
}

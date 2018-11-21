package Average;

import java.util.Random;

public class Average {

    public void average() {
        int numbers = 50;

        int[] array = new int[numbers];
        int randomNumbers = 100;
        Random random = new Random(randomNumbers);

        for (int i = 0; i < numbers; i++)

            array[i] = random.nextInt(numbers);
        double sum =0;

        for(int i = 0; i < numbers; i++){
            System.out.println(array[i]);

            sum += array[i];
        }

        System.out.println(sum/numbers);
    }


}


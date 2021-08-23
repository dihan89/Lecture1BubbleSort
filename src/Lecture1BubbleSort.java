import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.util.*;

public class Lecture1BubbleSort{

   static <T extends Comparable<T>>  void bubbleSort (T [] values){
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < values.length-1; i++) {
                if(values[i].compareTo(values[i + 1]) > 0 ){
                    isSorted = false;
                    T tmp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args)  {
        System.out.println(" Enter number of  values: ");
        Scanner scanner = new Scanner(System.in);
        Integer nElements = scanner.nextInt();
        Integer values[] = new Integer[nElements];

        System.out.println(" Enter values: ");
        for(int i = 0; i < nElements; ++i) {
            values[i] = scanner.nextInt();
        } 
        scanner.close();

        bubbleSort(values);

        System.out.println(" Result:  ");
        for(int i = 0; i < nElements; ++i) {
            System.out.println(values[i]);
        }
    }
}
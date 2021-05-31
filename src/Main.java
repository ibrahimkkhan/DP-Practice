import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //printDecimal(3);
        // convertFromBinary("101010");
        // ArrayList<String> answerw = new ArrayList<String>();
        // printAllBinary(4, answerw, "");

        // for (String s: answerw){
        //     System.out.println(s);
        // }
        diceS(2);

    }

    public static void convertFromBinary(String binary){
        int answer = convertFromBinaryHelper(binary, 0);
        System.out.println(answer);
    }

    public static int convertFromBinaryHelper(String binary, int idx){
        if (idx > binary.length() - 1){
            return 0; 
        }
        char c = binary.charAt(idx);
        if (c == '1'){ 
            return power(binary.length()-1 - idx) + convertFromBinaryHelper(binary, idx + 1);
        }else{
            return 0 + convertFromBinaryHelper(binary, idx + 1);
        }
    }

    public static int power(int index){
        if (index == 0){
            return 1;
        }
        return 2 * power(index - 1);
    }

    public static void printAllBinary(int n, ArrayList<String> binaries, String s){
        if (n == 0){
            binaries.add(s);
            return;
        }

        String s1 = s + "0";
        String s2 = s + "1";
        printAllBinary(n - 1, binaries, s1);
        printAllBinary(n - 1, binaries, s2);
    }

    public static void printDecimal(int n){
        printDecimalHelper(n, "");
    }

    public static void printDecimalHelper(int n, String s){
        if(n == 0){
            System.out.println(s);
        }else{
            for (int i = 0; i < 10; i++){
                String s1 = s + Integer.toString(i);
                printDecimalHelper(n - 1, s1);
            }
        }
    }


    public static void diceS(int n){
        // List<Integer> array = new ArrayList<Integer> ();
        int [] array = new int[n];
        diceSum(n, array);
    }

    public static void diceSum(int n, int [] array){ //int value, int total, List<Integer>
        if (n == 0){
            for (int i = 0; i < n; i++){
                System.out.print(array[i]);
            }
            System.out.println("");
        }else{
            for (int i = 1; i <=6; i++){
                array[n - 1] = i;
                diceSum(n - 1,array);
            }
        }
        // if (n == 0){
        //     if (value == total){
        //         for (Integer i: array){
        //             System.out.print(i);
        //         }
        //         System.out.println();
        //     }
        //     return;
        // }
        // array.add(n);
        // for(int i = 1; i <= 6; i++){
        //     diceSum(n-1,value, total + i, array);
        // }

    }

    



    

}
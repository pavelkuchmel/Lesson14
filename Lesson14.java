package classwork;
import java.util.Random;
import java.util.Arrays;

public class Lesson14 {

    public static void main(String[] args) {
        /*
-------Lesson 13 - 13.09.2022------------------------------------------------------------------------------------
         */
        //Arrays.toString() - выводит одномерный массив
        //Arrays.deepToString() - выводит в строку многомерный массив
        //Сумма элементов каждой диагонали
        //char[][] field = new char[3][3];
        int[][] array = new int[3][3];
        fillArray(array);
        showArray(array);
        System.out.println(secondDiagonalSum(array));
    }
    static int mainDiagonalSum (int[][] arrayName){
        int sum = 0;
        for (int i = 0; i < arrayName[i].length; i++){
            sum += arrayName[i][i];
        }
        return sum;
    }
    static int secondDiagonalSum (int[][] arrayName){
        int sum = 0;
        for (int i = 0; i < arrayName.length; i++){
            sum += arrayName[i][Math.abs(i - (arrayName.length-1))];
        }
        return sum;
    }
    static void fillArray (int[][] arrayName){
        Random rdm = new Random();
        for (int i = 0; i < arrayName.length; i++){
            for (int j = 0; j < arrayName[i].length; j++){
                arrayName[i][j] = rdm.nextInt(9)+1;
            }
        }
    }
    static void showArray (int[][] arrayName){
        for (int i = 0; i < arrayName.length; i++){
            for (int j = 0; j < arrayName[i].length; j++){
                System.out.print(arrayName[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
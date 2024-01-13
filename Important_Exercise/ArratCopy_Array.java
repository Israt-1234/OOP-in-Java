/*
QUESTION:  Write a Java program to copy an array by iterating the array
*/
package important_java_exercise;

import java.util.Arrays;

public class ArrayCopy_Array {
    public static void main(String[] args){
        int [] array={100,200,300,400,500,600,700,800,900,10};
        int[] new_array=new int[10];
        //array print
        System.out.println("orignal Array : "+Arrays.toString(array));
        
        //  System.arraycopy(array, 0, new_array, 0, array.length);//
        for(int i=0;i<array.length;i++){
          new_array[i]=array[i];
        }
       System.out.println("coppyed Array : "+Arrays.toString(new_array));
    }
}

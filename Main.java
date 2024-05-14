package main;

import java.lang.*;

public class Main { 
    
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        
        for (int x: arr)
        {
            System.out.print(x + " ");
        }
        
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;

        for (int x: arr)
        {
            System.out.print(x + " ");
        } 
    }
}

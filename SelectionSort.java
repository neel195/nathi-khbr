import java.util.*;
import java.io.*;
import java.util.concurrent.*;
import java.util.Random;
class Selectionsort
{
    void selectionsort(  int arr[] )
    {
      int i;
      int n= arr.length;
      for(i=0;i<n-2;i++)
      {
          int imin=i;
          for(int j=i+1;j<n;j++)
          {
              if(arr[j]<arr[imin])
              imin=j;
          }
          int temp= arr[i];
          arr[i]=arr[imin];
          arr[imin]=temp;
     }  
    }
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
    // Driver method
    public static void main(String[] p)
    {
    int i;
    int []arr= new int[1000];
    Random ru= new Random();
    for(i=0;i<1000;i++)
    {
        arr[i]=ru.nextInt(1000)+1000;
    }
    Selectionsort ob = new Selectionsort(); 
        long starttime=System.nanoTime();
        ob.selectionsort(arr); 
        long endtime=System.nanoTime();                          
        printArray(arr); 
        long timeelapsed=(endtime-starttime);
        System.out.println(starttime);
        System.out.println(endtime);
        System.out.println(timeelapsed);
    }

}

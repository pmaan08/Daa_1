import java.util.*;
import java.util.Scanner;


public class binarysearch 
{
     int bs(int arr[],int l, int r ,int x)
     {
        if (r >= l)  
       {    int mid = l + (r - l) / 2; 
  
            if (arr[mid] == x) 
                return mid; 
            
            if (arr[mid] > x) 
                return bs(arr, l, mid - 1, x); 
  
            return bs(arr, mid + 1, r, x); 
        }
       else
         {
             return 6;
         }
     }

    public static void main(String[] args)
    {
        binarysearch obj = new binarysearch();
        Scanner sc=new Scanner(System.in);

        int i;
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elemnts");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the elemnt to search");
        int x=sc.nextInt();
        //call the binary search function by passing the array , first position , last position , elemnt to be found
        //sort the array first before sarching 
        //sorting array using insertion sort
        for (i = 1; i < n; ++i) 
        { 
            int t = a[i]; 
            int j = i - 1; 
            while (j >= 0 && a[j] > t)
            { 
                a[j + 1] = a[j]; 
                j = j - 1; 
            } 
            a[j + 1] = t;
        }

        int result = obj.bs(a,0,n-1,x);
        if (result == 6) 
            System.out.println("Element not present"); 
        else
            { result = result + 1;
               System.out.println("Element found at index " + result ); }
    } 
}
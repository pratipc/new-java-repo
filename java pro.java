import java.util.*;
class Reverse
{
public static void main(String args[])
    {
       int size,i;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter total number of elements");
       size=sc.nextInt();
       int arr[]=new int[size];
       System.out.println("enter the elements");
           for (i=0; i < size; i++)
               {  
                arr[i]= sc.nextInt();
               }
        System.out.println("Original array: ");  
            for (i = 0; i < size; i++) 
                 {  
                 System.out.print(arr[i] + " ");  
                  }  
               System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
            for (i = size-1; i >= 0; i--) 
                {  
                System.out.print(arr[i] + " ");  
                }  
    }  
}  

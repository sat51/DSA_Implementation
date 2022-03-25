import java.sql.SQLOutput;
import java.util.Scanner;

public class Array_questions {
    int arr[]=null;

    public Array_questions()
    {
        arr = new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int value, int index)
    {
        try
        {
            if(arr[index]== Integer.MIN_VALUE)
            {
                arr[index]= value;
            }
            else
            {
                System.out.println("already filled");
            }
        }
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("invalid index");
        }
    }
    // method to traverse the array
    // to print all the values stored in the array
    public void traverse()
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    // method to print a specific index value
    public void indexvalueprint(int index)
    {
        try
        {
            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("invalid index ");
        }
    }
    // method to search a value in the given array
    public void searchinarray(int searchvalue)
    {
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]== searchvalue)
            {
                System.out.println("value found");
                return;
            }
        }
        System.out.println("no matched found");
    }
    // method to delete a value from array
    // user prove the index
    public void deletevalue( int index)
    {
        try
        {
            arr[index]= Integer.MIN_VALUE;
        }catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("out of range");
        }
    }
    // delete the complete array
    public void deleteArray()
    {
        int arr[] ={10,20,30};
        this.arr= null;
    }

    public static void main(String[] args) {
        Array_questions obj = new Array_questions();
        System.out.println("before insertion default value ");
        obj.traverse();
        obj.insert(20,1);
        System.out.println("after insertion ");
        obj.traverse();
        obj.deletevalue(1);
        System.out.println("after deletion ");
        obj.traverse();
    }



}
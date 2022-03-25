import java.util.Scanner;
public class StackDemo
{
    int ar[];
    int top;
    StackDemo()
    {
        ar = new int[5];
        top =-1;
    }
    void push()
    {
        if(top==ar.length-1)
        {
            System.out.println("Stack full");
        }
        else
        {
            System.out.println("enter data");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            top = top+1;
            ar[top]=data;
            System.out.println("data inserted");
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack empty");
        }
        else
        {
            System.out.println("deleted"+ar[top]);
            top = top-1;
        }
    }
    void traverse()
    {
        if(top==-1)
        {
            System.out.println("Stack empty");
        }
        else
        {
            System.out.println("-----Stack element------" );
            for(int i=top;i>=0;i--)
            {
                System.out.println(ar[i]);
            }
        }
    }
    public static void main(String args[])
    {
        StackDemo obj = new StackDemo();
        while(true)
        {
            System.out.println("\nPress 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for Exit");

            System.out.println("Enter ur choice ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice ");
            }
        }
    }
}
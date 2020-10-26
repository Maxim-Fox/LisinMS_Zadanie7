package Lisin_Lab7;
import java.util.*;
import java.util.Scanner;
public class StackForGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> st1 = new Stack();
        Stack<Integer> st2 = new Stack();
        for (int i = 0; i < 5; i++)
            st1.push(scanner.nextInt());
        for (int i = 0; i < 5; i++)
            st2.push(scanner.nextInt());
        play(st1, st2);

    }
    public static void play(Stack<Integer> st1,Stack<Integer> st2)
    {
        int k=0;
        while(!st1.isEmpty()&&!st2.isEmpty()&&k<107)
        {
            int FC= st1.pop();
            int SC=st2.pop();
            if(FC==0&&SC==9)
            {
                st1.add(0,FC);
                st1.add(0,SC);
            }else if(FC==9&&SC==0)
            {
                st2.add(0,FC);
                st2.add(0,SC);
            } else if(FC<SC)
            {
                st2.add(0,FC);
                st2.add(0,SC);
            } else
            {
                st1.add(0,FC);
                st1.add(0,SC);
            }
            k++;
        }
        if(k==107)
        {
            System.out.println("botva");
        }else if(st2.isEmpty())
        {
            System.out.println("first "+k);
        } else
        {
            System.out.println("second "+k);
        }
    }
}

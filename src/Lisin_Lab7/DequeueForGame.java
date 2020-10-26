package Lisin_Lab7;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;
public class DequeueForGame {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Deque<Integer> st1=new ArrayDeque<Integer>();
        Deque<Integer> st2=new ArrayDeque<Integer>();

        for(int i=0;i<5;i++)
            st1.add(scanner.nextInt());

        for(int i=0;i<5;i++)
            st2.add(scanner.nextInt());
        play(st1,st2);
    }
    public static void play(Deque<Integer> st1,Deque<Integer> st2)
    {
        int k=0;
        while(!st1.isEmpty()&&!st2.isEmpty()&&k<107)
        {
            int FC= st1.pop();
            int SC=st2.pop();
            if(FC==0&&SC==9)
            {
                st1.add(FC);
                st1.add(SC);
            }else if(FC==9&&SC==0)
            {
                st2.add(FC);
                st2.add(SC);
            } else if(FC<SC)
            {
                st2.add(FC);
                st2.add(SC);
            } else
            {
                st1.add(FC);
                st1.add(SC);
            }
            k++;
        }
        if(k==107){
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

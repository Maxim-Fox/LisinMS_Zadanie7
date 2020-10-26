package Lisin_Lab7;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
public class DoubleListForGame {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        LinkedList<Integer> st1=new LinkedList<Integer>();
        LinkedList<Integer> st2=new LinkedList<Integer>();
        for(int i=0;i<5;i++)
            st1.push(scanner.nextInt());
        for(int i=0;i<5;i++)
            st2.push(scanner.nextInt());
        play(st1,st2);
    }
    public static void play(LinkedList<Integer> st1, LinkedList<Integer> st2){
        int k=0;
        while(!st1.isEmpty()&&!st2.isEmpty()&&k<107)
        {
            int FC= st1.remove();
            int SC=st2.remove();
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
            } else {
                st1.add(FC);
                st1.add(SC);
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

import java.util.*;

public class Main {
    public static String read(int n, int []book, int target){
        for(int i=0;i<book.length;i++){
            for(int j=i+1;j<book.length;j++){
                if(book[i]+book[j]==target){
                    String Yes = "YES";
                    return Yes;
                }
            }
        }
        String No="NO";
        return No;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int TARGET=s.nextInt();
        int BOOK[]=new int[N];
        for(int i=0;i<N;i++){
            BOOK[i]=s.nextInt();
        }
        String book1=read(N,BOOK,TARGET);
        System.out.println(book1);
    }
}
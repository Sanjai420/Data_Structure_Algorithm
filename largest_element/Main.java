import java.util.*;

public class Main {
    public static String read(int n, int[] book, int target) {
        Arrays.sort(book);
        int left = 0;
        int right = n - 1; 
        
        while (left < right) {
            int sum = book[left] + book[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return "No";
    }
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int TARGET = s.nextInt();
        int BOOK[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            BOOK[i] = s.nextInt();
        }
        
        String book1 = read(N, BOOK, TARGET);
        System.out.println(book1);
    }
}

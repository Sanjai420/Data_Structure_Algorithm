import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int a[][] = new int[m][n];
        int zeroRows[] = new int[m];
        int zeroCols[] = new int[n];
        int zeroRowCount = 0;
        int zeroColCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
                if (a[i][j] == 0) {
                    zeroRows[zeroRowCount++] = i;
                    zeroCols[zeroColCount++] = j;
                }
            }
        }

        for (int i = 0; i < zeroRowCount; i++) {
            int row = zeroRows[i];
            for (int j = 0; j < n; j++) {
                a[row][j] = 0;
            }
        }

        for (int i = 0; i < zeroColCount; i++) {
            int col = zeroCols[i];
            for (int j = 0; j < m; j++) {
                a[j][col] = 0;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

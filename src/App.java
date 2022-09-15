import java.util.Scanner;

public class App {
    public static void ulitkaMass(int[][] massInt2, int n) {
        int plus = 0, countX = 0, countY = 1, stopYY = 1, stopYX = 1, stopXX = 0, stopXY = 0, X = 0, Y = 0;
        while (plus != (n * n)) {
            massInt2[Y][X] = plus * plus;
            Y += countY;
            X += countX;
            if ((Y == n - stopYY) && countY == 1) {countY = 0; countX = 1; stopXY++;}
            if ((X == n - stopYX) && countX == 1) {countY = -1; countX = 0; stopYY++;}
            if ((Y == 0 + stopXX) && countY == -1) {countY = 0; countX = -1; stopYX++;}
            if ((X == 0 + stopXY) && countX == -1) {countY = 1; countX = 0; stopXX++;}
            plus++;
        }
    }
    public static void output(int[][] massInt2, int n) {
        for(int X = 0; X < n; X++) {
            for(int Y = 0; Y < n; Y++) {
                System.out.print(massInt2[X][Y]);
                if (!(Y + 1 == n)) {System.out.print(" ");}
            }
            if (!(X + 1 == n)) {System.out.print("\n");}
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] massiv = new int[n][n];
        ulitkaMass(massiv, n);
        output(massiv, n);
        scanner.close();
    }
}
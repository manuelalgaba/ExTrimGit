import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Matriz random:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matriz Traspuesta:");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
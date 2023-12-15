import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
<<<<<<< HEAD

        int[][] matriz = new int[6][6];//La matriz es de 6*6
=======
        //Creación de variables
        int[][] matriz = new int[3][3];
>>>>>>> 8c03b181a8f6f686f53bef558871b9f1cea56dd9

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Matriz random:");//Creamos la matriz random
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matriz Traspuesta:");//Creamos la traspuesta
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

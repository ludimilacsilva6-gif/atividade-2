import java.util.Scanner;

public class exercicio02 {

    // Lê os 9 números e preenche a matriz 3x3
    static int[][] lerMatriz(Scanner sc) {
        int[][] m = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    // Soma todos os elementos da matriz
    static int somarElementos(int[][] m) {
        int soma = 0; // criada antes dos for
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                soma += m[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = lerMatriz(sc);
        System.out.println("Soma: " + somarElementos(m));

        sc.close();
    }
}
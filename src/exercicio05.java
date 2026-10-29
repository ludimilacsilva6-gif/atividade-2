import java.util.Scanner;

public class exercicio05 {

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

    // Mostra os elementos em que a linha é igual à coluna
    static void exibirDiagonalPrincipal(int[][] m) {
        System.out.print("Diagonal principal:");
        for (int i = 0; i < m.length; i++) {
            System.out.print(" " + m[i][i]); // linha = coluna
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = lerMatriz(sc);
        exibirDiagonalPrincipal(m);

        sc.close();
    }
}

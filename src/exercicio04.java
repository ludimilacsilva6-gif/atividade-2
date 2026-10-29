import java.util.Scanner;

public class exercicio04 {

    // Lê os 6 números e preenche a matriz 2x3 (2 linhas e 3 colunas)
    static int[][] lerMatriz(Scanner sc) {
        int[][] m = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    // Conta quantos elementos são pares
    static int contarPares(int[][] m) {
        int pares = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }
        return pares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = lerMatriz(sc);
        System.out.println("Quantidade de pares: " + contarPares(m));

        sc.close();
    }
}

import java.util.Scanner;

public class exercicio03 {

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

    // Devolve o maior valor da matriz
    static int encontrarMaior(int[][] m) {
        int maior = m[0][0]; // começa com o primeiro elemento
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = lerMatriz(sc);
        System.out.println("Maior valor: " + encontrarMaior(m));

        sc.close();
    }
}

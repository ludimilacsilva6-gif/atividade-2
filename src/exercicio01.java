import java.util.Scanner;

public class exercicio01 {

    // Lê os 9 números e preenche a matriz 3x3
    static int[][] lerMatriz(Scanner sc) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    // Mostra a matriz em forma de tabela, uma linha embaixo da outra
    static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // quebra de linha ao terminar cada linha da matriz
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = lerMatriz(sc);
        System.out.println();
        exibirMatriz(matriz);

        sc.close();
    }
}
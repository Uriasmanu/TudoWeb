import java.util.Scanner;

public class PesquisaDeOpiniao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int excelenteCount = 0;
        int ruimCount = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entrevistado " + i);
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer de entrada
            System.out.print("Opinião (1-EXCELENTE, 2-BOM, 3-RUIM): ");
            int opiniao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer de entrada

            if (opiniao == 1) {
                excelenteCount++;
            } else if (opiniao == 3) {
                ruimCount++;
            }
        }

        System.out.println("\nResultados da pesquisa:");
        System.out.println("Quantidade de respostas \"EXCELENTE\": " + excelenteCount);
        System.out.println("Quantidade de respostas \"RUIM\": " + ruimCount);

        scanner.close();
    }
}

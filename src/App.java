import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        String nome, opniao;
        int idade, excelente, ruim;

        excelente = 0;
        ruim = 0;

        JOptionPane.showMessageDialog(null, "Seja bem-vindo(a) à TudoWeb");

        for (int i = 0; i < 10; i++) {
            nome = JOptionPane.showInputDialog(null, "Por gentileza, digite o seu nome:");
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Por gentileza, digite a sua idade:"));

            opniao = JOptionPane.showInputDialog(null, "Sr(a). " + nome + ", poderia nos dar a sua opinião sobre o nosso site:" + "\n1 - Excelente"
                    + "\n3 - Ruim");

            int opniaoInt = Integer.parseInt(opniao);

            switch (opniaoInt) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Você escolheu a opção 1. Excelente");
                    excelente = excelente + 1;
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Você escolheu a opção 3 - Ruim");
                    ruim = ruim + 1;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }

        }

        JOptionPane.showMessageDialog(null, "Resultados:\nExcelente: " + excelente + "\nRuim: " + ruim);

    }
}

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        String nome, opniao;
        int idade, exelente, bom, ruim;

        exelente = 0;
        bom = 0;
        ruim = 0;

        JOptionPane.showMessageDialog(null, "Seja bem-vindo(a) a TudoWeb");

        for (int i = 0; i <= 10; i++) { // Correção aqui: ponto e vírgula em vez de vírgula

            nome = JOptionPane.showInputDialog(null, "Por gentileza digite o seu nome:");
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Por gentileza digite o sua idade:"));

            opniao = JOptionPane.showInputDialog(null, "Sr(a). " + nome + ", poderia nos dar a sua opinião sobre o nosso site:" + "\n1 - Excelente"
                    + "\n2 - Bom" + "\n3 - Ruim");

            int opniaoInt = Integer.parseInt(opniao);

            switch (opniaoInt) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Entrevistado" + i + "escolheu a opção 1. Excelente");
                    exelente = exelente + 1;
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Entrevistado" + i + "escolheu a opção 2 - Bom");
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Entrevistado" + i + "escolheu a opção 3 - Ruim");
                    ruim = ruim + 1;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }

        }

        // Após o loop, você pode exibir os resultados, por exemplo:
        JOptionPane.showMessageDialog(null, "Resultados:\nExcelente: " + exelente + " \nRuim" + ruim);

    }
}
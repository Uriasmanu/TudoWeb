import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int finalPlaca;

        finalPlaca = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final da placa do veículo (1 a 9):"));

            switch (finalPlaca) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Mês de vencimento do IPVA: Pagamento até 30/04");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Mês de vencimento do IPVA: Pagamento até 31/05");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Mês de vencimento do IPVA: Pagamento até 30/06");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Mês de vencimento do IPVA: Pagamento até 31/07");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Mês de vencimento do IPVA: Pagamento até 31/08");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Mês de vencimento do IPVA: Pagamento até 30/09");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Mês de vencimento do IPVA: Pagamento até 31/10");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Mês de vencimento do IPVA: Pagamento até 30/11");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Mês de vencimento do IPVA: Pagamento até 31/12");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Número final da placa incorreto. Digite um número entre 1 e 9.");
                    break;
            }
    }
}

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        String nome, opniao;
        int idade;
        
        JOptionPane.showMessageDialog(null, "Seja bem-vindo(a) a TudoWeb");

        nome = JOptionPane.showInputDialog(null,"Por gentileza digite o seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Por gentileza digite o sua idade:"));

        opniao = JOptionPane.showInputDialog(null, "Sr(a)." + nome + "poderia nos dar a sua opnião sobre o nosso site:" + "\n1 - Exelente" +
        "\n2 - Bom" + "\n3 - Ruim");

        int opniaoInt = Integer.parseInt (opniao);

        switch(opniaoInt){
            case 1:
                JOptionPane.showMessageDialog(null,"Você escolheu a opção 1. Exelente");
                break;

            case 2:
                JOptionPane.showMessageDialog(null,"Você escolheu a opção 2 - Bom");
                break;
            
            case 3:
                JOptionPane.showMessageDialog(null,"Você escolheu a opção 3 - Ruim");
                break;    

            default:
            JOptionPane.showMessageDialog(null, "Opção invalida");
            break;
        }
    
    }
}
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        String nome, opniao;
        int idade;
        
        JOptionPane.showMessageDialog(null, "Seja bem-vindo(a) a TudoWeb");

        nome = JOptionPane.showInputDialog(null,"Por gentileza digite o seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Por gentileza digite o sua idade:"));
    }
}
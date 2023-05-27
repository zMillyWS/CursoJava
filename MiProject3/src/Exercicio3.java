import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        String senhaBanco = "senhacerta";
        String senha = JOptionPane.showInputDialog("Digite a senha: ");
        do {
            JOptionPane.showMessageDialog(null, "Senha incorreta.");
            senha = JOptionPane.showInputDialog("Digite a senha: ");
            //JOptionPane.showMessageDialog(null, senha);
        } while (!senha.equals(senhaBanco));
        JOptionPane.showMessageDialog(null, "Acesso permitido");
    }
}

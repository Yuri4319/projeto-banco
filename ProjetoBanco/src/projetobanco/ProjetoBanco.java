
package projetobanco;

import javax.swing.JOptionPane;

public class ProjetoBanco {

    public static void main(String[] args) {
        Banco dados= new Banco();
        
        dados.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite sua agencia: ")));
        dados.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: ")));
        dados.setSenha(JOptionPane.showInputDialog("Digite sua senha: "));
        
        dados.logar(dados.getNumConta(), dados.getAgencia(),dados.getSenha());
    }
    
}

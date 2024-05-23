import javax.swing.JOptionPane;

import classe.Personagem;

public class Construtores_02 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Nome do Personagem: ");
        String classe = JOptionPane.showInputDialog(null, "Classe do Personagem: ");

        //Os parâmetros abaixo recebem a informação vinda do JOptionPane e vão para o construtor
        Personagem guerreiro = new Personagem(nome, classe); 
        guerreiro.mostrarStatus();
    }
}

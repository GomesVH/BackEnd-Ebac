package edu.java.src.swing;

import javax.swing.SwingUtilities;

/**
 * Classe principal para iniciar a interface gráfica de cadastro de clientes utilizando Swing.
 * @author gomesvh
 */
public class CadastroClienteSwing {
    public static void main(String[] args) {
        // Cria e exibe a tela principal na Event Dispatch Thread (boa prática com Swing)
        SwingUtilities.invokeLater(() -> {
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
        });
    }
}
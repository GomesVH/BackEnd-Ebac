package edu.java.gomesvh.interfaces;

/**
 * Interface para exibição e aceitação (ou recusa) dos termos de uso.
 * Apresenta os termos e verifica se o usuário aceita ou não.
 * @author gomesvh
 */
public interface ITermos {
    // Exibição dos termos de contrato
    default void termosDeContrato() {
        System.out.println("-----   *****> TERMOS DE CONTRATO <*****   -----");
        System.out.println("______________________________________________________________________");
        System.out.println("1- A conta é intransferível.");
        System.out.println("2- É de responsabilidade do titular da conta proteger os dados da conta.");
        System.out.println("______________________________________________________________________");
        System.out.println("---*> Para aceitar os termos de contrato, digite Sim.");
        System.out.println("---*> Para recusar os termos de contrato, digite Não.");
        System.out.print("R: ");
    }

    // Aceitação dos termos
    default Boolean aceitarTermos(String resposta) {
        return resposta.equalsIgnoreCase("sim");
    }
}
package view;

import model.Vendedor;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;

public class MenuVenda {
    public void menu(){
            String[] item = {"Inserir", "Pesquisar", "Listar", "Atualizar", "Excluir", "Sair"};
            String opcao;
            do {
                opcao = (String) (showInputDialog(null, "Selecione uam opção", "*** MENU VENDA ***", INFORMATION_MESSAGE, null, item, item[0]));
                switch (opcao.toLowerCase()){
                    case "inserir" -> inserir();
                    case "listar" -> listar();
                }
            } while(!opcao.toLowerCase().equals("sair"));

    }

    }
}
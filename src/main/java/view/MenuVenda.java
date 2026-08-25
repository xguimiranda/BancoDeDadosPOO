package view;

import dao.VendedorDAO;
import model.Vendedor;

import java.util.List;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;

public class MenuVenda {
    public void menu() {
        String[] item = {"Inserir", "Listar", "Pesquisar", "Atualizar", "Excluir", "Sair"};
        String opcao;

        do {
            opcao = (String) showInputDialog(null,
                    "Selecione uma opção",
                    "Menu Vendedor",
                    INFORMATION_MESSAGE,
                    null,
                    item,
                    item[0]);
            switch(opcao.toLowerCase()) {
                case "inserir" -> inserir();
            }
        }
        while(!opcao.toLowerCase().equals("sair"));
    }

    private void inserir() {
        List<Vendedor> lista = new VendedorDAO().listar();
        Double total;
        String data;
        Vendedor vendedor = new Vendedor();

        vendedor = (Vendedor) showInputDialog(null,
                "Selecione uma opção",
                "Menu Vendedor",
                INFORMATION_MESSAGE,
                null,
                lista.toArray(),
                lista.get(0));
    }
}
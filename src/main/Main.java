package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        InterfaceUsuario obj = new InterfaceUsuario();

        obj.pedirTaxaJuros();

        Financiamento financiamento = new Financiamento(250.000,48, 7.8);

        financiamento.mostraDados();

    }
}
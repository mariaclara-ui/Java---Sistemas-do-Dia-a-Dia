package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades;

import java.util.Scanner;


public class Compra {
    Scanner sc = new Scanner(System.in);

    public String adicionar;
    public double valor;
    public double total = 0;
    public double frete;
    public String forma_pagamento;
    public String pagamento_aceito;
    public int cod_pedido;
    public String confirmacao_compra;


    public void adicinoraitem() {
        do {
            System.out.println("Deseja colocar itens no carrinho?");
            adicionar = sc.nextLine();


            if (adicionar.equalsIgnoreCase("Sim")) {

                System.out.println("Digite o valor do item:");
                valor = sc.nextDouble();

                total += valor;

                sc.nextLine();
            }

        } while (adicionar.equalsIgnoreCase("Sim"));
        System.out.println("O valor total da compra será de " + total);

        System.out.println("O pagamento foi concluido?");
        pagamento_aceito=sc.nextLine();
       if (pagamento_aceito.equalsIgnoreCase("sim")){
           System.out.println("Pagamento concluido.");

       }else {
           System.out.println("Erro em finalizar a compra.");
           System.exit(0);
       }
    }
    public void calcularfrete(){
        if (total>500){
        System.out.println("Frte grátis.");
    }
        else {
            frete = total + 25.00;
            System.out.println("O valor atualizado da compra será: " + frete);
        }
    }
}



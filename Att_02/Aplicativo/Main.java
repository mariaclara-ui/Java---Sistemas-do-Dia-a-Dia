package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Aplicativo;

import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades.Cliente;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades.Compra;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cliente cliente = new Cliente();
        Compra compra= new Compra();
        Random random=new Random();

        System.out.println("Qual e a forma de pagamento?");
        compra.forma_pagamento= sc.nextLine();

        System.out.println("Digite seu nome:");
        cliente.nome=sc.nextLine();

        System.out.println("Digite seu CPF:");
        cliente.CPF= sc.nextLine();

        System.out.println("Digite sua rua:");
        cliente.rua= sc.nextLine();

        System.out.println("Digite seu bairro:");
        cliente.bairro=sc.nextLine();

        System.out.println("Digite o número da sua casa:");
        cliente.numero_Casa= sc.nextInt();

        compra.adicinoraitem();

        compra.calcularfrete();

        if (compra.pagamento_aceito.equalsIgnoreCase("Sim")){
            compra.cod_pedido= random.nextInt(1000);

            System.out.println("O código do pegido será: "+compra.cod_pedido);
            System.out.println("Deseja concluir essa compra?");
            compra.confirmacao_compra= sc.nextLine();

            if (compra.confirmacao_compra.equalsIgnoreCase("Sim")){
                System.out.println("Compra realizada com sucesso.");
            }
            else {
                System.out.println("Compra cancelada.");
            }
        }
        else {
            System.out.println("Pagamento não autorizado.");
        }
    }
}

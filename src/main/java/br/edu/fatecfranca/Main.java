package br.edu.fatecfranca;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Produto luva = new Produto("Luva", 10, 5.99);
        luva.comprar(10);
        System.out.println("Qtd de luvas após a compra: " + luva.qtd);
        luva.vender(10);
        System.out.println("Qtd de luvas após a venda: " + luva.qtd);
        luva.vender(20);
    }
}
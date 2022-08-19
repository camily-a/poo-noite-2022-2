package br.edu.fatecfranca;

import exception.QtdInsuficienteException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    public String nome;
    public int qtd;
    public double preco;

    public void comprar(int qtdComprada) {
        this.qtd = this.qtd + qtdComprada;
    }

    public void vender(int qtdVendida) {
        if (this.qtd >= qtdVendida) {
            this.qtd = this.qtd - qtdVendida;
        } else {
            throw new QtdInsuficienteException();
        }
    }




}

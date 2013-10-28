package br.com.felipeborges.pessoa;

import br.com.felipeborges.financeiro.ContaCorrente;
import java.util.Date;

public class Cliente extends Pessoa {

    private ContaCorrente contaCorrente;
    private int id;

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" + "contaCorrente=" + contaCorrente + ", id=" + id + '}';
    }
}

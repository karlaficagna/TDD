package com.ficagna.TDD;

import com.ficagna.TDD.Dominio.Endereco;
import com.ficagna.TDD.Dominio.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    public void adicionarEnderecoTest() {
        Pessoa pessoa = new Pessoa(01l, "Karla");
        Endereco endereco = new Endereco("Rua dos Andradas", "200", "103", "centro", "90010001", "Porto Alegre", "RS");

        pessoa.adicionarEndereco(endereco);

        Assertions.assertEquals(endereco, pessoa.getEnderecos().get(0));


    }
}

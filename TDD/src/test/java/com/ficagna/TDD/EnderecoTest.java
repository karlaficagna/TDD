package com.ficagna.TDD;

public class EnderecoTest {

    @Test
    public void cadstrarEnderecoTest() {
        Endereco endereco = new Endereco("Nome rua", "200", "103", "centro", "90010001", "Porto Alegre", "RS");

        Assertions.assertEquals("Nome rua", endereco.getNomeRua);
        Assertions.assertEquals("200", endereco.getNumero);
        Assertions.assertEquals("103", endereco.getComplemento);
        Assertions.assertEquals("centro", endereco.getBairro);
        Assertions.assertEquals("90010001", endereco.getCep);
        Assertions.assertEquals("Porto Alegre", endereco.getCidade);
        Assertions.assertEquals("RS", endereco.getEstado);


    }
}

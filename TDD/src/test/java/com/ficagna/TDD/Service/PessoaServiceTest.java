package com.ficagna.TDD.Service;

import com.ficagna.TDD.Dominio.Pessoa;
import com.ficagna.TDD.Repositorio.PessoaRepositorio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

public class PessoaServiceTest {

    ExtendWith(MockitoExtension .class)

    class PessoaServiceTest {

        @Mock
        private PessoaRepositorio pessoaRepositorio;

        @InjectMocks
        private PessoaService pessoaService;

        @Test
        void findByIdSuccessTest() {
            Pessoa minhaPessoa = new Pessoa(1L, "Fulano");
            Mockito
                    .when(pessoaRepositorio.findById(1L))
                    .thenReturn(minhaPessoa);

            Pessoa resultado = pessoaService.findById(1L);
            Assertions.assertEquals(minhaPessoa, resultado);
        }

        @Test
        void salvarSuccessTest() {
            //arranje
            Pessoa minhaPessoa = new Pessoa(null, "Fulano");
            Pessoa pessoaRetorno = new Pessoa(1L, "Fulano");

            Mockito
                    .when(pessoaRepositorio.salvar(minhaPessoa))
                    .thenReturn(pessoaRetorno);

            //act
            Pessoa resultado = pessoaService.salvar(minhaPessoa);

            //assert
            Assertions.assertEquals(pessoaRetorno, resultado);
        }

        @Test
        void salvarValidationErrorTest() {
            Pessoa pessoa = new Pessoa();

            Assertions.assertThrows(
                    RuntimeException.class,
                    () -> pessoaService.salvar(pessoa),
                    "Pessoa deve conter um nome"
            );
        }

        @Test
        void procuraTodasPessoasTest() {
            List<Pessoa> pessoas = Arrays.asList(new Pessoa(1L, "Fulano"));

            Mockito.when(pessoaRepositorio.findAll()).thenReturn(pessoas);

            List<Pessoa> resultado = pessoaService.procuraTodasPessoas();

            Assertions.assertEquals(resultado, pessoas);
        }
    }
}
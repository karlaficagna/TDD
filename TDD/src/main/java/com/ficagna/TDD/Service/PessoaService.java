package com.ficagna.TDD.Service;

import com.ficagna.TDD.Dominio.Endereco;
import com.ficagna.TDD.Dominio.Pessoa;
import com.ficagna.TDD.Repositorio.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PessoaService {
    @Autowired
    private PessoaRepositorio pessoaRepositorio;

    public PessoaService(PessoaRepositorio pessoaRepositorio) {
        this.pessoaRepositorio = pessoaRepositorio;
    }

    public Pessoa findById(Long id) {
        Pessoa resultado = pessoaRepositorio.findById(id);
        if (resultado == null) {
            throw new RuntimeException("Pessoa não encontrada");
        }
        return resultado;
    }

    public Pessoa salvar(Pessoa pessoaParaSalvar) {
        if (pessoaParaSalvar.getNome() == null) {
            throw new RuntimeException("Pessoa deve conter um nome");
        }
        Pessoa pessoaSalva = pessoaRepositorio.salvar(pessoaParaSalvar);
        return pessoaSalva;
    }

    public List<Pessoa> procuraTodasPessoas() {

        return pessoaRepositorio.findAll();
    }

    public Pessoa adicionarEndereco(Long idPessoa, Endereco enderecoAdicionar) {

        return null;
    }
}


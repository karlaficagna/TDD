package com.ficagna.TDD.Repositorio;

import com.ficagna.TDD.Dominio.Pessoa;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PessoaRepositorio {

    Pessoa salvar(Pessoa pessoa);

    Pessoa findById(Long id);

    List<Pessoa> findAll();

}


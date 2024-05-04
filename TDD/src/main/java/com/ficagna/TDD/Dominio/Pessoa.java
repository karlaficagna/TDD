package com.ficagna.TDD.Dominio;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private Long id;
    private String nome;
    private List<Endereco> enderecoList;


    public Pessoa(Long id, String nome, List<Endereco> enderecoList) {
        this.id = id;
        this.nome = nome;
        this.enderecoList = enderecoList;
    }



    public Pessoa() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void adicionarEndereco (Endereco endereco) {
        if (enderecoList == null) {
            new ArrayList<>();
        }
        enderecoList.add(endereco);
    }
    public List<Endereco> getEnderecos(){
        return enderecoList;
    }
}

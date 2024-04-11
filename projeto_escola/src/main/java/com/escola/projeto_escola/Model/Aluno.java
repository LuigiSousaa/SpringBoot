package com.escola.projeto_escola.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
public class Aluno implements Serializable{

    @Id
    private String cpf;
    private String nome;
    private String email;
    private String senha;
    
}

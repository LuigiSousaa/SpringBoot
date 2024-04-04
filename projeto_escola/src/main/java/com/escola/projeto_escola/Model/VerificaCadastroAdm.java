package com.escola.projeto_escola.Model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class VerificaCadastroAdm implements Serializable{
    // Atributos
    @Id
    private String cpf;
    private String nome;
    
}

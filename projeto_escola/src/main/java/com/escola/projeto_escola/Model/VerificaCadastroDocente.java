package com.escola.projeto_escola.Model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class VerificaCadastroDocente implements Serializable {

    @Id
    private String cpf;
    private String nome;
}
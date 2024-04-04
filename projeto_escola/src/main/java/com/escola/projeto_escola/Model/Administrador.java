package com.escola.projeto_escola.Model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Administrador implements Serializable {
    // Atributos
    @Id
    private String cpf;
    private String nome;
    private String email;
    private String senha;

}

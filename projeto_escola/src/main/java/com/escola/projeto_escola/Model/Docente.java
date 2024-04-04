package com.escola.projeto_escola.Model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Docente implements Serializable {
    
    @Id
    private String cpf;
    private String nome;
    private String materias;
    private String senha;
    
}

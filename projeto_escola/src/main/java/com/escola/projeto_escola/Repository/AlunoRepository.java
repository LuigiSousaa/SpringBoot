package com.escola.projeto_escola.Repository;

import org.springframework.data.repository.CrudRepository;

import com.escola.projeto_escola.Model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, String> {

    Aluno findByCpf(String cpf);
    
}

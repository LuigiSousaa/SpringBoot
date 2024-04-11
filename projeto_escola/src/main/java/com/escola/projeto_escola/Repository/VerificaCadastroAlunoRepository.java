package com.escola.projeto_escola.Repository;

import org.springframework.data.repository.CrudRepository;

import com.escola.projeto_escola.Model.VerificaCadastroAluno;

public interface VerificaCadastroAlunoRepository extends CrudRepository<VerificaCadastroAluno, String> {

    VerificaCadastroAluno findByCpf(String cpf);

}

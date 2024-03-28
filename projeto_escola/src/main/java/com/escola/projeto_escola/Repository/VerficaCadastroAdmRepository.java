package com.escola.projeto_escola.Repository;

import org.springframework.data.repository.CrudRepository;

import com.escola.projeto_escola.Model.VerificaCadastroAdm;

public interface VerficaCadastroAdmRepository extends CrudRepository<VerificaCadastroAdm, String> {

    VerificaCadastroAdm findByCpf(String cpf);
}

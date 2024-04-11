package com.escola.projeto_escola.Repository;

import org.springframework.data.repository.CrudRepository;

import com.escola.projeto_escola.Model.VerificaCadastroDocente;

// Criando um repository que manipulará entidades de 'VerificaCadastroDocente'
public interface VerificaCadastroDocenteRepository extends CrudRepository<VerificaCadastroDocente, String> {
    
    VerificaCadastroDocente findByCpf(String cpf);
}

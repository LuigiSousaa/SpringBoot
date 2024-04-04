package com.escola.projeto_escola.Repository;

import org.springframework.data.repository.CrudRepository;

import com.escola.projeto_escola.Model.Docente;
import com.escola.projeto_escola.Model.VerificaCadastroDocente;

public interface VerificaCadastroDocenteRepository extends CrudRepository<Docente, String> {
    
    VerificaCadastroDocente findByCpf(String cpf);
}

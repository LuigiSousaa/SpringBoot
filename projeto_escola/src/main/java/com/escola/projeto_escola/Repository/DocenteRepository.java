package com.escola.projeto_escola.Repository;

import org.springframework.data.repository.CrudRepository;

import com.escola.projeto_escola.Model.Docente;

public interface DocenteRepository extends CrudRepository<Docente, String> {

    Docente findByCpf(String cpf);

}

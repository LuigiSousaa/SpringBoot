package com.escola.projeto_escola.Repository;

import org.springframework.data.repository.CrudRepository;

import com.escola.projeto_escola.Model.Administrador;


public interface AdministradoresRepository extends CrudRepository<Administrador, String> {
    // Se preciso criar algum método extra, criarei aqui

    Administrador findByCpf(String cpf);

}

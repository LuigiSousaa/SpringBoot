package com.escola.projeto_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.escola.projeto_escola.Model.Administrador;
import com.escola.projeto_escola.Repository.AdministradoresRepository;
import com.escola.projeto_escola.Repository.VerficaCadastroAdmRepository;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class AdministradorController {

    @Autowired
    AdministradoresRepository ar;

    @Autowired
    VerficaCadastroAdmRepository vcar;

    @PostMapping("cadastrar-adm")
    public String cadatrarAdmBD(Administrador adm) {
        boolean verificaCpf = vcar.existsById(adm.getCpf());
        if (verificaCpf) {
            ar.save(adm);
            System.out.println("Cadastro realizado com sucesso!");
            return "redirect:/login-adm?cadastroSucesso=true";
        } else {
            System.out.println("Senha não cadastrada");
        }
        return "cadastro/cadastro-adm";
    }

    // @PostMapping("acesso-adm")
    // public String logarAdm(Administrador adm2) {
    //     boolean verificar = vcar.
        
    //     return entity;
    // }
    

}

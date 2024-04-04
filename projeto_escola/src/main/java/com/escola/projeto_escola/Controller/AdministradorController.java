package com.escola.projeto_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.escola.projeto_escola.Model.Administrador;
import com.escola.projeto_escola.Repository.AdministradoresRepository;
import com.escola.projeto_escola.Repository.VerficaCadastroAdmRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdministradorController {

    @Autowired
    AdministradoresRepository ar;

    @Autowired
    VerficaCadastroAdmRepository vcar;

    boolean acessoAdm = false;

    @PostMapping("cadastrar-adm")
    public String cadatrarAdm(Administrador adm) {
        boolean verificaCpf = vcar.existsById(adm.getCpf());
        if (verificaCpf) {
            ar.save(adm);
            System.out.println("Cadastro realizado com sucesso!");
            return "redirect:/login-adm";
        } else {
            System.out.println("Senha não cadastrada");
        }
        return "cadastro/cadastro-adm";
    }

    @GetMapping("/interna-adm")
    public String restricaoPaginaInternaAdm() {
        String goTo = "";
        if (acessoAdm) {
            goTo = "interna/interna-adm";
        } else {
            goTo = "redirect:/login-adm";
        }
        return goTo;
    }

    @PostMapping("/acesso-adm")
    public String acessoPagInternaAdm(@RequestParam String cpf, @RequestParam String senha) {
        boolean verificaCpf = ar.existsById(cpf);
        boolean verificaSenha = ar.findByCpf(cpf).getSenha().equals(senha);
        String url = "";
        if (verificaCpf && verificaSenha) {
            acessoAdm = true;
            url = "redirect:/interna-adm";
        } else {
            url = "redirect:/login-adm";
        }
        return url;
    }

}

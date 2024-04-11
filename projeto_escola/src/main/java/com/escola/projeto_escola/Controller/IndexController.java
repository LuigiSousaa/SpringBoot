package com.escola.projeto_escola.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


// Essa é a classe repsonsável pela definição de rotas
@Controller
public class IndexController {

    @GetMapping("/home")
    public String acessoHome() {
        return "index";
    }

    @GetMapping("/login-adm")
    public String acessoLoginAdm() {
        return "login/login-adm";
    }

    @GetMapping("/cadastro-adm")
    public String acessoCadastroAdm() {
        return "cadastro/cadastro-adm";
    }

    @GetMapping("/login-docente")
    public String acessoLoginDocente() {
        return "login/login-docente";
    }

    @GetMapping("/cadastro-docente")
    public String acessoCadadstroDocente() {
        return "cadastro/cadastro-docente";
    }

    @GetMapping("/login-aluno")
    public String acessoLoginAluno() {
        return "login/login-aluno";
    }

    @GetMapping("/cadastro-aluno")
    public String acessoCadastroAluno() {
        return "cadastro/cadastro-aluno";
    }
    
    

}

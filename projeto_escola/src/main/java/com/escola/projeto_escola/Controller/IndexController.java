package com.escola.projeto_escola.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Essa é a classe repsonsável pela definição de rotas
@Controller
public class IndexController {

    @GetMapping("/home")
    public String acessoHomePage() {
        return "index";
    }

    @GetMapping("/login-adm")
    public String acessoLoginAdmPage() {
        return "login/login-adm";
    }

    @GetMapping("/cadastro-adm")
    public String acessoCadastroAdmPage() {
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

}

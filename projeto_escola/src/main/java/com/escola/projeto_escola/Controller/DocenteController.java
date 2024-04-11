package com.escola.projeto_escola.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.escola.projeto_escola.Model.Docente;
import com.escola.projeto_escola.Repository.DocenteRepository;
import com.escola.projeto_escola.Repository.VerificaCadastroDocenteRepository;

@Controller
public class DocenteController {

    @Autowired
    DocenteRepository dr;

    @Autowired
    VerificaCadastroDocenteRepository vcdr;

    @PostMapping("cadastrar-docente")
    public String cadastrarDocente(Docente dc) {
        boolean verificaCpf = vcdr.existsById(dc.getCpf());
        if (verificaCpf) {
            dr.save(dc);
            System.out.println("Cadastro realizado com sucesso");
            return "redirect:/login-docente";
        } else {
            System.out.println("Erro ao salavar dados no banco");
        }

        return "cadastro/cadastro-docente";
    }

}

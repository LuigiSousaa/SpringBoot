package com.escola.projeto_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.escola.projeto_escola.Model.Aluno;
import com.escola.projeto_escola.Repository.AlunoRepository;
import com.escola.projeto_escola.Repository.VerificaCadastroAlunoRepository;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AlunoController {
    
    @Autowired
    AlunoRepository ar;

    @Autowired
    VerificaCadastroAlunoRepository vcar;

    @PostMapping("cadastrar-aluno")
    public String cadastrarAluno(Aluno aluno) {
        boolean verificaCpf = vcar.existsById(aluno.getCpf());
        if (verificaCpf) {
            ar.save(aluno);
            System.out.println("Aluno cadastrado com sucesso");
            return "redirect:/login-aluno";
        } else {
            System.out.println("Não foi possível cadastrar o aluno");
        }
        return "cadastro/cadastro-aluno";
    }
    
}

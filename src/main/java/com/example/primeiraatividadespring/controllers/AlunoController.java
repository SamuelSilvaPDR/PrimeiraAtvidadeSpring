package com.example.primeiraatividadespring.controllers;


import com.example.primeiraatividadespring.aluno.Aluno;
import com.example.primeiraatividadespring.aluno.AlunoRepository;
import com.example.primeiraatividadespring.aluno.DadosAluno;
import com.example.primeiraatividadespring.aluno.Disciplina;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController{
    private final AlunoRepository alunoRepository = new AlunoRepository();

    @PostMapping("/cadastro")
    public void cadastrarAluno(@RequestBody DadosAluno dados) {
        Aluno aluno = new Aluno(dados);
        alunoRepository.cadastrarAluno(aluno);
    }

    @GetMapping("/listaraluno")
    public List<Aluno> buscarAluno(@RequestParam String nome){
        return alunoRepository.buscarPorNome(nome);
    }
    @GetMapping(("/listardisc"))
    public List<Aluno> buscaDisc(@RequestParam Disciplina nome){
        return alunoRepository.buscarDisciplina(nome);
    }
}

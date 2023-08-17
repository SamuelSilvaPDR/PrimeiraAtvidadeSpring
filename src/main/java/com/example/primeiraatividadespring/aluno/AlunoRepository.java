package com.example.primeiraatividadespring.aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
    private List<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> buscarPorNome(String nome) {
        return alunos.stream().filter(aluno -> aluno.getNome().equals(nome)).toList();
    }

    public List<Aluno> buscarDisciplina(Disciplina nome) {
        return alunos.stream().filter(aluno -> aluno.getDisciplinas().equals(nome)).toList();
        }
    }

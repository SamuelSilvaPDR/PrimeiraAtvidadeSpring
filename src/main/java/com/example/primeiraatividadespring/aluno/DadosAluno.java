package com.example.primeiraatividadespring.aluno;


import java.time.LocalDate;

public record DadosAluno(
        long matricula,
        String nome,
        LocalDate data_nasc,
        String curso,
        int idade,
        Disciplina disciplinas
) {
}

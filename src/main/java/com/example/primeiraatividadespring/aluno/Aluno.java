package com.example.primeiraatividadespring.aluno;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Aluno {
    private long matricula;
    private String nome;
    private LocalDate data_nasc;
    private String curso;
    private int idade;
    private Disciplina disciplinas;

    public Aluno(DadosAluno dados) {
        this.matricula=dados.matricula();
        this.nome= dados.nome();
        this.data_nasc=dados.data_nasc();
        this.curso= dados.curso();
        this.idade= dados.idade();
        this.disciplinas=dados.disciplinas();
    }

}

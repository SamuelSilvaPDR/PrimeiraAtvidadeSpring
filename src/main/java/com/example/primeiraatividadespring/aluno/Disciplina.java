package com.example.primeiraatividadespring.aluno;

public enum Disciplina {
    Web,
    Estrutura,
    Gestao;

    public boolean match(Disciplina otherDisciplina) {
        return this.equals(otherDisciplina);
    }
}

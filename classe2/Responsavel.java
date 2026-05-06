class Responsavel extends Pessoa {
    Aluno[] alunos;

    Responsavel(String nome, String fone, String cpf, Aluno[] alunos) {
        super(nome, fone, cpf);
        this.alunos = alunos;
    }
}
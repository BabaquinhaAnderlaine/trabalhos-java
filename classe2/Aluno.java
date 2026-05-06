class Aluno extends Pessoa {
    String matricula;

    Aluno(String nome, String fone, String cpf, String matricula) {
        super(nome, fone, cpf);
        this.matricula = matricula;
    }

    void aprende() {
        System.out.println(nome + " está aprendendo.");
    }
}


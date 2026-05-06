class Professor extends Aluno {
    String titulo;

    Professor(String nome, String fone, String cpf, String matricula, String titulo) {
        super(nome, fone, cpf, matricula);
        this.titulo = titulo;
    }

    void ensina() {
        System.out.println(nome + " está ensinando.");
    }
}
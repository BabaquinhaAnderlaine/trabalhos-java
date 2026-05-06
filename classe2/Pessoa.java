    class Pessoa {
    String nome;
    String fone;
    String cpf;

    Pessoa(String nome, String fone, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
    }

    void saudacao() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
class Funcionario extends Pessoa {
    int cod;
    String funcao;

    Funcionario(String nome, String fone, String cpf, int cod, String funcao) {
        super(nome, fone, cpf);
        this.cod = cod;
        this.funcao = funcao;
    }

    void desempenhaFuncao() {
        System.out.println(nome + " exerce a função de " + funcao);
    }
}
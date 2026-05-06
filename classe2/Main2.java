public class Main2 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", "1111-1111", "123", "A01");
        Aluno a2 = new Aluno("Carlos", "2222-2222", "456", "A02");

        Professor prof = new Professor("Marcos", "3333-3333", "789", "P01", "Mestre");

        Funcionario func = new Funcionario("João", "4444-4444", "101", 1, "Secretário");

        Aluno[] lista = {a1, a2};
        Responsavel resp = new Responsavel("Maria", "5555-5555", "202", lista);

        a1.saudacao();
        a1.aprende();

        prof.saudacao();
        prof.ensina();

        func.saudacao();
        func.desempenhaFuncao();

        resp.saudacao();
    }
}
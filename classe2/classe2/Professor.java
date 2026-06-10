public class Professor extends Aluno {
    public String titulo;

    public Professor(String mtr1, String nome, String telefone, String cpf, String curso, String titulo) throws Dadoinvalido {
        super(mtr1, nome, telefone, cpf, curso);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String Saudacao() {
        return "Bem-vindo, professor!";
    }
}

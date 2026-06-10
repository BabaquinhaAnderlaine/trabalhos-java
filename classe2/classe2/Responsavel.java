import java.util.ArrayList;
import java.util.List;
public class Responsavel extends Pessoa {

    public List<Aluno> alunos;

    public Responsavel(String nome, String telefone, String cpf) throws Dadoinvalido {
        super(nome, telefone, cpf);
        this.alunos = new ArrayList<>();
    }


    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public String Saudacao1() {
        StringBuilder sb = new StringBuilder();
        sb.append("Oi, eu sou ").append(getNome()).append(" | meu telefone eh: ").append(getTelefone()).append(" | meu cpf eh: ").append(getCpf());
        if (!alunos.isEmpty()) {
            sb.append(" | sou responsavel pelos alunos: ");
            for (Aluno a : alunos) {
                sb.append(a.getNome()).append(" (").append(a.getCpf()).append("), ");
            }
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String Saudacao() {
        return "Bem-vindo, responsável!";
    }
}

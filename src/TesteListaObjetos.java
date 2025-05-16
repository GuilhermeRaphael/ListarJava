import java.util.ArrayList;

public class TesteListaObjetos {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriel", "9898989898");
        Aluno aluno2 = new Aluno("Gabriela", "99999999999");
        Aluno aluno3 = new Aluno("Rafaela", "10000000000");

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno);
        alunos.add(aluno2);
        alunos.add(aluno3);
        //comando foreach
        for (Aluno a : alunos) {
            System.out.println("Nome: " + a.nome + " telefone: " + a.telefone);
        }
        alunos.forEach(a -> System.out.println(a.nome + " telefone: " + a.telefone));
        alunos.forEach(alu -> {
            System.out.println(alu.nome + " telefone: ");
            System.out.println(alu.telefone);
        });
    }
}

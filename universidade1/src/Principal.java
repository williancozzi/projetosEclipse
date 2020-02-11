import br.ucb.universidade1.Aluno;
import br.ucb.universidade1.Curso;
import br.ucb.universidade1.Pessoa;
import br.ucb.universidade1.Professor;

public class Principal {

	public static void main(String[] args) {
		Professor p1 = new Professor(Curso.EXATAS, "prof", "123", false);
		Aluno aluno = new Aluno(Curso.EXATAS, "will", "1234", false, 3, 5, 7);
		Aluno aluno2 = new Aluno(Curso.EXATAS, "will2", "1234", false, 1, 5, 7);
		Aluno aluno3 = new Aluno(Curso.HUMANAS, "will3", "1234", false, 2, 5, 7);
		Aluno aluno4 = new Aluno(Curso.EXATAS, "will4", "1234", false, 4, 5, 7);
		Aluno aluno5 = new Aluno(Curso.EXATAS, "will5", "1234", false, 7, 5, 7);
		p1.adicionarAluno(aluno);
		p1.adicionarAluno(aluno2);
		p1.adicionarAluno(aluno3);
		p1.adicionarAluno(aluno4);
		p1.adicionarAluno(aluno5);
		aluno.calcularMedia(3, 5, 7);
		aluno2.calcularMedia(1, 5, 7);
		aluno3.calcularMedia(2, 5, 7);
		aluno4.calcularMedia(4, 5, 7);
		aluno5.calcularMedia(7, 5, 7);
		aluno3.logar("will3", "1234", false);
		p1.mostrarAlunos();
		
		
		

	}

}

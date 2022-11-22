package Alunos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A) Utilize uma estrutura de alocação estática (vetor) para a tarefa
		Alunos a = new Alunos(5);
		
		a.adicionar("Vinicius ", 10, " CC");
		a.adicionar("Mateus ", 11, " CC");
		a.adicionar("Henrique ", 12, " CC");
		
		a.popMatricula("12");
		
		a.printArray();
		
		
//		B) Crie um método para realizar a inserção de um novo aluno na primeira posição disponível no vetor
//		System.out.println(a.base());
		
		//D)  Crie um método para informar a quantidade de posições vazias (sem alunos) na estrutura
//		a.qtd_element_vazio();
//		
//		// E) Crie um método que retorne a quantidade de alunos armazenados na lista
//		System.out.println(a.qtdAlunos());
//		
//		// F)  Implemente a função de inserção em uma mente de tamanho para caber mais posições. Toda vez que a estrutura estiver cheia ela deve aumentar em 5 posições.
//		a.novoTamanho();
		

	}

}

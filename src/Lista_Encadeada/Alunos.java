package Lista_Encadeada;


public class Alunos {

	    private static class No{
	        public No prox; // próximo nó na lista
	        public Aluno aluno; // elemento (valor) armazenado na lista 
	        
	        public No (Aluno elem ){ //construtor do nó da lista
	        	aluno = elem; 
	        	prox = null;
	        }
	    }
	    
	    private No inicio; //representa a cabeça (início) da lista
	    
	    public Alunos(){   // construtor da lista
	        inicio = null;
	    }

	  public boolean isEmpty(){
	    return inicio == null;
	  }
	    
	  public boolean search( Aluno elem){
	    for(No nodo = inicio; nodo != null; nodo = nodo.prox)
	       if (elem == nodo.aluno) return true; //econtrou o elemento
	    return false;                     // não encontrou o elemento
	            
	  }

	  public void insereInicio(Aluno elem){ //insere no início da lista
	        No novoNo = new No(elem);
	        novoNo.prox = inicio; //novoNo -> inicio antigo
	        inicio = novoNo;      // inicio -> novoNo
	    }
	  
	  public void insereFinal(Aluno elem){ //insere no final da lista
	        No novoNo = new No(elem);
	        novoNo.prox = inicio ; //novoNo -> inicio antigo
	    }
	    
	    public void removeInicio(){ //elimina o primiro item da lista
	        inicio = inicio.prox; // elimina o elemento e reposiciona o início
	    }
	    
	    public String exibeLista(){
	        if(isEmpty()) return "Lista vazia\n"; //teste de lista vazia
	        String str = "Lista Encadeada: ";
	        for (No nodo = inicio; nodo != null; nodo = nodo.prox)
	            str+= " "+ nodo.aluno;
	        return str + "\n";
	    }

	}// fim da classe Lista



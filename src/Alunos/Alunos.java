package Alunos;

public class Alunos {
	
	private String[] sala;
    private String nome;
    private int matricula;
    private String curso;
    private int base;
   
    private int topo;
    private int tam_max;
    
    
    private int cont;
    
    // Construtor
    public Alunos(int quantidade) {
    	sala = new String[quantidade];
    	tam_max = quantidade;
    	topo = 0;
    	base = 0;
    }
    
    public void adicionar(String nome, int matricula, String curso) {
    	sala[topo] = nome + matricula + curso;
    	//System.out.println(sala[topo]);
    	topo++;
    	if (vazio() == true) {
    		base = topo;
    	}
    }
    
    public void pop() {
    	topo--;
    }
    
    public String top() {
    	return sala[topo -1];
    }
    public String base() {
    	return sala[base];
    }
    
    public boolean vazio() {
        return (topo == 0);
    }
    
    public String exibeUltimoValor() {
    	return sala[topo - 1];
    }

    public void qtd_element_vazio() {
    	while (!(topo == tam_max)) {
    		cont++;
    		tam_max--;
    	}
    	System.out.println(cont);
    }
    
    public boolean cheio() {
        return (topo == tam_max);
    }

    public int qtdAlunos() {
        return topo;
    }
        
    public void  novoTamanho() {

    	String sala2[] = new String[sala.length + 5];
    	for (int i = 0; i < sala.length; i++) {
    		sala2[i] = sala[i];
    		System.out.println(i);
		}
    	sala = sala2;
    }
    
    public void  adicionarPrimeiro(String nome, int matricula, String curso) {
    	String sala3[] = new String[sala.length + 1];
    	
    	for (int i = 0; i < (sala.length); i++) {
    		if(i == 0) {
    			sala3[i] = nome + matricula + curso;
    		}else {
    			sala3[i] = sala[i -1];
    		}		
		}
    	sala = sala3;
    }
    
    public void popMatricula(CharSequence matricula) {
    	String sala4[] = new String[sala.length];
    	
    	for (int i = 0; i < sala.length; i++) {
    		if (this.sala[i] != null) {
    			if (!this.sala[i].contains(matricula)) {
    				sala4[i] = sala[i];
    			}
    		}
		}
    	sala = sala4;
    }
    
    public void printArray() {
    	for (int i = 0; i < sala.length; i++) {
			System.out.println(sala[i]);
			
		}
    }

}

package prova1b;

public abstract class Participante {

	private String nome;
	
	abstract void enviaMensagem(String texto, Grupo g);
	
	public String toString() {
		return nome;
	}

	public Object getNome() {
		
		return null;
	}
}

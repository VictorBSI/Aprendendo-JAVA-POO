package prova1b;

import static java.util.Arrays.copyOf;

public class Grupo {

	private String nome;
	private int tamanho;
	public Grupo(String nome) {
		super();
		this.nome = nome;
	}

	private Mensagem[] mensagens = new Mensagem[0];
	private Participante[] participantes = new Participante[0];
	
	public void additionarParticipante(Participante p) {
		Participante[] ps = copyOf(participantes, participantes.length + 1);
		ps[participantes.length] = p;
		this.participantes = ps;
	}
	
	public boolean removerParticipante(Participante p) {
		for (int i = 0; i < participantes.length; i++) {
			if(participantes[i].equals(p)) {
				Participante[] ps = new Participante[participantes.length -1];
				int remainingElements = participantes.length - (i + 1);
				System.arraycopy(participantes, 0, ps, 0, i);
				System.arraycopy(participantes, i+ 1, ps, i, remainingElements);
				
				this.participantes = ps;
				return true;
			}
		}
		return false;
	}
	
	public void enviaMensagem(Mensagem m) {
		Mensagem[] msg = copyOf(mensagens, mensagens.length + 1);
		msg[mensagens.length] = m;
		this.mensagens = msg;
		this.tamanho = mensagens.length;
	}
	
	public String getNome(){
		return nome;
	}
	
	public Participante[] getParticipantes(){
		return participantes;
	}

	public Mensagem[] getMensagens(){
		return mensagens;
	}

	public void additionarParticipante(Moderador moderador) {
		// TODO Auto-generated method stub
		
	}

}

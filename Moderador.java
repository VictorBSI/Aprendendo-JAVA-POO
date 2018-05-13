package prova1b;

public class Moderador implements SuperParticipante{

	private String nomemod;
	private Grupo grupo;
	
	
	public Moderador(String nomemod) {
		this.nomemod = nomemod;
	}

	public Grupo criarGrupo(String nome){
		Grupo g = new Grupo(nome);
		//g.additionarParticipante(this);
		this.grupo = g;
		return g;
	}

	public void addicionarParticipante(Usuario p) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public boolean removerParticipante(Participante p) {
		// TODO Auto-generated method stub
		return false;
	}

	/*/@Override
	public Grupo criarGrupo(String nome) {
		this.nomemod = nome;
		return null;
	}*/
	
	public String getNome(){
		return nomemod;
	}

	@Override
	public void addicionarParticipante(Participante p) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean removerParticipante(Usuario p){
		return false;
		
	}

	public void enviaMensagem(String string, Grupo turmaOO2) {
		// TODO Auto-generated method stub
		
	}
	
	/*public boolean removerParticipante(Usuario p){
		return
	}*/
}

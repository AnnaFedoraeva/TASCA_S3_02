package observer;

import java.util.ArrayList;
import java.util.List;

public class Agente {

	private String evento;
	private List<Agencia> agencias = new ArrayList<>();

	public void subscribe(Agencia agencia) {
		this.agencias.add(agencia);
	}

	public void unsubscribe(Agencia agencia) {
		this.agencias.remove(agencia);
	}

	public void notificar(String evento) {
		this.evento = evento;
		for (Agencia agencia : this.agencias) {
			agencia.update(this.evento);
		}

	}

}
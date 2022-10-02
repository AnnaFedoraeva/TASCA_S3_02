package observer;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agente observable = new Agente();
		Agencia observer = new Agencia();
		Agencia observer2 = new Agencia();
		Agencia observer3 = new Agencia();

		observable.subscribe(observer);
		observable.subscribe(observer2);
		observable.subscribe(observer3);
		observable.notificar("baja");
		observable.unsubscribe(observer);
		observable.notificar("sube");
		
		
		
	}

}

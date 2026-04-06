import java.util.ArrayList;
import java.util.List;

public class MotorDeCombate {

    private List<ObserverMorte> observadores = new ArrayList<>();

    public void adicionarObservador(ObserverMorte observador){
        observadores.add(observador);
    }

    public double calcularDanoBase(CalcularDano dano, double poderDeAtaque) {
        return dano.calcular(poderDeAtaque);
    }

    // ERRO 2: O Motor de Combate instancia classes de infraestrutura diretamente com 'new'.
    public void processarMorte(Personagem personagem) {
        System.out.println("O personagem morreu em combate!");

       for (ObserverMorte observer : observadores) {
           observer.reagirMorte(personagem);
       }
    }
}
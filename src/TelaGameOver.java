public class TelaGameOver implements ObserverMorte{

    public void exibir() {
        System.out.println("Tela Game Over");
    }

    @Override
    public void reagirMorte(Personagem personagem) {
        exibir();
    }
}

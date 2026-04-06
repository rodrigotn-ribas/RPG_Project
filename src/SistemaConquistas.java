public class SistemaConquistas implements ObserverMorte{
    public void verificarPenalidade() {
        System.out.println("Registrando -> Penalidade");
    }

    @Override
    public void reagirMorte(Personagem personagem) {
        verificarPenalidade();
    }
}

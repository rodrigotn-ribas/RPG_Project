public class MotorDeCombate {
    // ERRO 0: A matemática do dano viola o Princípio Aberto/Fechado.
    public double calcularDanoBase(String classe, double poderDeAtaque) {
        if (classe.equals("Rogue")) {
            return poderDeAtaque * 1.5 + 20;
        } else if (classe.equals("Shadow Priest")) {
            return poderDeAtaque * 1.2 + 50;
        } else if (classe.equals("Enhancement Shaman")) {
            return poderDeAtaque * 1.8;
        } else {
            return poderDeAtaque;
        }
    }

    // ERRO 1: O Motor de Combate instancia classes de infraestrutura diretamente com 'new'.
    public void processarMorte(Personagem personagem) {
        System.out.println("O personagem morreu em combate!");

        TelaGameOver tela = new TelaGameOver();
        LogServidor log = new LogServidor();
        SistemaConquistas conquistas = new SistemaConquistas();

        tela.exibir();
        log.registrar("Morte registrada.");
        conquistas.verificarPenalidade();
    }
}
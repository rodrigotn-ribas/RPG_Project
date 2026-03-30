public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private String statusAtual = "VIVO"; // Pode ser "VIVO", "ATORDOADO" ou "MORTO"

    // Atributos secundários
    private boolean temMontariaVoadora;
    private boolean companheiroGabi;
    private boolean companheiroGigi;

    // TODO 0: Remover os atributos secundários, criando um construtor essencial, e um para os atributos secundários
    // ERRO 0: Construtor Telescópico. O que significam todos esses trues e falses na chamada?
    public Personagem(String nome, String classe, int nivel, boolean temMontariaVoadora,
                      boolean companheiroGabi, boolean companheiroGigi) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.temMontariaVoadora = temMontariaVoadora;
        this.companheiroGabi = companheiroGabi;
        this.companheiroGigi = companheiroGigi;
    }

    // TODO 1: Criar classes com esses argumentos e métodos
    // ERRO 1: O comportamento de ataque está amarrado a condições rígidas de estado.
    public void atacar() {
        if (statusAtual.equals("VIVO")) {
            System.out.println(nome + " ataca o inimigo com força total!");
        } else if (statusAtual.equals("ATORDOADO")) {
            System.out.println(nome + " está tonto e não consegue atacar!");
        } else if (statusAtual.equals("MORTO")) {
            System.out.println("Personagens mortos não atacam.");
        }
    }
}
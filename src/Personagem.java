public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private String statusAtual = "VIVO"; // Pode ser "VIVO", "ATORDOADO" ou "MORTO"
    private boolean temMontariaVoadora;
    private boolean companheiroGabi;
    private boolean companheiroGigi;

    private EstadoPersonagem estadoAtual = new EstadoVivo();


    public Personagem(PersonagemBuilder builder){
        this.nome = builder.nome;
        this.classe = builder.classe;
        this.nivel = builder.nivel;
        this.temMontariaVoadora = builder.temMontariaVoadora;
        this.companheiroGabi = builder.companheiroGabi;
        this.companheiroGigi = builder.companheiroGigi;
    }

    public String getNome(){
        return nome;
    }

    public void setEstadoAtual(EstadoPersonagem estadoAtual){
        this.estadoAtual = estadoAtual;
    }

    // ERRO 2: O comportamento de ataque está amarrado a condições rígidas de estado.
    public void atacar() {
       estadoAtual.atacar(this);
    }

    public static class PersonagemBuilder{
        private String nome;
        private String classe;
        private int nivel = 1;
        private boolean temMontariaVoadora = false;
        private boolean companheiroGabi = false;
        private boolean companheiroGigi = false;

        public PersonagemBuilder(String nome, String classe){
            this.nome = nome;
            this.classe = classe;
        }

        public PersonagemBuilder comNivel(int nivel){
            this.nivel = nivel;
            return this;
        }

        public PersonagemBuilder comMontaria(){
            this.temMontariaVoadora = true;
            return this;
        }

        public PersonagemBuilder comCopanheiroGabi(boolean companheiroGabi){
            this.companheiroGabi = companheiroGabi;
            return this;
        }


        public PersonagemBuilder comCopanheiroGigi(boolean companheiroGigi){
            this.companheiroGigi = companheiroGigi;
            return this;
        }

        public Personagem build(){
            return new Personagem(this);
        }
    }

}


public class ConexaoServidorRio {
    private static ConexaoServidorRio instacia;

    private ConexaoServidorRio() {
        System.out.println("[REDE] Nova conexão pesada estabelecida com o servidor do Rio de Janeiro...");
    }

    public static ConexaoServidorRio getInstance(){
        if(instacia == null){
            instacia = new ConexaoServidorRio();
        }

        return instacia;
    }

    public void sincronizarDados() {
        System.out.println("Dados sincronizados com o banco de dados do servidor.");
    }
}
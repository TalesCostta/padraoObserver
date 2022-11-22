//Padrão de projeto Observer utilizando a API do Java.

public class App {
    public static void main(String[] args) throws Exception {
        int novaEdicao = 2;

        //É o Subject que está aguardando registros do cliente.
        RevistaInformatica revistaInformatica = new RevistaInformatica();
        
        //Assinante que regista na RevistaInformatica para receber notificações sempre que uma nova edição for publicada.
        Assinante1 assinante1 = new Assinante1(revistaInformatica);

        revistaInformatica.setNovaEdicao(novaEdicao);
    }
}

public class EnvioEmail implements CanalNotificacao {
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando Email: " + mensagem);
    }
}
public class EnvioMensagem implements CanalNotificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando SMS: " + mensagem);
    }
}
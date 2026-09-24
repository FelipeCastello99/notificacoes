public class ServicoNotificacao {
    public void enviar (CanalNotificacao canal, String mensagem){
    	ValidadorNotificacao validador = new ValidadorNotificacao();
    	if(validador.validarMensagem(mensagem)) {
    		canal.enviar(mensagem);    		
    	}
    }
}
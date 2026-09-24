public class Main {
    public static void main(String[] args) {
            ServicoNotificacao servicoNotificacao = new ServicoNotificacao();
            ValidadorNotificacao validador = new ValidadorNotificacao();
            EnvioEmail email = new EnvioEmail();
            EnvioMensagem mensagem = new EnvioMensagem();

            String mensagemEmail = "Um email muito importante";
            String mensagemSMS = "Uma mensagem muito importante";

            servicoNotificacao.enviar(email, mensagemEmail);
            servicoNotificacao.enviar(mensagem, mensagemSMS);
    }
}
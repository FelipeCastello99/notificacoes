public class ValidadorNotificacao {
    public boolean validarMensagem(String mensagem){
        if(mensagem == null || mensagem.trim().isEmpty()){
            System.out.println("A mensagem está vazia");
            return false;
        }
        return true;
    }
}
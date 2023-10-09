public class Computador {
    public static void main(String[] args) {
        MsnMessenger msn = new MsnMessenger();

        msn.enviarMensagem();

        msn.receberMensagem();

        FacebookMessenger fcbm = new FacebookMessenger();

        fcbm.enviarMensagem();

        fcbm.receberMensagem();

        TelegramMessenger tlm = new TelegramMessenger();
        tlm.enviarMensagem();
        tlm.receberMensagem();
    }

}

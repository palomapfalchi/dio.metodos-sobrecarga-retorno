//Bom dia, boa tarde ou boa noite

public class Mensagem {

    public static void obterMensagem(int hora) {
        if (hora >= 5 && hora < 12) {
            System.out.println("Bom dia! São " + hora + "h");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde! São " + hora + "h");
        } else {
            System.out.println("Boa noite! São " + hora + "h");
        }
    }
}

public class AparelhoTelefonico {

    private boolean ligado;
    private boolean chamadaRecebida;

    public AparelhoTelefonico() {
        ligado = false;
        chamadaRecebida = false;
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("Ligando o aparelho telefônico.");
            ligado = true;
        } else {
            System.out.println("O aparelho telefônico já está ligado.");
        }
    }

    public void atender() {
        if (ligado && chamadaRecebida) {
            System.out.println("Atendendo a chamada.");
        } else if (!ligado) {
            System.out.println("Não é possível atender, o aparelho telefônico não está ligado.");
        } else {
            System.out.println("Não há chamada para atender.");
        }
    }

    public void iniciarCorreioVoz(ReprodutorMusical reprodutor) {
        if (ligado) {
            System.out.println("Iniciando o correio de voz.");
            reprodutor.iniciarCorreioVoz();
        } else {
            System.out.println("Não é possível iniciar o correio de voz, o aparelho telefônico não está ligado.");
        }
    }

    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        telefone.ligar();
        telefone.atender();

        reprodutor.tocar();
        telefone.iniciarCorreioVoz(reprodutor);
    }
}

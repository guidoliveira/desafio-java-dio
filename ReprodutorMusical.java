public class ReprodutorMusical {

    private boolean emExecucao;
    private boolean emPausa;
    private boolean correioVozAtivo;

    public ReprodutorMusical() {
        emExecucao = false;
        emPausa = false;
        correioVozAtivo = false;
    }

    public void tocar() {
        if (!emExecucao) {
            System.out.println("Tocando música.");
            emExecucao = true;
            emPausa = false;
            correioVozAtivo = false;
        } else {
            System.out.println("A música já está tocando.");
        }
    }

    public void pausar() {
        if (emExecucao && !emPausa) {
            System.out.println("Pausando música.");
            emPausa = true;
        } else if (!emExecucao) {
            System.out.println("Não é possível pausar, a música não está tocando.");
        } else {
            System.out.println("A música já está pausada.");
        }
    }

    public void iniciarCorreioVoz() {
        if (!correioVozAtivo) {
            System.out.println("Iniciando correio de voz.");
            emExecucao = false;
            emPausa = false;
            correioVozAtivo = true;
        } else {
            System.out.println("O correio de voz já está ativo.");
        }
    }

    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.tocar();
        reprodutor.iniciarCorreioVoz();
    }
}

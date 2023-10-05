import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {

    private List<String> abasAbertas;
    private int abaAtual;

    public NavegadorInternet() {
        abasAbertas = new ArrayList<>();
        abaAtual = -1;
    }

    public void adicionarNovaAba(String url) {
        abasAbertas.add(url);
        abaAtual = abasAbertas.size() - 1;
        System.out.println("Nova aba adicionada: " + url);
    }

    public void exibirPágina() {
        if (abaAtual >= 0 && abaAtual < abasAbertas.size()) {
            String urlAtual = abasAbertas.get(abaAtual);
            System.out.println("Exibindo página: " + urlAtual);
        } else {
            System.out.println("Nenhuma aba aberta ou aba atual não encontrada.");
        }
    }

    public void atualizarPágina() {
        if (abaAtual >= 0 && abaAtual < abasAbertas.size()) {
            String urlAtual = abasAbertas.get(abaAtual);
            System.out.println("Atualizando página: " + urlAtual);
        } else {
            System.out.println("Nenhuma aba aberta ou aba atual não encontrada.");
        }
    }

    public static void main(String[] args) {
        NavegadorInternet navegador = new NavegadorInternet();

        navegador.adicionarNovaAba("https://www.google.com");
        navegador.exibirPágina();

        navegador.adicionarNovaAba("https://www.example.com");
        navegador.exibirPágina();

        navegador.atualizarPágina();
    }
}

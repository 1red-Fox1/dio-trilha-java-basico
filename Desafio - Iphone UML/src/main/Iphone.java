package main;

import main.interfaces.Acoes;
import main.records.ReprodutorMusical;
import main.records.NavegadorInternet;
import main.records.AparelhoTelefonico;

import java.util.Scanner;

public class Iphone {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean bool = true;
        Acoes acao = null;

        while(bool) {
            System.out.println("===============================================");
            System.out.println("Escolha a ação que quer fazer com o seu Iphone: ");
            System.out.println("[1] - Reproduzir Música");
            System.out.println("[2] - Navegar pela Internet");
            System.out.println("[3] - Ligar para alguém");
            System.out.println("[4] - Sair");

            int opcao = input.nextInt();

            if (opcao == 1) {
                boolean escolhaMusica = true;

                while (escolhaMusica) {
                    System.out.println("\n======= Escolheu musica =======\n");
                    System.out.println("[1] - Tocar Música");
                    System.out.println("[2] - Pausar Música");
                    System.out.println("[3] - Selecionar Música");
                    System.out.println("[4] - Sair");

                    int acaoMusica = input.nextInt();

                    switch (acaoMusica) {
                        case 1 -> System.out.println("\n" + tocar().MostrarAcao());
                        case 2 -> System.out.println("\n" + pausar().MostrarAcao());
                        case 3 -> {
                            System.out.print("Insira o nome da música: ");
                            System.out.println("\n" + selecionarMusica(input.next()).MostrarAcao());
                        }
                        case 4 -> escolhaMusica = false;
                        default -> {
                            System.out.println("\nDigite uma alternativa válida!\n");
                            break;
                        }
                    }

                }
            } else if (opcao == 2) {
                boolean escolhaInternet = true;

                while (escolhaInternet) {
                    System.out.println("\n======= Escolheu Internet =======\n");
                    System.out.println("[1] - Exibir Página da Internet");
                    System.out.println("[2] - Adicionar Nova Aba");
                    System.out.println("[3] - Atualizar Página");
                    System.out.println("[4] - Sair");

                    int acaoMusica = input.nextInt();

                    switch (acaoMusica){
                        case 1 -> {
                            System.out.println("Insira a url da página: ");
                            System.out.println("\n" + exibirPagina(input.next()).MostrarAcao());
                        }
                        case 2 -> System.out.println("\n" + adicionarNovaAba().MostrarAcao());
                        case 3 -> System.out.println("\n" + atualizarPagina().MostrarAcao());
                        case 4 -> escolhaInternet = false;
                        default -> {
                            System.out.println("\nDigite uma alternativa válida!\n");
                            break;
                        }
                    }
                }
            } else if (opcao == 3) {
                boolean escolhaTelefonar = true;

                while (escolhaTelefonar) {
                    System.out.println("\n======= Escolheu Ligação =======\n");
                    System.out.println("[1] - Ligar para Alguém");
                    System.out.println("[2] - Atender Ligação");
                    System.out.println("[3] - Iniciar Chamada");
                    System.out.println("[4] - Sair");

                    int acaoMusica = input.nextInt();

                    switch (acaoMusica){
                        case 1 -> {
                            System.out.println("Digite o número: ");
                            System.out.println("\n" + ligar(input.next()).MostrarAcao());
                        }
                        case 2 -> System.out.println("\n" + atender().MostrarAcao());
                        case 3 -> System.out.println("\n" + iniciarChamadaPorVoz().MostrarAcao());
                        case 4 -> escolhaTelefonar = false;
                        default -> {
                            System.out.println("\nDigite uma alternativa válida!\n");
                            break;
                        }
                    }
                }
            } else if (opcao == 4) bool = false;
            else {
                System.out.println("\nDigite uma alternativa válida!\n");
            }
        }

    }

    private static Acoes tocar() {
        return new ReprodutorMusical("Iniciando a música...");
    }
    private static Acoes pausar() {
        return new ReprodutorMusical("Pausando a música...");
    }
    private static Acoes selecionarMusica(String nomeMusica) {
        return new ReprodutorMusical("Tocando a música " + nomeMusica + "...");
    }
    
    private static Acoes exibirPagina(String url) {
        return new NavegadorInternet("Abrindo a página: " + url + "...");
    }
    private static Acoes adicionarNovaAba() {
        return new NavegadorInternet("Adicionando nova aba...");
    }
    private static Acoes atualizarPagina() {
        return new NavegadorInternet("Atualizando página atual...");
    }

    private static Acoes ligar(String numero) {
        return new AparelhoTelefonico("Ligando para o número " + numero + "...");
    }
    private static Acoes atender() {
        return new AparelhoTelefonico("Atendendo chamada telefônica...");
    }
    private static Acoes iniciarChamadaPorVoz() {
        return new AparelhoTelefonico("Iniciando chamada por voz...");
    }

}

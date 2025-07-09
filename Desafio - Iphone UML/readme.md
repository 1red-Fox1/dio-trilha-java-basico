##Código do diagrama

classDiagram
%% Interface Reprodutor Musical
class ReprodutorMusical {
+tocar(): void
+pausar(): void
+selecionarMusica(musica: String): void
}

    %% Interface Aparelho Telefônico
    class AparelhoTelefonico {
        +ligar(numero: String): void
        +atender(): void
        +iniciarCorreioVoz(): void
    }

    %% Interface NavegadorInternet
    class NavegadorInternet {
        +exibirPagina(url: String): void
        +adicionarNovaAba(): void
        +atualizarPagina(): void
    }

    %% Classe iPhone (implementa todas as interfaces)
    class IPhone {
        -modelo: String
        -versao: String
        +IPhone(modelo: String, versao: String)
        +tocar(): void
        +pausar(): void
        +selecionarMusica(musica: String): void
        +ligar(numero: String): void
        +atender(): void
        +iniciarCorreioVoz(): void
        +exibirPagina(url: String): void
        +adicionarNovaAba(): void
        +atualizarPagina(): void
    }

    %% Relações (implementação de interfaces)
    IPhone --|> ReprodutorMusical
    IPhone --|> AparelhoTelefonico
    IPhone --|> NavegadorInternet

package main.records;

import main.interfaces.Acoes;

public record NavegadorInternet(String acao) implements Acoes {

    @Override
    public String MostrarAcao() {
        return acao;
    }

}
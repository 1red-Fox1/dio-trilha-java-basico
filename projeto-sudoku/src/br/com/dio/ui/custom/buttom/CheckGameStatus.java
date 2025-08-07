package br.com.dio.ui.custom.buttom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CheckGameStatus extends JButton {

    public CheckGameStatus(final ActionListener actionListener) {
        this.setText("Verificar Jogo");
        this.addActionListener(actionListener);
    }

}

package PAQUETON;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        String decisionUsuario = "";
        String decicionCPU;

        // muestra un cuadro de dialogos
        String[] options = { "Piedra", "Papel", "Tijeras" };
        int respuesta = JOptionPane.showOptionDialog(null, "Elige", "Juego de Piedra, Papel o Tijeras",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

        // anignacion decicion usuario
        switch (respuesta) {
            case 0:
                decisionUsuario = "Piedra";
                break;
            case 1:
                decisionUsuario = "Papel";
                break;
            case 2:
                decisionUsuario = "Tijeras";
                break;
        }

        // decicion computadora aleatoria
        double numRandom = Math.random();
        if (numRandom < 0.33) {
            decicionCPU = "Piedra";
        } else if (numRandom < 0.66) {
            decicionCPU = "Papel";
        } else {
            decicionCPU = "Tijeras";
        }

        // comparando elecciones
        if (decisionUsuario == "Piedra" && decicionCPU == "Papel") {
            JOptionPane.showConfirmDialog(null, decisionUsuario + " VS " + decicionCPU + "...Perdiste!", "Resultado",
                    JOptionPane.CLOSED_OPTION);
        } else if (decisionUsuario == "Piedra" && decicionCPU == "Tijeras") {
            JOptionPane.showConfirmDialog(null, decisionUsuario + " VS " + decicionCPU + "...Ganaste!", "Resultado",
                    JOptionPane.CLOSED_OPTION);
        } else if (decisionUsuario == "Papel" && decicionCPU == "Piedra") {
            JOptionPane.showConfirmDialog(null, decisionUsuario + " VS " + decicionCPU + "...Ganaste!", "Resultado",
                    JOptionPane.CLOSED_OPTION);
        } else if (decisionUsuario == "Papel" && decicionCPU == "Tijeras") {
            JOptionPane.showConfirmDialog(null, decisionUsuario + " VS " + decicionCPU + "...Perdiste!", "Resultado",
                    JOptionPane.CLOSED_OPTION);
        } else if (decisionUsuario == "Tijeras" && decicionCPU == "Piedra") {
            JOptionPane.showConfirmDialog(null, decisionUsuario + " VS " + decicionCPU + "...Perdiste!", "Resultado",
                    JOptionPane.CLOSED_OPTION);
        } else if (decisionUsuario == "Tijeras" && decicionCPU == "Papel") {
            JOptionPane.showConfirmDialog(null, decisionUsuario + " VS " + decicionCPU + "...Ganaste!", "Resultado",
                    JOptionPane.CLOSED_OPTION);
        } else {
            JOptionPane.showConfirmDialog(null, "Es un empate!", "Resultado", JOptionPane.CLOSED_OPTION);

        }

    }
}
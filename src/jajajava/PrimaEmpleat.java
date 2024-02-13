/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jajajava;

/**
 *
 * @author jgalvez.daw1r23
 */
public class PrimaEmpleat {

    private String nom;
    private String directiu;
    private int antiguitat;
    private static int prima1 = 600;
    private static int prima2 = 400;
    private static int prima3 = 150;
    private static int prima4 = 100;

    public static void main(String[] args) {
        PrimaEmpleat e = new PrimaEmpleat("Elvira", "S", 11);
        PrintPrimaEmpleat(e);
    }

    public PrimaEmpleat(String nome, String dire, int ante) {
        this.nom = nome;
        this.directiu = dire;
        this.antiguitat = ante;
    }

    public static void PrintPrimaEmpleat(PrimaEmpleat e) {
        String errorSN = "El codi del càrrec ha de ser 'S' o 'N'";
        String errorAnt = "La antiguitat ha de ser un nombre entre 0 i 999";
        int p = 0;
        
        if (e.antiguitat >= 0 && e.antiguitat < 1000) {
            if ("S".equals(e.directiu)) {
                if (e.antiguitat > 12) {
                    p = prima1;
                } else {
                    p = prima2;
                }
            } else if ("N".equals(e.directiu)) {
                if (e.antiguitat > 12) {
                    p = prima3;
                } else {
                    p = prima4;
                }
            } else {
                System.out.println(errorSN);
            }
            if (p != 0) {
                System.out.println("La prima que li correspon a " + e.nom
                        + " és de " + p + " Euros");
            }
        } else {
            System.out.println(errorAnt);
        }
    }
}

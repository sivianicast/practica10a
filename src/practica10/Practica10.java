package practica10;

import javax.swing.JOptionPane;

public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //esta es la version 2
        String numTodos = "";
        int num = 1;
        while (num <= 100) {
            numTodos = numTodos + num + "  ";
            num++;
        }

        JOptionPane.showMessageDialog(null, "Ud ya salio del programa");
        //opcion de salida del menu
    }
}

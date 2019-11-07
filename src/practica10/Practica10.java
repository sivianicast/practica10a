package practica10;

import javax.swing.JOptionPane;

public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //esta es la version 2
        
        JOptionPane.showMessageDialog(null, "Ud inicio el programa");

        String numTodos = "";
        int num = 1;
        while (num <= 100) {
            numTodos = numTodos + num + "  ";
            num++;
        }

        JOptionPane.showMessageDialog(null, numTodos);
        JOptionPane.showMessageDialog(null, "Ud ya salio del programa");
        
        
    }

}

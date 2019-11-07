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
<<<<<<< HEAD

        JOptionPane.showMessageDialog(null, numTodos);
        JOptionPane.showMessageDialog(null, "Ud ya salio del programa");
        //opcion de salida del menu
        
=======
        //quite la impresion 
        //JOptionPane.showMessageDialog(null, numTodos);
>>>>>>> 8863e46c1bb1c095608d10cfaf6256ce0660d7a5
    }
}

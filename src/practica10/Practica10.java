/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

import javax.swing.JOptionPane;

/**
 *
 * @author siviany
 */
public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numTodos = "";
        int num = 1;
        while (num <= 100) {
            numTodos = numTodos+num+"  ";
            num++;
        }
        JOptionPane.showMessageDialog(null, numTodos);
    }

}

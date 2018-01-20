/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestokilometers;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Samuel Montgomery
 */
public class MilesToKilometers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c;
        String question1 = JOptionPane.showInputDialog("Enter miles: ");
        int num1 = Integer.parseInt(question1);
        a = num1 * 1.6;
        String kilo = " Kilometers ";
        JOptionPane.showMessageDialog(null, ""+a+kilo);
        
    }
    
}

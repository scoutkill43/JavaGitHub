/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feettometers;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Samuel Montgomery
 */
public class FeetToMeters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c;
        String question1 = JOptionPane.showInputDialog("Enter feet: ");
        int num1 = Integer.parseInt(question1);
        a = num1 * 0.3048;
        String meters = " Meters ";
        JOptionPane.showMessageDialog(null, ""+a+meters);
        
    }
    
}

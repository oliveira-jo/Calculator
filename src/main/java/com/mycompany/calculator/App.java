package com.mycompany.calculator;

import com.mycompany.calculator.view.JFrTela;

/**
 *
 * @author jonathan_oliveira
 */
public class App {
    
    public static void main(String[] args) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrTela().setVisible(true);
            }
        });
    }
    
}

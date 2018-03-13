/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tour.main;

import com.tour.view.FrmMain;
import javax.swing.UIManager;

/**
 *
 * @author rofiq
 */
public class Tour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
        FrmMain frmMain = new FrmMain();
        frmMain.setVisible(true);
    }
    
}

/*
 * Created by JFormDesigner on Tue Oct 27 16:05:54 IRST 2020
 */

package com.ds.usc;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.management.StringValueExp;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author amir
 */
public class Internet extends JFrame {
    public Internet() {
        initComponents();
    }
    Object timedata;
    Object typedata;
    private void buybtnActionPerformed(ActionEvent e) {
        lblshowmessage.setText("all set");
        timedata = timecombo.getSelectedItem();
        System.out.println(timedata);
        typedata = typecombo.getSelectedItem();
        System.out.println(typedata);

    }

    private void showpackagebtnActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "please for show the package that you bought go to run window in intellij", "showpackage",JOptionPane.INFORMATION_MESSAGE);
    }

    private void showpackageItemStateChanged(ItemEvent e) {
        // TODO add your code here
    }

    String[] time = {"daily","weekly","monthly"};
    String[] daily = {"30mb","40mb","50mb","60mb"};
    String[] weekly = {"2gig","3gig","5gig"};
    String[] monthly = {"10gig","100mb","200mb","400mb","1gig"};
    String[] type = {"30mb","40mb","50mb","60mb","2gig","3gig","5gig","10gig","100mb","200mb","400mb","1gig"};

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - amir
        lblshowmessage = new JLabel();
        lbltime = new JLabel();
        timecombo = new JComboBox();
        lbltype = new JLabel();
        typecombo = new JComboBox();
        buybtn = new JButton();
        showpackage = new JButton();

        //======== this ========
        setTitle("internet");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));
        contentPane.add(lblshowmessage, "cell 0 0");

        //---- lbltime ----
        lbltime.setText("period of time : ");
        contentPane.add(lbltime, "cell 0 1 4 1,alignx left,growx 0");
        contentPane.add(timecombo, "cell 0 1 4 1");

        //---- lbltype ----
        lbltype.setText("type of  data :   ");
        contentPane.add(lbltype, "cell 0 2");
        contentPane.add(typecombo, "cell 1 2 3 1");

        //---- buybtn ----
        buybtn.setText("buy");
        buybtn.addActionListener(e -> buybtnActionPerformed(e));
        contentPane.add(buybtn, "cell 0 4");

        //---- showpackage ----
        showpackage.setText("show package");
        showpackage.addActionListener(e -> showpackagebtnActionPerformed(e));
        showpackage.addItemListener(e -> showpackageItemStateChanged(e));
        contentPane.add(showpackage, "cell 1 4");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - amir
    private JLabel lblshowmessage;
    private JLabel lbltime;
    private JComboBox timecombo;
    private JLabel lbltype;
    private JComboBox typecombo;
    private JButton buybtn;
    private JButton showpackage;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

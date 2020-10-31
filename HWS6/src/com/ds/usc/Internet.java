/*
 * Created by JFormDesigner on Tue Oct 27 16:05:54 IRST 2020
 */

package com.ds.usc;

import java.awt.event.*;
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
        JOptionPane.showMessageDialog(null,"notice you can only buy one package","warning",JOptionPane.INFORMATION_MESSAGE);
        lblshowmessage.setText("all set");

    }

    private void showpackagebtnActionPerformed(ActionEvent e) {
            timedata = timecombo.getSelectedItem();

            typedata = typecombo.getSelectedItem();

            textArea1.setText(typedata + " " + timedata);
    }

    private void showpackageItemStateChanged(ItemEvent e) {
        // TODO add your code here
    }

    String[] time = {"daily","weekly","monthly"};
    String[] type = {"30mb","40mb","50mb","60mb","2gig","3gig","5gig","10gig","100mb","200mb","400mb","1gig"};

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ali
        lblshowmessage = new JLabel();
        lbltime = new JLabel();
        timecombo = new JComboBox(time);
        lbltype = new JLabel();
        typecombo = new JComboBox(type);
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        buybtn1 = new JButton();
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
        contentPane.add(lbltime, "cell 0 1,alignx left,growx 0");
        contentPane.add(timecombo, "cell 1 1");

        //---- lbltype ----
        lbltype.setText("type of  data :   ");
        contentPane.add(lbltype, "cell 0 2");
        contentPane.add(typecombo, "cell 1 2");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1, "cell 4 0 17 10,dock center");

        //---- buybtn1 ----
        buybtn1.setText("buy ");
        buybtn1.addActionListener(e -> buybtnActionPerformed(e));
        contentPane.add(buybtn1, "cell 0 4");

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
    // Generated using JFormDesigner Evaluation license - Ali
    private JLabel lblshowmessage;
    private JLabel lbltime;
    private JComboBox timecombo;
    private JLabel lbltype;
    private JComboBox typecombo;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton buybtn1;
    private JButton showpackage;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

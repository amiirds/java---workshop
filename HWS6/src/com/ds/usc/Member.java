

package com.ds.usc;

import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;


public class Member extends JFrame {
    public Member() {
        initComponents();
    }
    Internet internet = new Internet();
    private void button1ActionPerformed(ActionEvent e) {
        new Internet().setVisible(true);
    }

    private void button2ActionPerformed(ActionEvent e) {
        new Internet().setVisible(true);
    }

    private void button3ActionPerformed(ActionEvent e) {
        new Internet().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ali
        lblmember1 = new JLabel();
        button1 = new JButton();
        lblmember2 = new JLabel();
        button2 = new JButton();
        lblmember3 = new JLabel();
        button3 = new JButton();


        //======== this ========
        setTitle("choosing member");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3,align left top",
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

        //---- lblmember1 ----
        lblmember1.setText("buy for member one =");
        contentPane.add(lblmember1, "cell 0 2");

        //---- button1 ----
        button1.setText("buy");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, "cell 1 2");

        //---- lblmember2 ----
        lblmember2.setText("buy for member two =");
        contentPane.add(lblmember2, "cell 0 4");

        //---- button2 ----
        button2.setText("buy");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2, "cell 1 4");

        //---- lblmember3 ----
        lblmember3.setText("buy for member one =");
        contentPane.add(lblmember3, "cell 0 6");

        //---- button3 ----
        button3.setText("buy");
        button3.addActionListener(e -> button3ActionPerformed(e));
        contentPane.add(button3, "cell 1 6");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ali
    private JLabel lblmember1;
    private JButton button1;
    private JLabel lblmember2;
    private JButton button2;
    private JLabel lblmember3;
    private JButton button3;
    
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

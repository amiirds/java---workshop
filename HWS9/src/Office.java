import java.awt.*;
import java.net.ServerSocket;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Fri Dec 18 13:38:40 IRST 2020
 */



/**
 * @author unknown
 */
public class Office extends JFrame {
    public Office() {
        Repository repository;
        try {
            repository = new Repository();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
    }

    private void button_addActionPerformed() {
        try {
            Entity entity = new Entity();
            entity.setId(String.valueOf(comboBox_id.getSelectedIndex()+1));
            entity.setName(textField_name.getText());
            entity.setAge(String.valueOf(comboBox_age.getSelectedIndex()+1));
            entity.setJob(String.valueOf(comboBox_job.getSelectedItem()));
            Service service = new Service();
            service.save(entity);
            JOptionPane.showMessageDialog(null, "Successfully submit", "Success", 1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to saved " ,"Error",2);
        }
    }

    private void button_editActionPerformed() {
        try {
            Entity entity = new Entity();
            entity.setId(String.valueOf(comboBox_id.getSelectedIndex()+1));
            entity.setName(textField_name.getText());
            entity.setAge(String.valueOf(comboBox_age.getSelectedIndex()+1));
            entity.setJob(String.valueOf(comboBox_job.getSelectedItem()));
            Service service = new Service();
            service.update(entity);
            JOptionPane.showMessageDialog(null, "Successfully edit", "Success", 1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to edit " ,"Error",2);
        }
    }

    private void button_deleteActionPerformed() {
        try {
            Entity entity = new Entity();
            entity.setId(String.valueOf(comboBox_id.getSelectedIndex()+1));
            Service service = new Service();
            service.delete(entity);
            JOptionPane.showMessageDialog(null, "Successfully delete", "Success", 1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to delete " ,"Error",2);
        }
    }
    String[] job = {null,"Manager","maid","Employee"};
    String[] number = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","69","70","71","72","73","74","75","76","77","78","79","80","81","82","83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98","99","100"};

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        button_edit = new JButton();
        button_delete = new JButton();
        button_add = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        textField_name = new JTextField();
        comboBox_id = new JComboBox(number);
        comboBox_age = new JComboBox(number);
        comboBox_job = new JComboBox(job);

        //======== this ========
        setTitle("Office Managment");
        Container contentPane = getContentPane();

        //---- button_edit ----
        button_edit.setText("Edit (with id)");
        button_edit.addActionListener(e -> button_editActionPerformed());

        //---- button_delete ----
        button_delete.setText("Delete");
        button_delete.addActionListener(e -> button_deleteActionPerformed());

        //---- button_add ----
        button_add.setText("Add");
        button_add.addActionListener(e -> button_addActionPerformed());

        //---- label1 ----
        label1.setText("Name =");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 3f));

        //---- label2 ----
        label2.setText("ID =");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 3f));

        //---- label3 ----
        label3.setText("Age = ");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 3f));

        //---- label4 ----
        label4.setText("Job title = ");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 3f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(102, 102, 102)
                                    .addComponent(textField_name))
                                .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label4)
                                        .addComponent(label3)
                                        .addComponent(label2))
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(comboBox_id, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(comboBox_job))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(comboBox_age)))))
                            .addGap(193, 193, 193))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(button_add, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(button_edit, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(button_delete, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(39, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(41, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(comboBox_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(comboBox_age, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(comboBox_job, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button_add, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_edit, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_delete, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton button_edit;
    private JButton button_delete;
    private JButton button_add;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField_name;
    private JComboBox comboBox_id;
    private JComboBox comboBox_age;
    private JComboBox comboBox_job;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EmployeeView {

    
    public EmployeeView() {

        JMenu addEmployee, viewTable, deleteEmployee;

        JMenuItem selectEmpMenuItm;

        JFrame frame =new JFrame("Simple Employee List");

        
        JMenuBar menuBar = new JMenuBar();

        selectEmpMenuItm = new JMenuItem("Select Employee");
        selectEmpMenuItm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                JFrame menuItemframe =new JFrame("frame");
                menuItemframe.setSize(250,200);
                menuItemframe.setLayout(null);
                menuItemframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menuItemframe.setResizable(false);
                menuItemframe.setVisible(true);

                JTextField okayTxtFld = new JTextField();
                okayTxtFld.setBounds(20,20,200,30);
                menuItemframe.add(okayTxtFld);

                JButton okBtn = new JButton("OKAY");
                okBtn.setBounds(80,50,80,40);
                menuItemframe.add(okBtn);


            }
        });
        
        addEmployee = new JMenu("Add Employee");
        menuBar.add(addEmployee);

        viewTable = new JMenu("View Table");
        menuBar.add(viewTable);

        deleteEmployee = new JMenu("Delete Employee");
        deleteEmployee.add(selectEmpMenuItm);
        menuBar.add(deleteEmployee);

        frame.setSize(830,535);
        
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menuBar);
        frame.setResizable(false);

        JPanel empViewPanel = new JPanel();
        empViewPanel.setBounds(170,20,490,435);
        empViewPanel.setBackground(new Color(166, 159, 141));
        empViewPanel.setVisible(true);
        empViewPanel.setLayout(null);
        frame.add(empViewPanel);

        JLabel empNameLbl = new JLabel("Employee Name:");
        empNameLbl.setBounds(20,10,100,30);
        empViewPanel.add(empNameLbl);  

        JTextField empNameTxtFld = new JTextField();
        empNameTxtFld.setBounds(20,35,450,30);
        empViewPanel.add(empNameTxtFld);

        JLabel empIdLbl = new JLabel("Employee ID:");
        empIdLbl.setBounds(20,70,100,30);
        empViewPanel.add(empIdLbl); 

        JTextField empIdTxtFld = new JTextField();
        empIdTxtFld.setBounds(20,95,450,30);
        empViewPanel.add(empIdTxtFld);

        JLabel phoneNoLbl = new JLabel("Phone No:");
        phoneNoLbl.setBounds(20,125,100,30);
        empViewPanel.add(phoneNoLbl); 

        JTextField phoneNoTxtFld = new JTextField();
        phoneNoTxtFld.setBounds(20,150,450,30);
        empViewPanel.add(phoneNoTxtFld);

        JLabel positionLbl = new JLabel("Postion:");
        positionLbl.setBounds(20,180,100,30);
        empViewPanel.add(positionLbl); 

        JTextField positionTxtFld = new JTextField();
        positionTxtFld.setBounds(20,205,450,30);
        empViewPanel.add(positionTxtFld);

        JLabel empAddLbl = new JLabel("Employee Adress:");
        empAddLbl.setBounds(20,235,150,30);
        empViewPanel.add(empAddLbl); 

        JTextField empAddTxtFld = new JTextField();
        empAddTxtFld.setBounds(20,265,450,60);
        empViewPanel.add(empAddTxtFld);

        JButton addEmployeeBtn = new JButton("Add Employee");
        addEmployeeBtn.setBounds(160,350,170,60);
        empViewPanel.add(addEmployeeBtn);


        frame.setVisible(true);
    }

        public static void main(String[] args) {

        new EmployeeView();
        }
}

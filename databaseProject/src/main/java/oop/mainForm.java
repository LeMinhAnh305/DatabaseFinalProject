
/**
 * @author ${huyhoang8398}
 * <p>
 * ${Ken illasviel}
 */
package oop;

import org.omg.PortableInterceptor.SUCCESSFUL;

import java.sql.*;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class mainForm extends JFrame {


    private String CourseName, LecName;
    private String ques1, ques2, ques3, ques4, ques5, ques6, ques7, value;
    private String ques1T = "1", ques2T = "2", ques3T = "3", ques4T = "4", ques5T = "5";

    private JTextField toField;
    private JTextField lecField;

    private JButton send;
    private JButton open;
    private JPanel cardLayout;

    private JLabel courseName;
    private JLabel lecName;
    private JLabel helpLabel;
    private JLabel subLabel;
    private JLabel bug1;
    private JLabel Label2;
    private JLabel Label3;
    private JLabel Label4;
    private JLabel Label5;
    private JLabel Label6;
    private JLabel Label7;
    private JLabel Label8;

    private JLabel bLabel1;
    private JLabel bLabel2;
    private JLabel dev;

    private JComboBox comBox;

    private JRadioButton label1, label2, label3, label4, label5, label6, label7,
            label8, label9, label10, label11, label12, label13, label14, label15,
            label16, label17, label18, label19, label20, label21, label22, label23,
            label24, label25, label26, label27, label28, label29, label30, label31, label32, label33, label34, label35;
    public Connection conn = null;


    public mainForm() {
        JPanel p = new JPanel(new BorderLayout());
        setTitle("Evaluate Teaching Quality Application");
        //cant resize app
        setResizable(false);
        //p.setBackground(new Color(179,246,252));

        p.add(new topPanel(), BorderLayout.NORTH);
        p.add(new leftPanel(), BorderLayout.WEST);
        p.add(new rightPanel(), BorderLayout.EAST);
        //p.add(new b4bottom(),BorderLayout.SOUTH);
        p.add(new bottomPanel(), BorderLayout.SOUTH);
        //p.add(new dev1(),BorderLayout.AFTER_LAST_LINE);
        add(p);

        //Center app to center in Macbook
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int height = screenSize.height;
        int width = screenSize.width;
        this.setSize((int) (width / 1.2), height / 2);

        // center the jframe on screen
        this.setLocationRelativeTo(null);


        //database


    }


    class topPanel extends JPanel {
        public topPanel() {

            GridLayout layout = new GridLayout(4, 2, 5, 5);
            setLayout(layout);
            //setBackground(new Color(179,246,252));


            courseName = new JLabel("  Course Name: ");
            add(courseName).setLocation(100, 100);
            courseName.setFont(new Font("Serif", Font.BOLD, 18));

            toField = new JTextField();
            toField.setPreferredSize(new Dimension(35, 35));

            add(toField);

            lecName = new JLabel("  Lecturer Name: ");
            lecName.setFont(new Font("Serif", Font.BOLD, 18));
            add(lecName);

            lecField = new JTextField();
            lecField.setPreferredSize(new Dimension(35, 35));
            add(lecField);

            helpLabel = new JLabel("  Rate aspect of the training on 5 scales");
            helpLabel.setFont(new Font("Serif", Font.ITALIC, 15));

            add(helpLabel);

            bug1 = new JLabel("                            ");
            add(bug1);

            subLabel = new JLabel("  1. Strongly disagree   2. Disagree   3.Neither agree or disagree   4. Agree   5. Strongly Agree");
            add(subLabel);

            JLabel tLabel4 = new JLabel("                   ");
            add(tLabel4);

        }

    }

    class leftPanel extends JPanel {
        public leftPanel() {
            GridLayout layout = new GridLayout(7, 1, 10, 10);
            setLayout(layout);
            //setBackground(new Color(179,246,252));
            Label2 = new JLabel("  The organization of the lesson were logical and easy to follow ");
            Label2.setFont(new Font("Serif", Font.BOLD, 15));
            add(Label2);

            Label3 = new JLabel("  The content of lecture met your expectations ");
            Label3.setFont(new Font("Serif", Font.BOLD, 15));
            add(Label3);

            Label4 = new JLabel("  The exercises/assignments/labworks were useful ");
            Label4.setFont(new Font("Serif", Font.BOLD, 15));
            add(Label4);

            Label5 = new JLabel("  The lecturer explained things clearly ");
            Label5.setFont(new Font("Serif", Font.BOLD, 15));
            add(Label5);

            Label6 = new JLabel("  The lecturer answered student's questions clearly during classes ");
            Label6.setFont(new Font("Serif", Font.BOLD, 15));
            add(Label6);

            Label7 = new JLabel("  The lecturer encouraged students participation during classes ");
            Label7.setFont(new Font("Serif", Font.BOLD, 15));
            add(Label7);

            Label8 = new JLabel("  This class gave you opportunities to improve your teamworks skills ");
            Label8.setFont(new Font("Serif", Font.BOLD, 15));
            add(Label8);

        }
    }

    class rightPanel extends JPanel {
        public rightPanel() {
            GridLayout layout = new GridLayout(7, 1, 100, 5);
            setLayout(layout);
            //setBackground(new Color(179,246,252));

            //question 1 checkbox
            label1 = new JRadioButton("1");
            add(label1);
            label2 = new JRadioButton("2");
            add(label2);
            label3 = new JRadioButton("3");
            add(label3);
            label4 = new JRadioButton("4");
            add(label4);
            label5 = new JRadioButton("5");
            add(label5);

            //question 2 checkbox
            label6 = new JRadioButton("1");
            add(label6);
            label7 = new JRadioButton("2");
            add(label7);
            label8 = new JRadioButton("3");
            add(label8);
            label9 = new JRadioButton("4");
            add(label9);
            label10 = new JRadioButton("5");
            add(label10);

            //question 3 checkbox
            label11 = new JRadioButton("1");
            add(label11);
            label12 = new JRadioButton("2");
            add(label12);
            label13 = new JRadioButton("3");
            add(label13);
            label14 = new JRadioButton("4");
            add(label14);
            label15 = new JRadioButton("5");
            add(label15);
            //question 4 checkbox

            label16 = new JRadioButton("1");
            add(label16);
            label17 = new JRadioButton("2");
            add(label17);
            label18 = new JRadioButton("3");
            add(label18);
            label19 = new JRadioButton("4");
            add(label19);
            label20 = new JRadioButton("5");
            add(label20);

            //question 5 checkbox
            label21 = new JRadioButton("1");
            add(label21);
            label22 = new JRadioButton("2");
            add(label22);
            label23 = new JRadioButton("3");
            add(label23);
            label24 = new JRadioButton("4");
            add(label24);
            label25 = new JRadioButton("5");
            add(label25);

            //question 6 checkbox
            label26 = new JRadioButton("1");
            add(label26);
            label27 = new JRadioButton("2");
            add(label27);
            label28 = new JRadioButton("3");
            add(label28);
            label29 = new JRadioButton("4");
            add(label29);
            label30 = new JRadioButton("5");
            add(label30);
            //question 7 checkbox
            label31 = new JRadioButton("1");
            add(label31);
            label32 = new JRadioButton("2");
            add(label32);
            label33 = new JRadioButton("3");
            add(label33);
            label34 = new JRadioButton("4");
            add(label34);
            label35 = new JRadioButton("5");
            add(label35);
        }


    }

    class bottomPanel extends JPanel implements ActionListener {
        public bottomPanel() {
            GridLayout layout = new GridLayout(4, 2, 2, 2);
            setLayout(layout);
            //setBackground(new Color(179,246,252));

            //scale
            JLabel bLabel4 = new JLabel("  Please rate the quality of the course *");
            bLabel4.setFont(new Font("Serif", Font.ITALIC, 18));
            add(bLabel4);

            bLabel1 = new JLabel("                ");
            add(bLabel1);

            String[] qualityRate = {"Very Poor", "Poor", "Average", "Good", "Very Good"};

            comBox = new JComboBox(qualityRate);
            comBox.setPreferredSize(new Dimension(20, 20));

            add(comBox);

            bLabel2 = new JLabel("                ");
            add(bLabel2);


            send = new JButton("Submit");
            send.setPreferredSize(new Dimension(45, 45));
            add(send);
            send.setHorizontalTextPosition(SwingConstants.CENTER);
            send.addActionListener(this);

            open = new JButton("Open your text file");
            open.setPreferredSize(new Dimension(45, 45));
            add(open);
            open.addActionListener(this);

        }

        //Write to text file
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == send) {
                JOptionPane.showMessageDialog(null, "DONE\n Your Evaluate information was stored by EVT.txt file ", "Successful", JOptionPane.INFORMATION_MESSAGE);
                CourseName = ("");
                LecName = ("");
                CourseName = toField.getText();
                LecName = lecField.getText();
                toField.setText("");
                lecField.setText(null);

                ques1 = ("");
                for (int i = 0; i < 5; i++) {
                    if (label1.isSelected()) {
                        ques1 = label1.getText();
                        label1.setSelected(false);
                    } else if (label2.isSelected()) {
                        ques1 = label2.getText();
                        label2.setSelected(false);
                    } else if (label3.isSelected()) {
                        ques1 = label3.getText();
                        label3.setSelected(false);
                    } else if (label4.isSelected()) {
                        ques1 = label4.getText();
                        label4.setSelected(false);
                    } else if (label5.isSelected()) {
                        ques1 = label5.getText();
                        label5.setSelected(false);


                    }
                }
                ques2 = ("");
                for (int i1 = 0; i1 < 5; i1++) {
                    if (label6.isSelected() == true) {
                        ques2 = label6.getText();
                        label6.setSelected(false);

                    } else if (label7.isSelected() == true) {
                        ques2 = label7.getText();
                        label7.setSelected(false);

                    } else if (label8.isSelected() == true) {
                        ques2 = label8.getText();
                        label8.setSelected(false);

                    } else if (label9.isSelected() == true) {
                        ques2 = label9.getText();
                        label9.setSelected(false);

                    } else if (label10.isSelected() == true) {
                        ques2 = label10.getText();
                        label10.setSelected(false);

                    }
                }
                ques3 = ("");
                for (int i2 = 1; i2 < 5; i2++) {
                    if (label11.isSelected() == true) {
                        ques3 = label11.getText();
                        label11.setSelected(false);

                    } else if (label12.isSelected() == true) {
                        ques3 = label12.getText();
                        label12.setSelected(false);

                    } else if (label13.isSelected() == true) {
                        ques3 = label13.getText();
                        label13.setSelected(false);

                    } else if (label14.isSelected() == true) {
                        ques3 = label14.getText();
                        label14.setSelected(false);

                    } else if (label15.isSelected() == true) {
                        ques3 = label15.getText();
                        label15.setSelected(false);


                    }
                }
                ques4 = ("");
                for (int i3 = 0; i3 < 5; i3++) {
                    if (label16.isSelected() == true) {
                        ques4 = label16.getText();
                        label16.setSelected(false);

                    } else if (label17.isSelected() == true) {
                        ques4 = label17.getText();
                        label17.setSelected(false);

                    } else if (label18.isSelected() == true) {
                        ques4 = label18.getText();
                        label18.setSelected(false);

                    } else if (label19.isSelected() == true) {
                        ques4 = label19.getText();
                        label19.setSelected(false);

                    } else if (label20.isSelected() == true) {
                        ques4 = label20.getText();
                        label20.setSelected(false);


                    }
                }
                ques5 = ("");
                for (int i4 = 0; i4 < 5; i4++) {
                    if (label21.isSelected() == true) {
                        ques5 = label21.getText();
                        label21.setSelected(false);

                    } else if (label22.isSelected() == true) {
                        ques5 = label22.getText();
                        label22.setSelected(false);

                    } else if (label23.isSelected() == true) {
                        ques5 = label23.getText();
                        label23.setSelected(false);

                    } else if (label24.isSelected() == true) {
                        ques5 = label24.getText();
                        label24.setSelected(false);

                    } else if (label25.isSelected() == true) {
                        ques5 = label25.getText();
                        label25.setSelected(false);

                    }

                }
                ques6 = ("");
                for (int i5 = 0; i5 < 5; i5++) {
                    if (label26.isSelected() == true) {
                        ques6 = label26.getText();
                        label26.setSelected(false);

                    } else if (label27.isSelected() == true) {
                        ques6 = label27.getText();
                        label27.setSelected(false);

                    } else if (label28.isSelected() == true) {
                        ques6 = label28.getText();
                        label28.setSelected(false);

                    } else if (label29.isSelected() == true) {
                        ques6 = label29.getText();
                        label29.setSelected(false);

                    } else if (label30.isSelected() == true) {
                        ques6 = label30.getText();
                        label30.setSelected(false);

                    }
                }
                ques7 = ("");
                for (int i6 = 0; i6 < 5; i6++) {
                    if (label31.isSelected() == true) {
                        ques7 = label31.getText();
                        label31.setSelected(false);
                    } else if (label32.isSelected() == true) {
                        ques7 = label32.getText();
                        label32.setSelected(false);
                    } else if (label33.isSelected() == true) {
                        ques7 = label33.getText();
                        label33.setSelected(false);
                    } else if (label34.isSelected() == true) {
                        ques7 = label34.getText();
                        label34.setSelected(false);
                    } else if (label35.isSelected() == true) {
                        ques7 = label35.getText();
                        label35.setSelected(false);
                    }
                }

                value = ("");
                value = comBox.getSelectedItem().toString();

                try {
                    BufferedWriter reader = new BufferedWriter(new FileWriter(new File("/Users/huyhoang8398/Desktop/EVTF.txt"), true));
                    for (int i7 = 0; i7 < 5; i7++) {
                        if (ques1.equals(ques1T))
                            ques1 = "Strongly disagree";
                        else if (ques1.equals(ques2T))
                            ques1 = "Disagree";
                        else if (ques1.equals(ques3T))
                            ques1 = "Neither agree or disagree";
                        else if (ques1.equals(ques4T))
                            ques1 = "Agree";
                        else if (ques1.equals(ques5T))
                            ques1 = "Strongly Agree";
                    }
                    for (int i8 = 0; i8 < 5; i8++) {
                        if (ques2.equals(ques1T))
                            ques2 = "Strongly disagree";
                        if (ques2.equals(ques2T))
                            ques2 = "Disagree";
                        if (ques2.equals(ques3T))
                            ques2 = "Neither agree or disagree";
                        if (ques2.equals(ques4T))
                            ques2 = "Agree";
                        if (ques2.equals(ques5T))
                            ques2 = "Strongly Agree";
                    }
                    for (int i9 = 0; i9 < 5; i9++) {

                        if (ques3.equals(ques1T))
                            ques3 = "Strongly disagree";
                        if (ques3.equals(ques2T))
                            ques3 = "Disagree";
                        if (ques3.equals(ques3T))
                            ques3 = "Neither agree or disagree";
                        if (ques3.equals(ques4T))
                            ques3 = "Agree";
                        if (ques3.equals(ques5T))
                            ques3 = "Strongly Agree";
                    }
                    for (int i10 = 0; i10 < 5; i10++) {

                        if (ques4.equals(ques1T))
                            ques4 = "Strongly disagree";
                        if (ques4.equals(ques2T))
                            ques4 = "Disagree";
                        if (ques4.equals(ques3T))
                            ques4 = "Neither agree or disagree";
                        if (ques4.equals(ques4T))
                            ques4 = "Agree";
                        if (ques4.equals(ques5T))
                            ques4 = "Strongly Agree";
                    }
                    for (int i11 = 0; i11 < 5; i11++) {
                        if (ques5.equals(ques1T))
                            ques5 = "Strongly disagree";
                        if (ques5.equals(ques2T))
                            ques5 = "Disagree";
                        if (ques5.equals(ques3T))
                            ques5 = "Neither agree or disagree";
                        if (ques5.equals(ques4T))
                            ques5 = "Agree";
                        if (ques5.equals(ques5T))
                            ques5 = "Strongly Agree";
                    }
                    for (int i12 = 0; i12 < 5; i12++) {
                        if (ques6.equals(ques1T))
                            ques6 = "Strongly disagree";
                        if (ques6.equals(ques2T))
                            ques6 = "Disagree";
                        if (ques6.equals(ques3T))
                            ques6 = "Neither agree or disagree";
                        if (ques6.equals(ques4T))
                            ques6 = "Agree";
                        if (ques6.equals(ques5T))
                            ques6 = "Strongly Agree";
                    }
                    for (int i13 = 0; i13 < 5; i13++) {
                        if (ques7.equals(ques1T))
                            ques7 = "Strongly disagree";
                        if (ques7.equals(ques2T))
                            ques7 = "Disagree";
                        if (ques7.equals(ques3T))
                            ques7 = "Neither agree or disagree";
                        if (ques7.equals(ques4T))
                            ques7 = "Agree";
                        if (ques7.equals(ques5T))
                            ques7 = "Strongly Agree";
                    }

                    reader.write("                      ");
                    reader.newLine();

                    reader.write("----------------------");
                    reader.newLine();

                    reader.write("Course name:\t " + LecName);
                    reader.newLine();


                    reader.write("Lecturer name:\t " + CourseName);
                    reader.newLine();
                    reader.write("The organization of the lesson were logical and easy to follow:\t" + ques1);
                    reader.newLine();
                    reader.write("The content of lecture met your expectations:\t" + ques2);
                    reader.newLine();
                    reader.write("The exercises/assignments/labworks were useful:\t" + ques3);
                    reader.newLine();
                    reader.write("The lecturer explained things clearly:\t" + ques4);
                    reader.newLine();
                    reader.write("The lecturer answered student's questions clearly during classes:\t" + ques5);
                    reader.newLine();
                    reader.write("The lecturer encouraged students participation during classes:\t" + ques6);
                    reader.newLine();
                    reader.write("This class gave you opportunities to improve your teamworks skills:\t" + ques7);
                    reader.newLine();
                    reader.newLine();
                    reader.write("Summary: \t" + value);
                    reader.close();
                    System.out.println("done");

                    writeToDatabase();
                } catch (IOException E) {
                    System.out.println("Error is " + E);
                }

            }
            if (e.getSource() == open) {
                JFileChooser chooser = new JFileChooser("/Users/huyhoang8398/Desktop/EVTF.txt");
                int c = chooser.showOpenDialog(null);
                if (c == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    try {
                        Desktop.getDesktop().open(file);
                    } catch (IOException EE) {
                        System.out.println("Failed");
                    }
                }
            }

        }

        public void writeToDatabase() {
            System.out.println(LecName + CourseName + ques1 + ques2 + ques3 + ques4 + ques5 + ques6 + ques7);
            try {
                String sql = "insert into giaovien(Course_Name,Lecturer_Name,Question1,Question2,Question3," +
                        "Question4,Question5,Question6,Question7) values(?,?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStatement = MySQLConnUtils.getMySQLConnection().prepareStatement(sql);
                preparedStatement.setString(1, LecName);
                preparedStatement.setString(2, CourseName);
                preparedStatement.setString(3, ques1);
                preparedStatement.setString(4, ques2);
                preparedStatement.setString(5, ques3);
                preparedStatement.setString(6, ques4);
                preparedStatement.setString(7, ques5);
                preparedStatement.setString(8, ques6);
                preparedStatement.setString(9, ques7);

                int result = preparedStatement.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

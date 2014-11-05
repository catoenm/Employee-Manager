/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeemanager;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mitch_000
 */
public class EmployeeManager extends javax.swing.JFrame {
    
public static boolean OtherCityClicked = false, FirstNameClicked = false, LastNameClicked = false, HouseNumberClicked = false, CityClicked = false, ProvinceClicked = false, PostalCodeClicked = false, SINClicked = false, CellPhoneClicked = false, HomePhoneClicked = false, StreetClicked = false;
    public static int ageCalc(int iYear, int iMonth, int iDay){
                        Calendar c = Calendar.getInstance();
        		c.add(Calendar.DAY_OF_MONTH, iDay * -1);
        		c.add(Calendar.MONTH, (iMonth * -1) + 1);
        		c.add(Calendar.YEAR, iYear * -1);
        		
        		return c.get(Calendar.YEAR);
    }
     public static int hireCalc(int iYear, int iMonth, int iDay, int iYear1, int iMonth1, int iDay1){
                        
                        Calendar c = Calendar.getInstance();
                        c.set(iYear1 + 1, iMonth1 + 1, iDay1);
        		c.add(Calendar.DAY_OF_MONTH, iDay * -1);
        		c.add(Calendar.MONTH, (iMonth * -1) + 1);
        		c.add(Calendar.YEAR, iYear * -1);
        		
        		return c.get(Calendar.YEAR) - 1;
    }
     public String getElement(String s, int i){
         String sArray [] = s.split("~");
         return sArray [i];
     }
     private void clearFeilds(){
        FirstName.setText("First Name");
        LastName.setText("Last Name");
        HouseNumber.setValue(1);
        Street.setText("Street");
        City.setText("City");
        PostalCode.setText("Postal Code (X#X #X#)");
        SocialInsuranceNumber.setText("Social Insurance Number");
        HomePhone.setText("Home Phone Number");
        CellPhone.setText("Cell Phone Number");
        BirthYear.setValue(2000);
        BirthMonth.setValue(1);
        BirthDay.setValue(1);
        HireYear.setValue(2000);
        HireMonth.setValue(1);
        HireDay.setValue(1);
        TermYear.setValue(2000);
        TermMonth.setValue(1);
        TermDay.setValue(1);
        Province.setSelectedItem("Province");
        DepartmentNumber.setText("Department Number");
     }
     public ArrayList<String> Employees = new ArrayList<String>();
     public ArrayList<String> Employees1 = new ArrayList<String>();
     public ArrayList<String> Backup = new ArrayList<String>();
     public String path = "D:/Employees.txt";
     public File file = new File (path);
     public String Array [] = null;
     public int iCount = 0;
     public boolean Edited = false;
     private BufferedImage image = null;
        private static final String IMG_PATH = "D://employee-management-tips.jpg";
        private final ImagePanel panel = new ImagePanel(new ImageIcon("D://employee-management-tips - Copy.jpg").getImage());

    /**
     * Creates new form EmployeeManager
     */
        /////////////////////////////////////
        class ImagePanel extends JPanel {

  private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }

}
        /////////////////////////////////////
    public EmployeeManager() {
        try {
         BufferedImage img = ImageIO.read(new File(IMG_PATH));
         ImageIcon icon = new ImageIcon(img);
         JLabel jLabel26 = new JLabel(icon);
         JOptionPane.showMessageDialog(null, jLabel26);
      } catch (IOException e) {
         e.printStackTrace();
      }
        initComponents();
        
        jPanel3.add(panel);
        try{
        Scanner sc = new Scanner (file);
        while (sc.hasNextLine()){
            Employees.add(sc.nextLine());
            Array = Employees.get(Employees.size() - 1).split("~");
            Employee.addItem(Array [0] + " " + Array [1]);
        }
           }catch (IOException e){
           System.out.println(e);
           }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel27 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel32 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        City = new javax.swing.JTextField();
        PostalCode = new javax.swing.JTextField();
        HomePhone = new javax.swing.JTextField();
        SocialInsuranceNumber = new javax.swing.JTextField();
        CellPhone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BirthYear = new javax.swing.JSpinner();
        BirthMonth = new javax.swing.JSpinner();
        BirthDay = new javax.swing.JSpinner();
        HireYear = new javax.swing.JSpinner();
        HireMonth = new javax.swing.JSpinner();
        HireDay = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Street = new javax.swing.JTextField();
        HouseNumber = new javax.swing.JSpinner();
        jTextField1 = new javax.swing.JTextField();
        Province = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        TermYear = new javax.swing.JSpinner();
        TermMonth = new javax.swing.JSpinner();
        TermDay = new javax.swing.JSpinner();
        DepartmentNumber = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        YearsWithCompany = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CurrentEmployee = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Progress = new javax.swing.JProgressBar();
        Reset = new javax.swing.JButton();
        Verify = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        ActiveEmployee = new javax.swing.JLabel();
        Edit = new javax.swing.JButton();
        Done = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Employee = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        SearchLastName = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        SearchByLastName = new javax.swing.JButton();
        Message1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        SearchBySin = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        SearchSin = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Flag = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        jLabel27.setBackground(new java.awt.Color(240, 0, 240));
        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 100, 0));
        jLabel27.setText("Browse Current Employees");

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 100, 0));
        jButton7.setText("Save");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setText("Employee Manager Application");

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel32)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jDesktopPane2.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Welcome", jDesktopPane2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(240, 0, 240));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 100, 0));
        jLabel1.setText("Add a New Employee");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        FirstName.setText("First Name");
        FirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FirstNameMouseClicked(evt);
            }
        });
        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 77, 338, -1));

        LastName.setText("Last Name");
        LastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LastNameMouseClicked(evt);
            }
        });
        jPanel1.add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 108, 338, -1));

        City.setText("City");
        City.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CityMouseClicked(evt);
            }
        });
        jPanel1.add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 202, 338, -1));

        PostalCode.setText("Postal Code (X#X #X#)");
        PostalCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PostalCodeMouseClicked(evt);
            }
        });
        jPanel1.add(PostalCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 233, 338, -1));

        HomePhone.setText("Home Phone Number");
        HomePhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePhoneMouseClicked(evt);
            }
        });
        jPanel1.add(HomePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 295, 338, -1));

        SocialInsuranceNumber.setText("Social Insurance Number");
        SocialInsuranceNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SocialInsuranceNumberMouseClicked(evt);
            }
        });
        jPanel1.add(SocialInsuranceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 264, 338, -1));

        CellPhone.setText("Cell Phone Number");
        CellPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CellPhoneMouseClicked(evt);
            }
        });
        jPanel1.add(CellPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 326, 338, -1));

        jLabel2.setText("Date of Birth: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 391, -1, -1));

        jLabel3.setText("Date of Hire:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 428, -1, -1));

        jLabel4.setText("Year");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 361, -1, -1));

        jLabel5.setText("Month");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 361, 45, -1));

        jLabel6.setText("Day");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 361, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 100, 0));
        jLabel7.setText("Dates:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 361, -1, -1));

        BirthYear.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2000), null, null, Integer.valueOf(1)));
        jPanel1.add(BirthYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 386, 67, -1));

        BirthMonth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanel1.add(BirthMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 386, -1, -1));

        BirthDay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jPanel1.add(BirthDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 386, -1, -1));

        HireYear.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2000), null, null, Integer.valueOf(1)));
        jPanel1.add(HireYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 425, 67, -1));

        HireMonth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanel1.add(HireMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 426, -1, -1));

        HireDay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jPanel1.add(HireDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 428, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 0, 0));
        jLabel8.setText("  ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 75, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 0, 0));
        jLabel9.setText("  ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 106, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 0, 0));
        jLabel10.setText("  ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 138, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 0, 0));
        jLabel11.setText("  ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 169, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 0, 0));
        jLabel12.setText("  ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 0, 0));
        jLabel13.setText("  ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 231, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 0, 0));
        jLabel14.setText("  ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 262, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 0, 0));
        jLabel15.setText("  ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 293, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 0, 0));
        jLabel16.setText("  ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 324, -1, -1));

        Street.setText("Street");
        Street.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StreetMouseClicked(evt);
            }
        });
        jPanel1.add(Street, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 140, 202, -1));

        HouseNumber.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        jPanel1.add(HouseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 140, 65, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(0, 100, 0));
        jTextField1.setText("Address:");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 140, -1, -1));

        Province.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Province", "Ontario", "Québec", "British Columbia", "Alberta", "Nova Scotia", "Manitoba", "Saskatchewan", "New Brunswick", "Prince Edward Island", "Newfoundland and Labrador", "Nunavut", "Yukon", "Northwest Territories" }));
        jPanel1.add(Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 171, 338, -1));

        jLabel17.setText("Date of Term:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 466, -1, -1));

        TermYear.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2000), null, null, Integer.valueOf(1)));
        jPanel1.add(TermYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 463, 67, -1));

        TermMonth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanel1.add(TermMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 463, -1, -1));

        TermDay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jPanel1.add(TermDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 465, -1, -1));

        DepartmentNumber.setText("Department Number");
        DepartmentNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepartmentNumberMouseClicked(evt);
            }
        });
        jPanel1.add(DepartmentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 496, 329, -1));

        jLabel18.setText("Age:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 528, -1, -1));

        jLabel19.setText("Years with the company:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 554, -1, -1));

        Age.setEditable(false);
        Age.setBackground(new java.awt.Color(0, 0, 0));
        Age.setForeground(new java.awt.Color(0, 100, 0));
        Age.setText("Click Verify");
        jPanel1.add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 525, 122, -1));

        YearsWithCompany.setEditable(false);
        YearsWithCompany.setBackground(new java.awt.Color(0, 0, 0));
        YearsWithCompany.setForeground(new java.awt.Color(0, 100, 0));
        YearsWithCompany.setText("Click Verify");
        jPanel1.add(YearsWithCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 554, 122, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText(" ");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 384, 52, -1));

        jLabel21.setText(" ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 431, 209, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText(" ");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 426, 52, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("        ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 463, 52, -1));

        CurrentEmployee.setText("Employee Still Active");
        CurrentEmployee.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CurrentEmployeeStateChanged(evt);
            }
        });
        jPanel1.add(CurrentEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 463, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText(" ");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 494, 52, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 100, 0));
        jLabel25.setText("Click Verify/Get Progress to get Age/Years with Company");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 594, 620, 80));

        Progress.setMaximum(13);
        jPanel1.add(Progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 230, -1));

        Reset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Reset.setForeground(new java.awt.Color(0, 100, 0));
        Reset.setText("Reset Fields");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 230, 57));

        Verify.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Verify.setForeground(new java.awt.Color(0, 100, 0));
        Verify.setText("Verify/Get Progress");
        Verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyActionPerformed(evt);
            }
        });
        jPanel1.add(Verify, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 230, 57));

        Submit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Submit.setForeground(new java.awt.Color(0, 100, 0));
        Submit.setText("Submit");
        Submit.setEnabled(false);
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 230, 140));

        ActiveEmployee.setText("Employee Still Active");
        jPanel1.add(ActiveEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 150, -1));
        ActiveEmployee.setVisible(false);

        Edit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Edit.setForeground(new java.awt.Color(0, 100, 0));
        Edit.setText("Edit");
        jPanel1.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 75, 230, 30));
        Edit.setVisible(false);

        Done.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Done.setForeground(new java.awt.Color(0, 100, 0));
        Done.setText("Done");
        jPanel1.add(Done, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 230, 40));
        Done.setVisible(false);

        jTabbedPane1.addTab("Add a New Employee/Edit an Old Employee", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Employee.setMaximumRowCount(100);
        jPanel2.add(Employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 450, -1));

        jButton1.setText("View/Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 160, -1));

        jLabel30.setText("Search by Last Name: ");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        jPanel2.add(SearchLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 310, -1));

        jLabel31.setBackground(new java.awt.Color(240, 0, 240));
        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 100, 0));
        jLabel31.setText("Browse Current Employees");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jButton3.setText("Alphabetical Order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jButton4.setText("Order of Seniority");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 150, -1));

        jButton5.setText("Age");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 150, -1));

        jButton6.setText("Department Number");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 160, -1));

        SearchByLastName.setText("Search");
        SearchByLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByLastNameActionPerformed(evt);
            }
        });
        jPanel2.add(SearchByLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 160, -1));

        Message1.setText("Go to Tab #2 (Employee Editing) for employee editing. The Employee's data has been loaded there.");
        jPanel2.add(Message1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 640, 20));

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 640, 360));

        SearchBySin.setText("Search");
        SearchBySin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBySinActionPerformed(evt);
            }
        });
        jPanel2.add(SearchBySin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 160, -1));

        jLabel26.setText("Search by SIN:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel2.add(SearchSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 310, -1));

        jButton9.setText("Next");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 310, -1));

        jButton10.setText("Previous");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 140, 310, -1));

        Flag.setText("Flag Terminated");
        Flag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlagActionPerformed(evt);
            }
        });
        jPanel2.add(Flag, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 160, -1));

        jTabbedPane1.addTab("Browse Current Employees", jPanel2);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 100, 0));
        jButton2.setText("Save and Continue");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 100, 0));
        jLabel28.setText("Save");

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 100, 0));
        jButton8.setText("Save and Quit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(136, 136, 136)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Save", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //36 to 54
    private boolean VerifyFeilds(){
        boolean Check = true;
        int Right = 0;
        //First name verification
        if (FirstName.getText().equals("") || FirstName.getText().equals("First Name")){
            jLabel8.setForeground(Color.red);
            jLabel8.setText("*");
            Check = false;
        }
        else{
            jLabel8.setForeground(Color.green);
            jLabel8.setText("Good");
            Right++;
        }
        //Last name verification
        if (LastName.getText().equals("") || LastName.getText().equals("Last Name")){
            jLabel9.setForeground(Color.red);
            jLabel9.setText("*");
            Check = false;
        }
        else{
            jLabel9.setForeground(Color.green);
            jLabel9.setText("Good");
            Right++;
        }
        //address verification
        if (Street.getText().equals("") || Street.getText().equals("Street")){
            jLabel10.setForeground(Color.red);
            jLabel10.setText("*");
            Check = false;
        }
        else{
            jLabel10.setForeground(Color.green);
            jLabel10.setText("Good");
            Right++;
        }
        //Province verification
        if (Province.getSelectedItem().equals("Province")){
            jLabel11.setForeground(Color.red);
            jLabel11.setText("*");
            Check = false;
        }
        else{
            jLabel11.setForeground(Color.green);
            jLabel11.setText("Good");
            Right++;
        }
        //City verification
        if (City.getText().equals("") || City.getText().equals("City")){
            jLabel12.setForeground(Color.red);
            jLabel12.setText("*");
            Check = false;
        }
        else{
            jLabel12.setForeground(Color.green);
            jLabel12.setText("Good");
            Right++;
        }
        //Postal code verification
        String s = PostalCode.getText();
        if (s.length() != 6){
            jLabel13.setForeground(Color.red);
            jLabel13.setText("*");
            Check = false;
        }
        else{
            String CharArray [] = {s.substring(0, 1), s.substring(1, 2), s.substring(2, 3), s.substring(3, 4), s.substring(4, 5), s.substring(5, 6)};
            System.out.println(CharArray [0]);
            System.out.println(CharArray[0].matches("[0-9]"));
            if (!CharArray[0].matches("[0-9]") && CharArray[1].matches("[0-9]") && !CharArray[2].matches("[0-9]") && CharArray[3].matches("[0-9]") && !CharArray[4].matches("[0-9]") && CharArray[5].matches("[0-9]")){
                jLabel13.setForeground(Color.green);
                jLabel13.setText("Good");
                Right++;
            }
            else{
                jLabel13.setForeground(Color.red);
                jLabel13.setText("*");
                Check = false;
            }
        }
        //Social Insurance Number Verification
        s = SocialInsuranceNumber.getText();
        long Array [] = new long [s.length()];
        long CheckNumber = 0;
        if (s.matches("[0-9]+") && s.length() > 8 && s.length() < 10) {
            String st;
            long Temp;
            for (int i = 0; i < Array.length; i++){
                Array [i] = Long.parseLong(s.substring(i, i + 1));
                System.out.println(Array [i]);
            }
            for (int i = 0; i < s.length(); i++){
                if (i%2 == 0)
                Array [i] *= 1;
                else{
                    Array [i] *= 2;
                    if (Array [i] > 9){
                        Temp = Array [i] % 10;
                        Array [i] /= 10;
                        Array [i] += Temp;
                        System.out.println("Temp: " + Temp);
                    }
                }
                System.out.println(Array [i]);
            }
            for (int i = 0; i < Array.length; i++)
            CheckNumber += Array [i];
            if (CheckNumber %10 == 0){
                jLabel14.setForeground(Color.green);
                jLabel14.setText("Good");
                Right++;
            }
            else{
                jLabel14.setForeground(Color.red);
                jLabel14.setText("*");
                Check = false;
            }
        }
        else{
            jLabel14.setForeground(Color.red);
            jLabel14.setText("*");
            Check = false;
        }
        System.out.println(Check);
        //Home Phone Number Veriication
        if(HomePhone.getText().length() < 10 || HomePhone.getText().length() > 10){
            jLabel15.setForeground(Color.red);
            jLabel15.setText("*");
            Check = false;
        }
        else{
            jLabel15.setForeground(Color.green);
            jLabel15.setText("Good");
            Right++;
        }
        //Cell Phone Number Verification
        if(CellPhone.getText().length() < 10 || CellPhone.getText().length() > 10){
            jLabel16.setForeground(Color.red);
            jLabel16.setText("*");
            Check = false;
        }
        else{
            jLabel16.setForeground(Color.green);
            jLabel16.setText("Good");
            Right++;
        }
        //Verifying Dates

        //Valid Birth Date
        boolean Hire, Term, Birth;
        Birth = VerifyDate((int)BirthYear.getValue(), (int)BirthMonth.getValue(), (int)BirthDay.getValue());
        //Valid Hire Date
        Hire = VerifyDate((int)HireYear.getValue(), (int)HireMonth.getValue(), (int)HireDay.getValue());
        //Valid Termination Date
        if (!CurrentEmployee.isSelected()){
            Term = VerifyDate((int)TermYear.getValue(), (int)TermMonth.getValue(), (int)TermDay.getValue());
        }
        else{
            Term = true;
        }
        if (!CurrentEmployee.isSelected()){
            if (Birth && Term){
                if(compareDates((int)BirthYear.getValue(), (int)BirthMonth.getValue(), (int)BirthDay.getValue(), (int)TermYear.getValue(), (int)TermMonth.getValue(), (int)TermDay.getValue())){
                    Birth = true;
                    Term = true;
                }
                else{
                    Birth = false;
                    Term = false;
                }
            }
        }
        if (!CurrentEmployee.isSelected()){
            if(compareDates((int)HireYear.getValue(), (int)HireMonth.getValue(), (int)HireDay.getValue(), (int)TermYear.getValue(), (int)TermMonth.getValue(), (int)TermDay.getValue())){
                if (Hire)
                Hire = true;
                if (Term)
                Term = true;
            }
            else{
                Hire = false;
                Term = false;
            }
        }

        if(compareDates((int)BirthYear.getValue(), (int)BirthMonth.getValue(), (int)BirthDay.getValue(), (int)HireYear.getValue(), (int)HireMonth.getValue(), (int)HireDay.getValue())){
            if (Birth)
            Birth = true;
            if (Hire)
            Hire = true;
        }
        else{
            Birth = false;
            Hire = false;
        }
        //Changing Labels
        if (Term){
            jLabel23.setForeground(Color.green);
            jLabel23.setText("Good");
            Right++;
        }
        else{
            jLabel23.setForeground(Color.red);
            jLabel23.setText("*");
        }

        if (Birth){
            jLabel20.setForeground(Color.green);
            jLabel20.setText("Good");
            Right++;
        }
        else{
            jLabel20.setForeground(Color.red);
            jLabel20.setText("*");
        }

        if (Hire){
            jLabel22.setForeground(Color.green);
            jLabel22.setText("Good");
            Right++;
        }
        else{
            jLabel22.setForeground(Color.red);
            jLabel22.setText("*");
        }

        //Checking Department Number
        boolean good;
        if (!DepartmentNumber.getText().matches("[0-9]+")){
            jLabel24.setForeground(Color.red);
            jLabel24.setText("*");
            Check = false;
        }
        else{
            jLabel24.setForeground(Color.green);
            jLabel24.setText("Good");
            Right++;
        }
        //setting progress bar
        Progress.setValue(Right);
        //setting age
        Age.setText("" + ageCalc((int)BirthYear.getValue(), (int)BirthMonth.getValue(), (int)BirthDay.getValue()));
        //setting years at company
        if (!CurrentEmployee.isSelected()){
            YearsWithCompany.setText("" + hireCalc((int)HireYear.getValue(), (int)HireMonth.getValue(), (int)HireDay.getValue(), (int)TermYear.getValue(), (int)TermMonth.getValue(), (int)TermDay.getValue()));
        }
        else{
            YearsWithCompany.setText("" + ageCalc((int)HireYear.getValue(), (int)HireMonth.getValue(), (int)HireDay.getValue()));
        }
        return Check;
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try{
            PrintWriter out = new PrintWriter(
                new BufferedWriter(
                    new FileWriter(file)), true);
            for (int i = 0; i < Employees.size(); i++){
                out.println(Employees.get(i));
            }
            System.exit(0);
        }catch(IOException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            PrintWriter out = new PrintWriter(
                new BufferedWriter(
                    new FileWriter(file)), true);
            for (int i = 0; i < Employees.size(); i++){
                out.println(Employees.get(i));
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (Employee.getSelectedIndex() > 0)
        Employee.setSelectedIndex(Employee.getSelectedIndex() - 1);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (Employee.getSelectedIndex() < Employee.getItemCount() - 1)
        Employee.setSelectedIndex(Employee.getSelectedIndex() + 1);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void SearchBySinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBySinActionPerformed
        Employees1.clear();
        int j = Employees.size();
        for (int i = 0; i < j; i++){
            if (getElement(Employees.get(i), 7).equals(SearchSin.getText())){
                Employees1.add(Employees.get(i));
            }
        }
        for (int i = 0; i < j; i++){
            if (!getElement(Employees.get(i), 7).equals(SearchSin.getText())){
                Employees1.add(Employees.get(i));
            }
        }
        Employees.clear();
        for (int i = 0; i < Employees1.size(); i++)
        Employees.add(Employees1.get(i));
        Employee.removeAllItems();
        for (int i = 0; i < Employees.size(); i++){
            Employee.addItem(getElement(Employees.get(i), 0) + " " +  getElement(Employees.get(i), 1));
        }
    }//GEN-LAST:event_SearchBySinActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        try
        {
            Process p=Runtime.getRuntime().exec("cmd /c start http://www.dragonballz.com/");
        }
        catch(IOException e1) {System.out.println(e1);}
    }//GEN-LAST:event_jPanel3MouseClicked

    private void SearchByLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByLastNameActionPerformed
        Employees1.clear();
        int j = Employees.size();
        for (int i = 0; i < j; i++){
            if (getElement(Employees.get(i), 1).equals(SearchLastName.getText())){
                Employees1.add(Employees.get(i));
            }
        }
        for (int i = 0; i < j; i++){
            if (!getElement(Employees.get(i), 1).equals(SearchLastName.getText())){
                Employees1.add(Employees.get(i));
            }
        }
        Employees.clear();
        for (int i = 0; i < Employees1.size(); i++)
        Employees.add(Employees1.get(i));
        Employee.removeAllItems();
        for (int i = 0; i < Employees.size(); i++){
            Employee.addItem(getElement(Employees.get(i), 0) + " " +  getElement(Employees.get(i), 1));
        }
    }//GEN-LAST:event_SearchByLastNameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String Temp;
        Collections.sort(Employees);
        for (int i = 0; i < Employees.size(); i++){
            for (int j = 0; j < Employees.size(); j++){
                    if(Integer.parseInt(getElement(Employees.get(i), 19)) > Integer.parseInt(getElement(Employees.get(j), 19))){
                        Temp = Employees.get(i);
                        Employees.set(i, Employees.get(j));
                        Employees.set(j, Temp);
                    }
            }
        }
        Employee.removeAllItems();
        for (int i = 0; i < Employees.size(); i++){
            Employee.addItem(getElement(Employees.get(i), 0) + " " +  getElement(Employees.get(i), 1) + ": " + getElement(Employees.get(i), 19));
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String Temp;
        for (int i = 0; i < Employees.size(); i++){
            for (int j = 0; j < Employees.size(); j++){
                if (Integer.parseInt(getElement(Employees.get(i), 20)) != Integer.parseInt(getElement(Employees.get(j), 20))){
                    if(Integer.parseInt(getElement(Employees.get(i), 20)) > Integer.parseInt(getElement(Employees.get(j), 20))){
                        Temp = Employees.get(i);
                        Employees.set(i, Employees.get(j));
                        Employees.set(j, Temp);
                    }
                }
            }
        }
        Employee.removeAllItems();
        for (int i = 0; i < Employees.size(); i++){
            Employee.addItem(getElement(Employees.get(i), 0) + " " +  getElement(Employees.get(i), 1) + ": " + getElement(Employees.get(i), 20));
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String Temp;
        for (int i = 0; i < Employees.size(); i++){
            for (int j = 0; j < Employees.size(); j++){
                    if(Integer.parseInt(getElement(Employees.get(i), 21)) > Integer.parseInt(getElement(Employees.get(j), 21))){
                        Temp = Employees.get(i);
                        Employees.set(i, Employees.get(j));
                        Employees.set(j, Temp);
                    }
            }
        }
        Employee.removeAllItems();
        for (int i = 0; i < Employees.size(); i++){
            Employee.addItem(getElement(Employees.get(i), 0) + " " +  getElement(Employees.get(i), 1) + ": " + getElement(Employees.get(i), 21));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

            Collections.sort(Employees);
            Employee.removeAllItems();
            for (int i = 0; i < Employees.size(); i++){
                Employee.addItem(getElement(Employees.get(i), 0) + " " +  getElement(Employees.get(i), 1));
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String DividedInfo [] = null;
        String Information;
        Information = Employees.get(Employee.getSelectedIndex());
        DividedInfo = Information.split("~");
        FirstName.setText(DividedInfo [0]);
        LastName.setText(DividedInfo [1]);
        HouseNumber.setValue(Integer.parseInt(DividedInfo [2]));
        Street.setText(DividedInfo [3]);
        Province.setSelectedItem(DividedInfo [4]);
        City.setText(DividedInfo [5]);
        PostalCode.setText(DividedInfo [6]);
        SocialInsuranceNumber.setText(DividedInfo [7]);
        HomePhone.setText(DividedInfo [8]);
        CellPhone.setText(DividedInfo [9]);
        BirthYear.setValue(Integer.parseInt(DividedInfo [10]));
        BirthMonth.setValue(Integer.parseInt(DividedInfo [11]));
        BirthDay.setValue(Integer.parseInt(DividedInfo [12]));
        HireYear.setValue(Integer.parseInt(DividedInfo [13]));
        HireMonth.setValue(Integer.parseInt(DividedInfo [14]));
        HireDay.setValue(Integer.parseInt(DividedInfo [15]));
        if (DividedInfo [16].equals("N/A")){
            CurrentEmployee.setSelected(true);
            ActiveEmployee.setVisible(true);
        }
        else{
            TermYear.setValue(Integer.parseInt(DividedInfo [16]));
            TermMonth.setValue(Integer.parseInt(DividedInfo [17]));
            TermDay.setValue(Integer.parseInt(DividedInfo [18]));
        }
        DepartmentNumber.setText(DividedInfo [19]);
        Employees.remove(Employee.getSelectedIndex());
        Employee.removeAllItems();
        for (int i = 0; i < Employees.size(); i++){
            Employee.addItem(getElement(Employees.get(i), 0) + " " +  getElement(Employees.get(i), 1));
        }
        Edited = true;

    }//GEN-LAST:event_jButton1ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        iCount++;
        String Part;
        Scanner scanner = new Scanner ("D://Employees.txt");
        boolean b = VerifyFeilds();
        if (b){
            if (!CurrentEmployee.isSelected())
            Employees.add(FirstName.getText() + "~" + LastName.getText() + "~" + (int)HouseNumber.getValue() + "~" + Street.getText() + "~" + Province.getSelectedItem() + "~" + City.getText() + "~" + PostalCode.getText() + "~" + SocialInsuranceNumber.getText() + "~" + HomePhone.getText() + "~" + CellPhone.getText() + "~" + BirthYear.getValue() + "~" + BirthMonth.getValue() + "~" + BirthDay.getValue() + "~" + HireYear.getValue() + "~" + HireMonth.getValue() + "~" + HireDay.getValue() + "~" + TermYear.getValue() + "~" + TermMonth.getValue() + "~" + TermDay.getValue() + "~" + DepartmentNumber.getText() + "~" + Age.getText() + "~" + YearsWithCompany.getText());
            else
            Employees.add(FirstName.getText() + "~" + LastName.getText() + "~" + (int)HouseNumber.getValue() + "~" + Street.getText() + "~" + Province.getSelectedItem() + "~" + City.getText() + "~" + PostalCode.getText() + "~" + SocialInsuranceNumber.getText() + "~" + HomePhone.getText() + "~" + CellPhone.getText() + "~" + BirthYear.getValue() + "~" + BirthMonth.getValue() + "~" + BirthDay.getValue() + "~" + HireYear.getValue() + "~" + HireMonth.getValue() + "~" + HireDay.getValue() + "~N/A~N/A~N/A~" + DepartmentNumber.getText() + "~" + Age.getText() + "~" + YearsWithCompany.getText());
            Array = new String [22];
            Array = Employees.get(Employees.size() - 1).split("~");
            Employee.addItem(getElement(Employees.get(Employees.size() - 1), 0) + " " +  getElement(Employees.get(Employees.size() - 1), 1));
            System.out.println(Array [1]);
            clearFeilds();
            Submit.setEnabled(false);
            jLabel8.setText(" ");
            jLabel9.setText(" ");
            jLabel10.setText(" ");
            jLabel11.setText(" ");
            jLabel12.setText(" ");
            jLabel13.setText(" ");
            jLabel14.setText(" ");
            jLabel15.setText(" ");
            jLabel16.setText(" ");
            jLabel20.setText(" ");
            jLabel22.setText(" ");
            jLabel23.setText(" ");
            jLabel24.setText(" ");
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void VerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifyActionPerformed
        boolean Check = VerifyFeilds();
        //making the button visible when all fields are good
        if (Check)
        Submit.setEnabled(true);
        else{
            Submit.setEnabled(false);
        }
    }//GEN-LAST:event_VerifyActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        clearFeilds();
    }//GEN-LAST:event_ResetActionPerformed

    private void CurrentEmployeeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CurrentEmployeeStateChanged
        if (CurrentEmployee.isSelected()){
            TermYear.setVisible(false);
            TermMonth.setVisible(false);
            TermDay.setVisible(false);
            ActiveEmployee.setVisible(true);
        }
        else{
            TermYear.setVisible(true);
            TermMonth.setVisible(true);
            TermDay.setVisible(true);
            ActiveEmployee.setVisible(false);
        }
    }//GEN-LAST:event_CurrentEmployeeStateChanged

    private void DepartmentNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepartmentNumberMouseClicked
        if (DepartmentNumber.getText().equals("Department Number"))
        DepartmentNumber.setText("");
    }//GEN-LAST:event_DepartmentNumberMouseClicked

    private void StreetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StreetMouseClicked
        if (Street.getText().equals("Street"))
        StreetClicked = false;
        if (!StreetClicked){
            Street.setText("");
            StreetClicked = true;
        }
    }//GEN-LAST:event_StreetMouseClicked

    private void CellPhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CellPhoneMouseClicked
        if (CellPhone.getText().equals("Cell Phone Number"))
        CellPhoneClicked = false;
        if (!CellPhoneClicked){
            CellPhone.setText("");
            CellPhoneClicked = true;
        }
    }//GEN-LAST:event_CellPhoneMouseClicked

    private void SocialInsuranceNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SocialInsuranceNumberMouseClicked
        if (SocialInsuranceNumber.getText().equals("Social Insurance Number")){
            SocialInsuranceNumber.setText("");
        }
    }//GEN-LAST:event_SocialInsuranceNumberMouseClicked

    private void HomePhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePhoneMouseClicked
        if (HomePhone.getText().equals("Home Phone Number"))
        HomePhoneClicked = false;
        if (!HomePhoneClicked){
            HomePhone.setText("");
            HomePhoneClicked = true;
        }
    }//GEN-LAST:event_HomePhoneMouseClicked

    private void PostalCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PostalCodeMouseClicked
        if (PostalCode.getText().equals("Postal Code (X#X #X#)")){
            PostalCode.setText("");
        }
    }//GEN-LAST:event_PostalCodeMouseClicked

    private void CityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CityMouseClicked
        if (City.getText().equals("City")){
            City.setText("");
        }
    }//GEN-LAST:event_CityMouseClicked

    private void LastNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LastNameMouseClicked
        if (LastName.getText().equals("Last Name"))
        LastNameClicked = false;
        if (!LastNameClicked){
            LastName.setText("");
            LastNameClicked = true;
        }
    }//GEN-LAST:event_LastNameMouseClicked

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed

    }//GEN-LAST:event_FirstNameActionPerformed

    private void FirstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstNameMouseClicked
        if (FirstName.getText().equals("First Name"))
        FirstNameClicked = false;
        if (!FirstNameClicked){
            FirstName.setText("");
            FirstNameClicked = true;
        }
    }//GEN-LAST:event_FirstNameMouseClicked

    private void FlagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlagActionPerformed
        Employee.removeAllItems();
        for (int i = 0; i < Employees.size(); i++){
            if (!getElement(Employees.get(i), 16).equals("N/A")){
                Employee.addItem(getElement(Employees.get(i), 0) + " " +  getElement(Employees.get(i), 1) + "- Term");
            }
            else
                Employee.addItem(getElement(Employees.get(i), 0) + " " +  getElement(Employees.get(i), 1));
        }
    }//GEN-LAST:event_FlagActionPerformed

    public static boolean VerifyDate(int Year, int Month, int Day){
        boolean Hire, Term, Birth, Valid;
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, Year);
        c.set(Calendar.MONTH, Month - 1);
        c.set(Calendar.DAY_OF_MONTH, Day);
        if (c.get(Calendar.YEAR) == Year && c.get(Calendar.MONTH) == Month - 1  && c.get(Calendar.DAY_OF_MONTH) == Day)
        Valid = true;
        else
        Valid = false;
        
        return Valid;
    }
    
    public static boolean compareDates (int y1, int m1, int d1, int y2, int m2, int d2){
        if (y1 > y2)
        return false;
        else{
            if (y1 == y2){
                if (m1 > m2)
                    return false;
                else{
                    if (m1 == m2){
                        if (d1 > d2){
                            return false;
                        }
                        else
                            return true;
                    }
                    else
                        return true;
                }
            }
            else
                return true;
        }
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActiveEmployee;
    private javax.swing.JTextField Age;
    private javax.swing.JSpinner BirthDay;
    private javax.swing.JSpinner BirthMonth;
    private javax.swing.JSpinner BirthYear;
    private javax.swing.JTextField CellPhone;
    private javax.swing.JTextField City;
    private javax.swing.JCheckBox CurrentEmployee;
    private javax.swing.JTextField DepartmentNumber;
    private javax.swing.JButton Done;
    private javax.swing.JButton Edit;
    private javax.swing.JComboBox Employee;
    private javax.swing.JTextField FirstName;
    private javax.swing.JButton Flag;
    private javax.swing.JSpinner HireDay;
    private javax.swing.JSpinner HireMonth;
    private javax.swing.JSpinner HireYear;
    private javax.swing.JTextField HomePhone;
    private javax.swing.JSpinner HouseNumber;
    private javax.swing.JTextField LastName;
    private javax.swing.JLabel Message1;
    private javax.swing.JTextField PostalCode;
    private javax.swing.JProgressBar Progress;
    private javax.swing.JComboBox Province;
    private javax.swing.JButton Reset;
    private javax.swing.JButton SearchByLastName;
    private javax.swing.JButton SearchBySin;
    private javax.swing.JTextField SearchLastName;
    private javax.swing.JTextField SearchSin;
    private javax.swing.JTextField SocialInsuranceNumber;
    private javax.swing.JTextField Street;
    private javax.swing.JButton Submit;
    private javax.swing.JSpinner TermDay;
    private javax.swing.JSpinner TermMonth;
    private javax.swing.JSpinner TermYear;
    private javax.swing.JButton Verify;
    private javax.swing.JTextField YearsWithCompany;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}

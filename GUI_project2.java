/**
 *Text genereted by Simple GUI Extension for BlueJ
 */
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;

public class GUI_project2 extends JFrame {
    private JMenuBar menuBar;
    private JButton button1;
    private JButton button2;
    private JCheckBox checkbox2;
    private JCheckBox checkbox3;
    private JCheckBox checkbox4;
    private JCheckBox checkbox5;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textfield1;

    private String cfgPath;
    private utils ut = new utils();
    private boolean bPath=false;

    //Constructor 
    public GUI_project2(){

        this.setTitle("Dota2 Config Installer");
        this.setSize(484,397);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(484,397));
        contentPane.setBackground(new Color(192,192,192));

        button1 = new JButton();
        button1.setBounds(0,357,484,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Install");
        button1.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    Execute(evt);

                }
            });

        button2 = new JButton();
        button2.setBounds(409,290,70,35);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Locate");
        button2.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    DirSearch(evt);
                }
            });

        checkbox2 = new JCheckBox();
        checkbox2.setBounds(5,30,400,35);
        checkbox2.setBackground(new Color(214,217,223));
        checkbox2.setForeground(new Color(0,0,0));
        checkbox2.setEnabled(true);
        checkbox2.setFont(new Font("sansserif",0,12));
        checkbox2.setText("Loopuleasa's Super Compact QWERTG-DFXCV Layout");
        checkbox2.setVisible(true);

        checkbox3 = new JCheckBox();
        checkbox3.setBounds(5,120,90,35);
        checkbox3.setBackground(new Color(214,217,223));
        checkbox3.setForeground(new Color(0,0,0));
        checkbox3.setEnabled(true);
        checkbox3.setFont(new Font("sansserif",0,12));
        checkbox3.setText("CheckBox");
        checkbox3.setVisible(false);

        checkbox4 = new JCheckBox();
        checkbox4.setBounds(5,200,400,35);
        checkbox4.setBackground(new Color(214,217,223));
        checkbox4.setForeground(new Color(0,0,0));
        checkbox4.setEnabled(true);
        checkbox4.setFont(new Font("sansserif",0,12));
        checkbox4.setText("The Core");
        checkbox4.setVisible(true);

        checkbox5 = new JCheckBox();
        checkbox5.setBounds(5,125,400,35);
        checkbox5.setBackground(new Color(214,217,223));
        checkbox5.setForeground(new Color(0,0,0));
        checkbox5.setEnabled(true);
        checkbox5.setFont(new Font("sansserif",0,12));
        checkbox5.setText("Tabby's Small ISO Layout");
        checkbox5.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(5,5,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Configurations");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(5,100,400,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Defunct Configurations");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(5,175,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Developer Stuff");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(5,260,500,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Dota2 Install Location ('dota 2 beta' Folder)");
        label5.setVisible(true);

        textfield1 = new JTextField();
        textfield1.setBounds(6,290,404,35);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("Dota2 Install Location");
        textfield1.setVisible(true);
        textfield1.setEditable(false);

        //adding components to contentPane panel
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(checkbox2);
        contentPane.add(checkbox3);
        contentPane.add(checkbox4);
        contentPane.add(checkbox5);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(textfield1);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
    }

    //Method mouseClicked for button1
    private void Execute (MouseEvent evt) {
        //TODO
        boolean conditionsMet=true;
        if(!bPath){JOptionPane.showMessageDialog(new JFrame(), "Please Choose A Valid Folder");conditionsMet=false;}
        
        
        if(conditionsMet){System.out.println("Commencing");new Install(textfield1.getText(), checkbox2.isSelected(), checkbox4.isSelected(), checkbox5.isSelected());}
    }

    //Method mouseClicked for button2
    private void DirSearch (MouseEvent evt) {
        System.out.println("Search");
        JFileChooser chooser;
        String choosertitle="";

        chooser = new JFileChooser(); 
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);
        //    
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION && ut.verifyPath(""+chooser.getSelectedFile())) { 
            bPath=true;
            cfgPath=""+chooser.getSelectedFile();
            textfield1.setText(cfgPath);
        }
        
        else {
            bPath=false;
            JOptionPane.showMessageDialog(new JFrame(), "Invalid Folder\nAre you sure you selected 'dota 2 beta'\n\nDefault Folder is:\nC:\\Program Files (x86)\\Steam\\steamapps\\common\\dota 2 beta");
        }
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");
        JMenu about = new JMenu("About");

        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem tools = new JMenuItem("Tools   ");
        JMenuItem github = new JMenuItem("GitHub   ");

        file.add(exit);
        help.add(about);
        about.add(github);

        menuBar.add(file);
        menuBar.add(help);
    }

    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new GUI_project2();
                }
            });
    }

}
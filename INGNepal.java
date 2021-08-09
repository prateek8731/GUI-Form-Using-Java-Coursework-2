
/**
 * Write a description of class INGNepal here.
 *This is the graphical user interface of INGNepal class.
 *This takes input from user and provides,display appropriate message on the condition.
 *This class INGNepal uses previous class StaffHire and its child class for input gaining.
 *
 * @Pratik Dhakal
 * @12 April 2020
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList; 
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class INGNepal implements ActionListener
{
   private JFrame frame;
   private JPanel panel;

   private JButton jb,bb,ee,kk,ll,xx,yy;
   private JComboBox cb,tt,jc,jo;
   private JLabel title,tty,text,text1,text2,text3,text4,text5,text6,text7,text8,text9,tx,tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10;
   private JTextField field,field1,field3,field4,field5,field6,field7,field8,field9,fl,fl1,fl4,fl5,fl6,fl7,fl8,fl9,fl10;
   
   FullTimeStaffHire obj;
   FullTimeStaffHire obj1;
   PartTimeStaffHire obj2;
   PartTimeStaffHire obj9;
   PartTimeStaffHire obj4;
   FullTimeStaffHire obj5;
   PartTimeStaffHire obj6;
   
   ArrayList<StaffHire> all = new ArrayList();
   
 
    public void m1()
    {
      frame = new JFrame();//creating JPanel
      frame.setVisible(true);
      frame.setTitle("INGNepal");
      frame.setSize(1200,850);
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
      frame.setResizable(false);

      frame.setBackground(Color.GREEN);//setting frame background
     

      panel = new JPanel();
      panel.setLayout(null);
      panel.setBackground(Color.GRAY);
      frame.add(panel);
      
     
      title = new JLabel();
      title.setText("FullTime Staff Hire");
      Font f=new Font("Times New Roman",Font.PLAIN,42);
      title.setBounds(450,30,370,50);

     
      title.setFont(f);
      panel.add(title);//adding title to panel

      text = new JLabel();
      text.setText("Vacancy Number :");
      text.setBounds(90,62,200,120);
      panel.add(text);
    
      field = new JTextField();
      field.setBounds(240,108,180,30);
      panel.add(field);
     
      text1 = new JLabel();
      text1.setText("Designation :");
      text1.setBounds(740,62,200,120);
      panel.add(text1);
     
      field1 = new JTextField();
      field1.setBounds(850,108,180,30);
      panel.add(field1);
     
      text2= new JLabel();
      text2.setText("JobType: ");
      text2.setBounds(90,145,180,30);
      panel.add(text2);
     
      
      String JobType[]={"Select","Full Time","Part Time"};
      cb= new JComboBox(JobType);
      cb.setBounds(240,151,185,35);
      panel.add(cb);
      
     
      text3 = new JLabel();
      text3.setText("Salary :");
      text3.setBounds(740,100,200,120);
      panel.add(text3);
     
      field3 = new JTextField();
      field3.setBounds(850,150,180,30);
      panel.add(field3);
     
      text4 = new JLabel();
      text4.setText("Working Hour: ");
      text4.setBounds(90,155,200,120);
      panel.add(text4);
     
      field4 = new JTextField();
      field4.setBounds(240,200,180,30);
      panel.add(field4);
     
     
      jb= new JButton("Add Vacancy For Full Time Staff");
      jb.setBounds(740,200,300,40);
      jb.addActionListener(this);
      panel.add(jb);
    
     
      text5 = new JLabel();
      text5.setText("Vacancy Number: ");
      text5.setBounds(90,200,200,120);
      panel.add(text5);
     
      field5 = new JTextField();
      field5.setBounds(240,245,180,30);
      panel.add(field5);
     
      text6 = new JLabel();
      text6.setText("Staff Name :");
      text6.setBounds(740,210,200,120);
      panel.add(text6);
     
      field6 = new JTextField();
      field6.setBounds(850,255,180,30);
      panel.add(field6);
     
      text7 = new JLabel();
      text7.setText("Joining Date: ");
      text7.setBounds(90,235,200,120);
      panel.add(text7);
     
      field7 = new JTextField();
      field7.setBounds(240,279,180,30);
      panel.add(field7);
     
      text8 = new JLabel();
      text8.setText("Qualification :");
      text8.setBounds(740,245,200,120);
      panel.add(text8);
     
      field8 = new JTextField();
      field8.setBounds(850,289,180,30);
      panel.add(field8);
      
      text9 = new JLabel();
      text9.setText("Appointed BY :");
      text9.setBounds(90,270,200,120);
      panel.add(text9);
     
      field9 = new JTextField();
      field9.setBounds(240,315,180,30);
      panel.add(field9);
     
     
      bb= new JButton("Appoint Full Time Staff");
      bb.setBounds(740,325,300,40);
      bb.addActionListener(this);
      panel.add(bb);
     
     

      text.repaint();
      text1.repaint();
      text2.repaint();
      text3.repaint();
      text4.repaint();
      text5.repaint();
      text6.repaint();
      text7.repaint();
      text8.repaint();
      text8.repaint();
      text9.repaint();
     
      cb.repaint();

      //Part Time Section
      
      tty = new JLabel();
      tty.setText("PartTime Staff Hire");
      Font ff=new Font("ARIAL",Font.PLAIN,32);
      tty.setBounds(550,370,300,30);
      
      panel.setFont(ff);
      panel.add(tty);
     
      tx = new JLabel();
      tx.setText("Vacancy Number :");
      tx.setBounds(90,380,200,120);
      panel.add(tx);
    
      fl = new JTextField();
      fl.setBounds(240,425,180,30);
      panel.add(fl);
     
      tx1 = new JLabel();
      tx1.setText("Designation :");
      tx1.setBounds(740,380,200,120);
      panel.add(tx1);
     
      fl1 = new JTextField();
      fl1.setBounds(850,425,180,30);
      panel.add(fl1);
     
      tx2= new JLabel();
      tx2.setText("JobType: ");
      tx2.setBounds(90,459,180,30);
      panel.add(tx2);
     
     
      String Jobtype[]={"Select","Full_Time","Part_Time"};
      jc= new JComboBox(JobType);
      jc.setBounds(240,460,185,35);
      panel.add(jc);
     
     
      tx3 = new JLabel();
      tx3.setText("Working Hour: ");
      tx3.setBounds(740,415,200,120);
      panel.add(tx3);
     
      fl4 = new JTextField();
      fl4.setBounds(850,460,180,30);
      panel.add(fl4);
     
      tx4 = new JLabel();
      tx4.setText("Wages Per Hour :");
      tx4.setBounds(90,445,200,120);
      panel.add(tx4);
    
      fl5 = new JTextField();
      fl5.setBounds(240,490,180,30);
      panel.add(fl5);
     
      tx5= new JLabel();
      tx5.setText("Shift: ");
      tx5.setBounds(740,498,180,30);
      panel.add(tx5);
     
     
      String Shift[]={"Select","Morning","Day","Night"};
      jo= new JComboBox(Shift);
      jo.setBounds(850,495,185,35);
      panel.add(jo);
     
     
     
      ee= new JButton("Add Vacancy For Part Time Staff");
      ee.setBounds(465,530,250,40);
      ee.addActionListener(this);
      panel.add(ee);
     
     
     
      tx6 = new JLabel();
      tx6.setText("Vacancy Number: ");
      tx6.setBounds(90,525,200,120);
      panel.add(tx6);
     
      fl6 = new JTextField();
      fl6.setBounds(240,570,180,30);
      panel.add(fl6);
      
      tx7 = new JLabel();
      tx7.setText("Staff Name :");
      tx7.setBounds(740,525,200,120);
      panel.add(tx7);
     
      fl7 = new JTextField();
      fl7.setBounds(850,570,180,30);
      panel.add(fl7);
     
      tx8 = new JLabel();
      tx8.setText("Joining Date: ");
      tx8.setBounds(90,555,200,120);
      panel.add(tx8);
     
      fl8 = new JTextField();
      fl8.setBounds(240,600,180,30);
      panel.add(fl8);
     
      tx9 = new JLabel();
      tx9.setText("Qualification :");
      tx9.setBounds(740,555,200,120);
      panel.add(tx9);
     
      fl9 = new JTextField();
      fl9.setBounds(850,600,180,30);
      panel.add(fl9);
     
      tx10 = new JLabel();
      tx10.setText("Appointed BY :");
      tx10.setBounds(90,590,200,120);
      panel.add(tx10);
     
      fl10 = new JTextField();
      fl10.setBounds(240,635,180,30);
      panel.add(fl10);

     
      kk= new JButton("Appoint Part Time Staff");
      kk.setBounds(740,640,300,40);
      kk.addActionListener(this);
      panel.add(kk);
     
     
     
      ll= new JButton("Terminate Part Time Staff");
      ll.setBounds(465,740,230,40);
      ll.addActionListener(this);
      panel.add(ll);
     
     
     
      xx= new JButton("Display");
      xx.setBounds(90,750,180,40);
      xx.addActionListener(this);
      panel.add(xx);
     
     
      yy= new JButton("Clear");
      yy.setBounds(850,750,180,40);
      yy.addActionListener(this);
      panel.add(yy);
      
      tx.repaint();
      tx1.repaint();
      tx2.repaint();
      tx3.repaint();
      tx4.repaint();
      tx5.repaint();
      tx6.repaint();
      tx7.repaint();
      tx8.repaint();
      tx9.repaint();
      tx10.repaint();
     
      frame.setLayout(null);
      frame.setVisible(true);
    }  

       /**Methods initializing
        * this method is created to initialize the working mechanism of the buttons.
        */
       public void actionPerformed(ActionEvent e)
       {
          if(e.getSource()==jb)
          {
              addForFullTimeStaffHire();  
          }
          else if(e.getSource()==bb)
          {
              appointForFullTimeStaffHire();
          }
          else if(e.getSource()==ee)
          {
             addForPartTimeStaffHire(); 
          }
          else if(e.getSource()==kk)
          {
              appointForPartTimeStaffHire();
          }
          else if(e.getSource()==ll)
          {
              Terminate();
          }
          else if(e.getSource()==xx)
          {
              Display();
          }
          else if(e.getSource()==yy)
          {
              Clear();
          }
        }
      
      
      

      /**
       * This is a method of full time staff hire,
       * it describes the working function of add vacancy for full time staff buttom when the button is pressed.
       * and displays appropriate message on the condition when the button is pressed
       */
      public void addForFullTimeStaffHire()
      {
          try
          {
              int VacancyNumber=Integer.parseInt(field.getText());
              String Designation=field1.getText();
              String JobType=(cb.getSelectedItem()).toString();
              int Salary=Integer.parseInt(field3.getText());
              int workingHour=Integer.parseInt(field4.getText());
              boolean isDuplicateVacancyno=false;
              for(StaffHire var:all)
              {
                  if(var.getVacancynumber()==VacancyNumber)
                  {
                      isDuplicateVacancyno=true;
                      
                  }
                  
              }
              if(isDuplicateVacancyno==false)
              {
                obj=new FullTimeStaffHire(VacancyNumber,Designation,JobType,Salary,workingHour);
                all.add(obj);
                JOptionPane.showMessageDialog(frame,"Vacancy for FullTime has been succesfully added");
                
              }
              else
              {
                  JOptionPane.showMessageDialog(frame,"Given Vacancy is already added");
                  
              }
              
          }

          catch(NumberFormatException exce)
          {
              JOptionPane.showMessageDialog(frame,"Non-integer/empty values are not allowed !");
              
          }
          
          catch(Exception ex)
          {
              JOptionPane.showMessageDialog(frame,"All Text Fields are Mandatory.");
              
          }
          

      }
      
      /**
       * This method is used to appoint full time staff
       * it describes what and how a staff is appointed on button click and what to do in wrong input.
       */
      public void appointForFullTimeStaffHire()
      {
          int VacancyNumber = Integer.parseInt(field5.getText());
          String StaffName = field6.getText();
          String JoiningDate = field7.getText();
          String Qualification= field8.getText();
          String AppointedBy=field9.getText();
          boolean VacancynoFound=false;
          for(StaffHire obj:all)
          {
              if(obj.getVacancynumber()==VacancyNumber)
              {
                  VacancynoFound=true;
                  if(obj instanceof FullTimeStaffHire)
                  {
                       obj1 = (FullTimeStaffHire)obj;
                      if(obj1.getjoined()==true)
                      {
                         JOptionPane.showMessageDialog(frame,"Staff Has already been Hired");
                         break;
                      }
                      else
                      {
                          obj1.hirefulltimestaff(StaffName,JoiningDate,Qualification,AppointedBy);
                          JOptionPane.showMessageDialog(panel,"Staff has been hired");
                          break;
                      }
                      
                  }
                  else
                  {
                     JOptionPane.showMessageDialog(frame,"Not Suitable for FullTime Staff Hire");
                     break;
                  }
              }
              else
              {
                  JOptionPane.showMessageDialog(frame,"Invalid Vacancy Found");
                  break;
              }
              
          }
      }
      
      /**
       * This method is used to add part time staff
       * It adds part time vacancy on button click and also displays error message when wron input are filled
       * try and catch block are used for catching exception
       */
      public void addForPartTimeStaffHire()
      {
          try
          {
              int VacancyNumber=Integer.parseInt(fl.getText());
              String Designation=fl1.getText();
              String JobType=(jc.getSelectedItem()).toString();
              int workingHour=Integer.parseInt(fl4.getText());
              int wagesperHour=Integer.parseInt(fl5.getText());
              String Shifts=(jo.getSelectedItem()).toString();
              boolean isDuplicateVacancyno=false;
              for(StaffHire var:all)
              {
                  if(var.getVacancynumber()==VacancyNumber)
                  {
                      isDuplicateVacancyno=true;
                      break;
                  }
              }
              if(isDuplicateVacancyno==false)
              {
                obj2 =new PartTimeStaffHire(VacancyNumber,Designation,JobType,workingHour,wagesperHour,Shifts);
                all.add(obj2);
                JOptionPane.showMessageDialog(frame,"Vacancy for PartTime has been succesfully added");
              }
              else
              {
                  JOptionPane.showMessageDialog(frame,"Given Vacancy is already added");
              }
              
          }
          
          catch(NumberFormatException nfee)
          {
              JOptionPane.showMessageDialog(frame,"Non- numeric/empty fields are not allowed! please, fill again");
              
          }
          
          catch(Exception exp)
          {
              JOptionPane.showMessageDialog(frame,"All Text Fields are Mandatory.");
          }
      }
      
      
      /**
       * This method appoints part time staff
       */
      public void appointForPartTimeStaffHire()
      {
          int VacancyNumber = Integer.parseInt(fl6.getText());
          String StaffName = fl7.getText();
          String JoiningDate = fl8.getText();
          String Qualification= fl9.getText();
          String AppointedBy=fl10.getText();
          boolean VacancynoFound=false;
          for(StaffHire obj:all)
          {
              if(obj.getVacancynumber()==VacancyNumber)
              {
                  VacancynoFound=true;
                  if(obj instanceof PartTimeStaffHire)
                  {
                      obj9 = (PartTimeStaffHire)obj;
                      if(obj9.getjoined()==true)
                      {
                         JOptionPane.showMessageDialog(frame,"Staff Has already been Hired");
                         break;
                      }
                      else
                      {
                          obj9.hireparttimestaffhire(StaffName,JoiningDate,Qualification,AppointedBy);
                          JOptionPane.showMessageDialog(panel,"Staff has been Succesfully hired");
                          break;
                      }
                      
                  }
                  else
                  {
                     JOptionPane.showMessageDialog(frame,"Not Suitable for PartTime Staff Hire");
                     break;
                  }
              }
              else
              {
                  JOptionPane.showMessageDialog(frame,"Invalid Vacancy Found");
                  break;
              }
              
           }
      } 
      
      /**
       * This method is for termination of part time
       * when a staff is appointed then only it can terminate the staff
       */
       public void Terminate()
       {
        
              int Vacancy_no=Integer.parseInt(fl6.getText());  
                for(StaffHire obj:all){
                    if(obj.getVacancynumber()==Vacancy_no)
                    {
                        if(obj instanceof PartTimeStaffHire)
                        {
                            PartTimeStaffHire hel=(PartTimeStaffHire)obj;
                            if(hel.getterminated()==true)
                            {
                                JOptionPane.showMessageDialog(frame,"Part-Time Staff is alreay terminated!");
                                break;
                            }
                            else
                            {
                                hel.setterminated();
                                JOptionPane.showMessageDialog(frame,"Part-Time Staff is  terminated!");
                                break;
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(frame,"Not applicable for Part Time Terminate.");
                            break;
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame,"Enter vacancy number.");
                        
                    }
                }
       }
      
      /**
       * this is display method for displaying all the input
       * is simply gain the values from the text fields that are stored
       */
     public void Display()
     {
        for(StaffHire obj:all)
        {
          if(obj instanceof FullTimeStaffHire)
          {
              obj=(FullTimeStaffHire)obj;
              obj.display();
          }
          else if(obj instanceof PartTimeStaffHire)
          {
              obj6=(PartTimeStaffHire)obj;
              obj6.display();
          }
        }
     }
     
     /**
      * this method is created to clear each and every filled text fields
      */
     public void Clear()
     {
        JOptionPane.showMessageDialog(frame,"All the text fields has been cleared!");
        
        field.setText("");
        field1.setText("");
        field3.setText("");
        field4.setText("");
        field5.setText("");
        field6.setText("");
        field7.setText("");
        field8.setText("");
        field9.setText("");
        
        fl.setText("");
        fl1.setText("");
        fl4.setText("");
        fl5.setText("");
        fl6.setText("");
        fl7.setText("");
        fl8.setText("");
        fl9.setText("");
        fl10.setText("");
        
        
        cb.setSelectedIndex(0);
        jc.setSelectedIndex(0);
        jo.setSelectedIndex(0);
    }
    
    /**
     * this is a main method
     */
    public static void main(String[] args)
    {
        INGNepal in= new INGNepal();
        in.m1();
    }
}



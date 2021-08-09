/**
 * Write a description of class FullTimestaffHire here.
 *  This is child class of staffhire class.It has seven attributes.
 *  Constructor class is created with parameters of that class of different types of access modifiers.
 *  In the constructor super class varibles are called.
 *  getter and setter method are created and a method is created to check the status of joining.
 *  Finally a display method is created to print the output.
 * @author (Pratik Dhakal)
 * @version (30 December 2019)
 */   
class FullTimeStaffHire extends StaffHire // loading of super class in sub calss or parent class in child class

{  //instance variable decleration
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

     //creating constructor class
    FullTimeStaffHire (int Vacancynumber,String Designation,String JobType,int salary,int workingHour)
    {  
        super(Vacancynumber,Designation,JobType);//calling superclass variable
        this.salary=salary;
        this.workingHour=workingHour;
        this.staffName=" ";
        this.joiningDate=" ";
        this.qualification=" ";
        this.appointedBy=" ";
   
    }
    
     //getter method 
    public int getsalary()
    {
       return salary;   
    }
    
    
    public int getworkingHour()
    {
       return workingHour;   
    }
    

    public String getstaffName()
    {
       return staffName;   
    }
    
    public String getjoiningDate()
    {
       return joiningDate;   
    }
    
    public String getqualification()
    {
       return qualification;   
    }
    
    public String getappointedBy()
    {
       return appointedBy;   
    }
    
    public boolean getjoined()
    {
        return joined;
    }
    
    /**setter method for value changing according to condition*/
    public void setsalary(int salary)
        {
            this.salary=salary;
            if (joined==true)
            System.out.println("You have been appointed Therefore, not possible to change" +salary);
        }
    
     
     public void setworkingHour(int workingHour)
        {
           this.workingHour=workingHour;
           System.out.println("The working Hour is" + workingHour);
        }
    
        /**new method for value changing according to conditions*/
       public void hirefulltimestaff(String staffName,String joiningDate,String qualification,String appointedBy)
       {

          if(joined==true)
          {
              System.out.println(" staffName" + staffName);
              System.out.println("joiningDate" +joiningDate);
              
          }
          
          else
          {
             this.staffName=staffName;
             this.joiningDate=joiningDate;
             this.qualification=qualification;
             this.appointedBy=appointedBy;
             joined=true;
          }
       }
       
       //display method for displaying attributes value
       public void display()
        {
            super.display();
            if(joined==true)
            {
            System.out.println("staffName =" +this.getstaffName());//calling of getters method
            System.out.println("workingHour =" +this.getworkingHour());
            System.out.println("joiningDate =" +this.getjoiningDate());
            System.out.println("qualification =" +this.getqualification());
            System.out.println("appointedBy =" +this.getappointedBy());
            }
        }
      

}
   
        
        
    
    
    
    
    
    
    
    

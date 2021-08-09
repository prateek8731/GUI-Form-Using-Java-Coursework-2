/**
 * Write a description of class StaffHire here.
 * Among all the class, staffHire is the parent class and has two child class. This class has three attributes of different types.
 * first constructor class is created for those attributes with a corresponding access modifers(getter and setter method)
 * At last a display method is created to print output of the attributes.
 * @author (Pratik Dhakal)
 * @version (30 December 2019)
 */
public class StaffHire//this is supercalss, parent class
{
      // variable decleration
      private int Vacancynumber;
      private String Designation;
      private String JobType;
      
      //creating parameterized constructors which initialized value to instance variables of staff hire class 
      StaffHire(int Vacancynumber,String Designation, String JobType)//creating constructor 
        {
            this.Vacancynumber=Vacancynumber;//this. is reference variables which refers instance variable
            this.Designation=Designation;
            this.JobType=JobType;
        }

      //getter and Setter method of staffHire class's variable
      public void setVacancynumber(int Vacancynumber)
        {
            this.Vacancynumber=Vacancynumber;
        }
        
        
        public int getVacancynumber()
        {
            return Vacancynumber;
        }
      
      
      public void setDesignation(String Designation)
        {
            this.Designation="Designation";
        }
        
        
        public String getDesignation()
        {
            return Designation;
        }
        
       
      public void setJobType(String JobType)
        {
            this.JobType="JobType";
        }
        
        
        public String getJobType()
        {
            return JobType;
        }
        
        //creating method for value display 
        void display()
        {
            System.out.println("The vacancy number =" + this.getVacancynumber());//calling of getters method
            System.out.println("The vacancy Designation =" + this.getDesignation());
            System.out.println("The JobType of vacancy =" + this.getJobType());
        }
}




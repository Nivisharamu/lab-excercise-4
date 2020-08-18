package YEAR_II;

import java.util.Scanner;

public class YearIIMarks {
    public void display()
    {
       Scanner obj=new Scanner(System.in);
        int sub3mark=obj.nextInt();
        int sub4mark=obj.nextInt();
       System.out.println("Mark 3:"+sub3mark);
       System.out.println("Mark 4:"+sub4mark);
       
        if(sub3mark>50)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
        
         if(sub4mark>50)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }   
}

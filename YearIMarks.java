package YEAR_I;

import java.util.Scanner;

public class YearIMarks {
    public void display()
    {
        Scanner obj=new Scanner(System.in);
        int sub1mark=obj.nextInt();
        int sub2mark=obj.nextInt();
        System.out.println("Mark 1:"+sub1mark);
        System.out.println("Mark 2:"+sub2mark);
        
        if(sub1mark>50)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
         
         if(sub2mark>50)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}


package Student;

import java.util.Scanner;

import YEAR_I.*;

import YEAR_II.*;

public class student {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=obj.nextInt();
        for (int i=0;i<n;i++)
        {
        System.out.println("Enter rollnumber:");
        int rollnumber=obj.nextInt();
        System.out.println("Enter name:");
        String name=obj.next();
        System.out.println("Enter the marks:");
       
        YearIMarks s=new YearIMarks();
         s.display();
        System.out.println("Enter the marks:");
      
        YearIIMarks s1=new YearIIMarks(); 
         s1.display();
        
        }
       
    }
    
}

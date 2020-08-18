package worksheet4;

import pack1.*;//should give only after the package

import pack1.subpack.*;//should give only after the package

import pack2.*;

import pack2.subpack.*;

public class packdemo {
    public static void main(String[] args)
    {
        first s=new first();//if not gn import use pack1.first s=new pack1.first();
        s.display();
        second s1=new second();//pack1.second s1=new pack1.second();
        s1.display();
        third s2=new third();
        s2.display();
        fourth s3=new fourth();
        s3.display();
    }
    
}

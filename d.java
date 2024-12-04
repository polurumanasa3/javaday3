import java .util.*;
class d
{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        if((a&(a-1))==0)
        System.out.println("power of 2");
        else
        System.out.println("not power of 2");
    }
}


    

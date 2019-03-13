package Class;
import javax.swing.*;
public class Pri 
{
    public static void main(String[] args) 
    {
        String lv;
        int v;
        lv=JOptionPane.showInputDialog("desea ingresar al programa");
        v=Integer.parseInt(lv);
        while (v==1)
        {
             int a,b;
        double n1,n2,d; 
        char c;        
        a= Gra.sw();              
        switch (a)
        {
            case 1:
                n1=Gra.PNu();
                n2=Gra.PNu();
                c=Gra.POp();
                d=Ope.ALG(n1,n2,c);
                JOptionPane.showMessageDialog(null,"EL RESULTADO ES: "+d); 
                break;                                                      
            case 2:
                n1=Gra.PNu();
                b=Gra.POpT();
                d=Ope.TRIG(n1,b);
                JOptionPane.showMessageDialog(null,"EL RESULTADO ES: "+d); 
                break;   
            default:
               JOptionPane.showMessageDialog(null,"ESTA OPCION NO ES POSIBLE");      
            }
        lv=JOptionPane.showInputDialog("desea ingresar al programa");
        v=Integer.parseInt(lv);
        }
                        
    }
    
}

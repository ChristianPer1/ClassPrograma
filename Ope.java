package Class;
import javax.swing.JOptionPane;
public class Ope 
{
    
    public static double ALG(double a1, double a2, char op)
    {
      switch (op)
        {
            case '+':
                return a1+a2;
            case '-':
                return a1-a2;
            case '*':
                 return a1*a2;
            case '/':
                if(a1==0)
                {
                    JOptionPane.showMessageDialog(null,"INDEFINIDO");
                }
                else
                {
                     return a2/a1;
                }               
            default:
                 JOptionPane.showMessageDialog(null,"ESTA OPCION NO ES POSIBLE");
                return 0;
        }      
    }
     public static double TRIG(double an, int op)
    {
        double s;
        switch (op)
        {
            case 1:
                s = Math.toRadians(an);
                return Math.sin(s);
            case 2:
                s = Math.toRadians(an);
                return Math.cos(s); // coseno 90 no corresponde
            case 3:
                s = Math.toRadians(an);
                return Math.tan(s);
            case 4: 
                s = Math.toRadians(an);
                return Math.cos(s)/Math.tan(s);
            default:   
                return 0;
        }
    }    
}

package Class;
import javax.swing.*;
public class Gra 
{
    public static int sw()
    {
        String s;
        int s1;
        s=JOptionPane.showInputDialog("QUE OPERACION DESEA REALIZAR \n 1=ARITMETICAS \n 2=TRIGONOMETRICAS ");
        s1=Integer.parseInt(s);
        return s1;           
    }
    public static char POp()
    {    
        String cadena ; 
        cadena = JOptionPane.showInputDialog(" \n  ARITMETICAS \n\n\n ¿QUE OPERACION DESEA? \n + \n - \n * \n / " );
        char c = cadena.charAt(0); 
        return c;
    }
    public static double PNu()
    {
        String n1;
        double n;
        n1=JOptionPane.showInputDialog(null,"INGRESE EL NUMERO QUE DESEA");
        n=Double.parseDouble(n1);
        return n;  
    }
    public static int POpT()
    {           
        String op1;
        int op;
        op1=JOptionPane.showInputDialog(null," \n  TRIGONOMETRICAS \n\n\n QUE OPERACION DESEA REALIZAR \n 1=SENO \n 2=COSENO  \n 3=TANGENTE \n 4=COTANGENTE");
        op=Integer.parseInt(op1);
        return op;
    }

}

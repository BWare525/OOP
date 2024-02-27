package calculadora;
import java.util.Scanner;

public class Calculadora {
    
    double x, y, r;
    
    public Calculadora(double x, double y, double r){
        
        this.x=x;
        this.y=y;
        this.r=r;
    }
    
    public double Sumar(double x, double y){
    return r=x+y;
    }
    public double Restar(double x, double y){
    return r=x-y;
    }
    public double Multi(double x, double y){
    return r=x*y;
    }
    public double Div(double x, double y){
    return r=x/y;
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        Calculadora obj=new Calculadora(0,0,0);
        
        System.out.println("Calculadora Basica");
        System.out.println("Ingrese numero A");
        double a=sc.nextDouble();
        System.out.println("Ingrese numero B");
        double b=sc.nextDouble();
        System.out.println("Resultados");
        System.out.println("Suma: "+obj.Sumar(a,b)+"\nResta: "+obj.Restar(a, b)+"\nMultiplicacion: "+obj.Multi(a, b)+"\nDivision: "+obj.Div(a, b));
    }
    
}

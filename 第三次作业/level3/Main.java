package level3;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the opreate");
        String string=new String(input.next());
        System.out.println("Please input number");
        double a=input.nextDouble();
        double b=input.nextDouble();
        if(string.charAt(0)=='+') {
            calculate c=new plus(a,b);
            c.compute();
        }
        if(string.charAt(0)=='-') {
            calculate c=new minus(a,b);
            c.compute();
        }
        if(string.charAt(0)=='*') {
            calculate c=new multiply(a,b);
            c.compute();
        }
        if(string.charAt(0)=='/') {
            calculate c=new divide(a,b);
            c.compute();
        }
    }
}

interface calculate{
    double compute();
}
class plus implements calculate{
    public double a,b;
    public plus(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double compute(){
        System.out.println(a+b);
        return 0;
    }
}
class minus implements calculate{
    public double a,b;
    public minus(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double compute(){
        System.out.println(a-b);
        return 0;
    }
}
class multiply implements calculate{
    public double a,b;
    public multiply(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double compute(){
        System.out.println(a*b);
        return 0;
    }
}
class divide implements calculate{
    public double a,b;
    public divide(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double compute(){
        if(b==0) System.out.println("b cant be 0");
        else System.out.println(a/b);
        return 0;
    }
}

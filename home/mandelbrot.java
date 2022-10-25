import java.util.Scanner;
class mandelbrot{
    double x,c;
    mandelbrot(double x,double c){
        this.x=x;
        this.c=c;
    }
    double solve(){
        if(c<0) return 0.5+Math.sqrt(0.25-c);
        return 0.5-Math.sqrt(0.25-c);
    }
    int converge(){
        int i;
        for(i=0;true;i++){
            if(x==Math.pow(x,2)+c)return i;
            x=Math.pow(x,2)+c;
            System.out.println(i+":"+x);//the line that shows steps.
            if(x>1&&(Math.pow(x,2)+c)>x)return -1;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the constant");
        double c=sc.nextDouble();
        System.out.println("Start from 0?(y/n)");
        String b=sc.next();
        double x=0;
        if(b.equalsIgnoreCase("n")){
            System.out.println("enter x");
            x=sc.nextDouble();
        }
        mandelbrot ob=new mandelbrot(x,c);
        int steps=ob.converge();
        if(steps==-1)
            System.out.println("It does not converge");
        else{
            double soln=ob.solve();
            System.out.println("It converges after "+steps+" steps at x="+soln+".");
        }
        sc.close();
    }
} 
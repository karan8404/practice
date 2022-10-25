import java.util.Scanner;
public class check{
    public static void main(String[] args) {
        System.out.println(checking());
    }
    
    public static boolean checking(){
        try (Scanner sc = new Scanner(System.in)) {
            String s;
            while(true){
                System.out.println("Enter a string");
                s=sc.nextLine();
                if(s.equals("karan")||s.equals("Karan")){
                    return true;
                }
            }
        }
    }
}
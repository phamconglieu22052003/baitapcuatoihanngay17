package ad;
import java.util.Scanner;
public class baitap9 
{		 public static void main(String[] args) {
        String chuoi;
        int a = 0, b = 0, c = 0;
        
        Scanner sv = new Scanner(System.in);
        
        System.out.print("Nhap chuoi: ");
        chuoi = sv.nextLine();
        
        for(int i = 0; i < chuoi.length(); i++) {
            if(chuoi.charAt(i) >= 'A' && chuoi.charAt(i) <= 'Z')
                a++;
            else if(chuoi.charAt(i) >= 'a' && chuoi.charAt(i) <= 'z')
                b++;
            else if(chuoi.charAt(i) >= '0' && chuoi.charAt(i) < '9')
                c++;
        }
        
        System.out.println("Viet hoa: " + a);
        System.out.println("Viet thuong: " + b);
        System.out.println("Chu so: " + c);
    }
    
}
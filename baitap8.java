package ad;
import java.util.Scanner;
public class baitap8 {
	public static void main(String[] args) {
	     int arr[], a, tbc = 0;
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Nhap kich co mang(n): ");
	        a = sc.nextInt();
	        
	        arr = new int[a];
	        
	        System.out.println("nhap  day so trong mang");
	        for(int i = 0; i < a; i++) {
	            System.out.printf("Số thứ %d: ", i + 1);
	            arr[i] = sc.nextInt();
	            tbc += arr[i];
	        }
	       
	        System.out.printf("Trung binh cong cua day so la: %.2f\n", 1.0 * tbc / a);
	    }
	    
	}


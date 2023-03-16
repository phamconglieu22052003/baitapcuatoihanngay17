package ad;

import java.util.Scanner;

public class baitap10 {

    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        int dem = 0;
        
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Nhap chuoi khong dau khong qua 80 ki tu: ");
            chuoi = sc.nextLine();
        }while(chuoi.length() < 1 || chuoi.length() > 80);
        
        System.out.println("So ky tu cua mot chuoi la: " + chuoi.length());
        
        System.out.print("Nhap mot ky tu bat ky muon dem: ");
        kyTu = sc.next().charAt(0);
        
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                dem++;
            }
        }
        
        System.out.println("Ky tu " + kyTu + " Xuat hien " + dem + " lan");
    }
    
}

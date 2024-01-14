import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Shop shop=new Shop();
       while (true){
           System.out.println("1- yangi product qo'shish");
           System.out.println("2-Zakaz qilish");
           System.out.println("3-OrderReports");
           int num = GetScanner.getIntScanner();
           if(num==1){
               shop.addPoduct();
           } else if (num==2) {
               shop.makeOrder();
           }else if (num==3){
               shop.report();
           }else {
               System.out.println("Siz xato son kiritdingiz!");

           }
       }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       //bt1: calculate the sum of the even numbers in an array
        int sum = 0;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);

//       bt2: count the number of words in a string
        System.out.print("Nhap chuoi: ");
        Scanner in = new Scanner(System.in);
        String chuoi = in.nextLine();
        if (chuoi == null || chuoi.trim().isEmpty()){
            System.out.println("Chuoi co 0 ki tu");
        } else {
            String[] words = chuoi.trim().split("\\s+");
            System.out.println("So tu trong chuoi: " + words.length);
        }

        //bt3: in chu cai dau cua moi tu
        System.out.print("Nhap chuoi: ");
        Scanner in2 = new Scanner(System.in);
        String chuoi2 = in2.nextLine();
        if (chuoi2 == null || chuoi2.trim().isEmpty()){
            System.out.println("Chuoi co 0 ki tu");
        }
        else{
            String[] words2 = chuoi2.trim().split("\\s+");
            System.out.println("Chu cai dau cu moi tu: ");
            for (String word : words2){
                System.out.print(word.charAt(0)+" ");
            }
            System.out.println();
        }



        //bt4: tinh thue
        double t;
        Scanner in3 = new Scanner(System.in);
        System.out.println("Vui long nhap so tien:");
        t = in3.nextDouble();

        if (t < 0){
            System.out.println("Vui long nhap dung");
        }
        else{
            if (t >= 0 && t <5 ){
                System.out.println("So thue phai tra la:" + t*0.05);
            }
            if (t >= 5 && t <10 ){
                System.out.println("So thue phai tra la:" + t*0.10);
            }
            if (t >= 10 && t <18 ){
                System.out.println("So thue phai tra la:" + t*0.15);
            }
            if (t >= 18 && t <32 ){
                System.out.println("So thue phai tra la:" + t*0.20);
            }
            if (t >= 32 && t <52 ){
                System.out.println("So thue phai tra la:" + t*0.25);
            }
            if (t >= 52 && t <80 ){
                System.out.println("So thue phai tra la:" + t*0.30);
            }
            if (t >= 80 ){
                System.out.println("So thue phai tra la:" + t*0.35);
            }

        }


    }
}
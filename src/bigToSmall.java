import java.util.Scanner;
public class bigToSmall {
    public static void main(String[] args){
        int a, b, c;

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("A sayısını giriniz: ");
        a = input.nextInt();

        System.out.print("B sayısını giriniz: ");
        b = input.nextInt();

        System.out.print("C sayısını giriniz: ");
        c = input.nextInt();

        if((a > b) && (a > c)){
            if(b > c){
                System.out.println("Sıralama: a > b > c\t" + a + "\t" + b + "\t" + c);
            }else{
                System.out.println("Sıralama: a > c > b\t" + a + "\t" + c + "\t" + b);
            }
        }else if((b > a) && (b > c)){
            if(a > c){
                System.out.println("Sıralama: b > a > c\t" + b + "\t" + a + "\t" + c);
            }else{
                System.out.println("Sırlama: b > c > a\t" + b + "\t" + c + "\t" + a);
            }
        }else if((c > a) && (c > b)){
            if(a > b){
                System.out.println("Sıralama: c > a > b\t" + c + "\t" + a + "\t" + b);
            }else{
                System.out.println("Sırlama: c > b > a\t" + c + "\t" + b + "\t" + a);
            }
        }
    }
}

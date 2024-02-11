import java.util.Scanner;
public class ticketCal {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int age,ticket;
        double km, one = 0.1, three = 0.3, five = 0.5, two = 0.2;

        System.out.print("Yaşınız Kaç: ");
        age = input.nextInt();
        System.out.print("Gideceğiniz Mesafeyi KM Cinsinden Yazınız: ");
        km = input.nextInt();
        System.out.println("1-Tek Yön\n2-Gidiş - Dönüş");
        ticket = input.nextInt();

        double a = km * 0.10;
        double b = ((a) - ((a) * five));
        double c = ((a) - ((a) * one));
        double d = ((a) - ((a) * three));

        switch(ticket){
            case 1:
                if(age < 12){
                    System.out.println("Bilet Fiyatınız: " + ((a) - ((a) * five)) + " TL");
                    System.out.println("Uygulanan İndirim Tutarı: " + ((a) * five) + " TL"); 
                }else if(age < 24){
                    System.out.println("Bilet Fiyatınız: " + ((a) - ((a) * one)) + " TL");
                    System.out.println("Uygulanan İndirim Tutarı: " + ((a) * one) + " TL");
                }else if(age < 65){
                    System.out.println("Bilet Fiyatınız: " + (a));
                }else{
                    System.out.println("Bilet Fiyatınız: " + ((a) - ((a) * three)) + " TL");
                    System.out.println("Uygulanan İndirim Tutarı: " + ((a) * three) + " TL");
                }
            break;

            case 2:
                if(age < 12){
                    System.out.println("Bilet Fiyatınız: " + ((b) - ( (b) * two)) + " TL");
                    System.out.println("Uygulanan İndirim Tutarı: " + (((a) * five) + ((b) * two)) + " TL"); 
                }else if(age < 24){
                    System.out.println("Bilet Fiyatınız: " + ((c) - ((c) * two)) + " TL");
                    System.out.println("Uygulanan İndirim Tutarı: " + (((a) * one) + ((c) + two)) + " TL");
                }else if(age < 65){
                    System.out.println("Bilet Fiyatınız: " + ((a) - ( (a) * two)));
                    System.out.println("Uygulanan İndirim Tutarı: " + ((a) * two) + " TL");
                }else{
                    System.out.println("Bilet Fiyatınız: " + ((d) - ((d) * two)) + " TL");
                    System.out.println("Uygulanan İndirim Tutarı: " + (((a) * three) + ((d) * two)) + " TL");
                }
            break;

            default:
                System.out.println("Hatalı Veri Girdiniz!");
            break;
        }
    }
}

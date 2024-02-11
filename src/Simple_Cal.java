import java.util.Scanner;
public class Simple_Cal {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("İşlem için 'A' değerini giriniz: ");
        a = input.nextInt();

        System.out.print("İşlem için 'B' değerini giriniz: ");
        b = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapılacak İşlemi Seçiniz: ");
        c = input.nextInt();
/* 
        if(c == 1){
            System.out.println("Toplama işleminizin sonucu: " + (a + b));
        }else if(c == 2){
            System.out.println("Çıkarma işleminizin sonucu: " + (a - b));
        }else if(c == 3){
            System.out.println("Çarpma işleminizin sonucu: " + (a * b));
        }else if(c == 4){
            System.out.println("Bölme işleminizin sonucu: " + (a / b));
        }else{
            System.out.println("Lütfen 1 ila 4 arasında seçim yapınız!");
        }
*/      

        switch(c){
            case 1:
                System.out.println("Toplama işleminizin sonucu: " + (a + b));
                break;
            
            case 2:
                System.out.println("Çıkarma işleminizin sonucu: " + (a - b));
                break;
            
            case 3:
                System.out.println("Çarpma işleminizin sonucu: " + (a * b));
                break;
            
            case 4:
                System.out.println("Bölme işleminizin sonucu: " + (a / b));
                break;
            
            default:
                System.out.println("Lütfen 1 ila 4 arasında seçim yapınız!");
                break;            
        }
    }
}

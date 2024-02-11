import java.util.Scanner;
public class suggestActivity {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        int derece;

        System.out.print("Hava Kaç Derece: ");
        derece = input.nextInt();

        if(derece < 5){
            System.out.println("Hava 'KAYAK' aktivitesi için uygun.");
        }else if(derece <= 25){
            if(derece <= 15){
                System.out.println("Hava 'SİNEMA' aktivitesi için uygun.");
            }
            if(derece >= 10){
                System.out.println("Hava 'PİKNİK' aktivitesi için uygun..");
            }
        }else {
            System.out.println("Hava 'YÜZME' aktivitesi için uygun.");
        }
    }
}

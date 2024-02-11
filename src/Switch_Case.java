import java.util.Scanner;
public class Switch_Case {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int day;

        System.out.print("1 ila 7 Arasında Rakam Giriniz: ");
        day = input.nextInt();
/*
        if(day == 1){
            System.out.println("Bugün Pazartesi");
        }else if(day == 2){
            System.out.println("Bugün Salı");
        }else if(day == 3){
            System.out.println("Bugün Çarşamba");
        }else if(day == 4){
            System.out.println("Bugün Perşembe");
        }else if(day == 5){
            System.out.println("Bugün Cuma");
        }else if(day == 6){
            System.out.println("Bugün Cumartesi");
        }else if(day == 7){
            System.out.println("Bugün Pazar");
        }else{
            System.out.println("1 ila 7 Arasında Bir Rakam Giriniz!");
        }
*/      

        switch(day){
            case 1:
                System.out.println("Bugün Pazartesi");
                break;

            case 2:
                System.out.println("Bugün Salı");
                break;

            case 3:
                System.out.println("Bugün Çarşamba");
                break;

            case 4:
                System.out.println("Bugün Perşembe");
                break;

            case 5:
                System.out.println("Bugün Cuma");
                break;

            case 6:
                System.out.println("Bugün Cumartesi");
                break;

            case 7:
                System.out.println("Bugün Pazar");
                break;

            default:
                System.out.println("1 ila 7 Arasında Bir Rakam Giriniz!");
                break;

        }

    }
}

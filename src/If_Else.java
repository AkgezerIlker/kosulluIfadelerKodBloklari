public class If_Else{

    public static void main(String[] arg){

        int a = 10, b = 20, c = 30;
        boolean compare = a == b;
/*
        String str = compare ? "Eşit" : "Eşit Değil";

        System.out.println(str);
*/

        if(compare){
            System.out.println("Eşittir.");
        } else if (a > b){
            System.out.println("A Büyüktür B");
        }else {
            System.out.println("B Büyüktür A");
        }

        if (c > b && c > a){
            System.out.println("C en büyük değere sahiptir: " + c);
        }else if (b < c && a > b){
            System.out.println("B değeri C den küçük, A dan büyüktür: " + b);
        }else{
            System.out.println("A en küçük değerdir.");
        }

    }

}
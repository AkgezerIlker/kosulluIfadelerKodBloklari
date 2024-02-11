import java.util.Scanner;
public class PassTheGrade {

    @SuppressWarnings("resource")
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int mat, kim, turk, fiz, muzik, avgLessonCount = 5, LessonCount = 0;


        System.out.print("Matematik Ders Notunuzu Giriniz: ");
        mat = input.nextInt();
        if(mat < 0 || mat > 100){
            mat = 0;
            LessonCount++;
        }

        System.out.print("Kimya Ders Notunuzu Giriniz: ");
        kim = input.nextInt();
        if(kim < 0 || kim > 100){
            kim = 0;
            LessonCount++;
        }

        System.out.print("Türkçe Ders Notunuzu Giriniz: ");
        turk = input.nextInt();
        if(turk < 0 || turk > 100){
            turk = 0;
            LessonCount++;
        }

        System.out.print("Fizik Ders Notunuzu Giriniz: ");
        fiz = input.nextInt();
        if(fiz < 0 || fiz > 100){
            fiz = 0;
            LessonCount++;
        }

        System.out.print("Müzik Ders Notunuzu Giriniz: ");
        muzik = input.nextInt();
        if(muzik < 0 || muzik > 100){
            muzik = 0;
            LessonCount++;
        }

        double avg = ((mat + kim + turk + fiz + muzik) / avgLessonCount);

        if(avg <= 54 ){
            System.out.println("Sınıfta Kaldınız!");
        }else if(avg >= 55){
            System.out.println("Sınıfı Geçtiniz.");
        }

        System.out.println("Not Ortalamanız: " + avg + (avgLessonCount - LessonCount));

    }
}

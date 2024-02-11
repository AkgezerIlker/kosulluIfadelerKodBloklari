import java.util.Scanner;
public class User_Input {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String id, pswrd, pswrd2, pswrd3, a;

        System.out.print("ID Giriniz: ");
        id = input.nextLine();
        System.out.print("Şifre Giriniz: ");
        pswrd = input.nextLine();

        if((id.equals("ilker")) && (pswrd.equals("1234"))){
            System.out.println("Giriş İşlemi Başarılı!");
        }else{
            System.out.println("Giriş Başarısız!");
            System.out.println("1-Tekrar Dene\n2-Yeni Şifre Belirle\n3-Çıkış Yap");
            a = input.nextLine();

            switch(a){
                case "1":
                    System.out.print("ID Giriniz: ");
                    id = input.nextLine();
                    System.out.print("Şifre Giriniz: ");
                    pswrd = input.nextLine();

                    if((id.equals("ilker")) && (pswrd.equals("1234"))){
                        System.out.println("Giriş İşlemi Başarılı!");
                    }else{
                        System.out.println("İşlem Sonlandırıldı Başa Dönünüz!");
                    }
                break;

                case "2":
                    System.out.print("Yeni Şifre Giriniz: ");
                    pswrd2 = input.nextLine();
                    System.out.print("Yeni Şifreyi Tekrar Giriniz: ");
                    pswrd3 = input.nextLine();

                    
                    System.out.println("Yeni Şifreniz Belirlendi, Giriş için Aşağıdaki Bilgileri Doldurunuz: ");
                    System.out.print("ID Giriniz: ");
                    id = input.nextLine();
                    System.out.print("Şifre Giriniz: ");
                    pswrd2 = input.nextLine();

                        if((id.equals("ilker")) && (pswrd2.equals(pswrd3))){
                            System.out.println("Giriş İşlemi Başarılı!");
                        }else if(pswrd2 != pswrd3){
                            System.out.println("Şifre Eşleşmedi!");
                            
                            System.out.println("Tekrardan Denemek için: ");
                            System.out.print("ID Giriniz: ");
                            id = input.nextLine();
                            System.out.print("Şifre Giriniz: ");
                            pswrd2 = input.nextLine();
                            
                            String t = (pswrd2.equals(pswrd3) ) ? "Giriş Başarılı Şekilde Yapılmıştır." : "Giriş Başarısız";
                            System.out.println(t);
                            
                        }
                                         
                break;

                case "3":
                    System.out.println("Çıkış Yapıldı!");
                break;
            }
        }


    }
}

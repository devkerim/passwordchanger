import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner strscanner = new Scanner(System.in);
    Scanner intscanner = new Scanner(System.in);

    int select=0;
	String username1,username = "123";
	String password1,password = "123";


	System.out.print("Kullanıcı Adı:");
	username1 = strscanner.next();
	System.out.print("Şifre:");
	password1 = strscanner.next();

	if(username.equals(username1) && password1.equals(password)){
	    System.out.println("Giriş Yapıldı.");

    }else{
	    System.out.println("Parola ya da kullanıcı adınız hatalı.");
	    System.out.println("Değiştirmek için seçim yapınız: ");
	    System.out.println("1-Kullanıcı adı değiştir\n2-Parola Değiştir\n3-İptal");
	    select = intscanner.nextInt();
        switch(select){
            case 1:System.out.println("Yeni Kullanıcı adını giriniz: ");
                username = strscanner.next();
                if(username1.equals(username)){System.out.println("Lütfen farklı bir kullanıcı adı tercih ediniz.");}
                else{System.out.println("Kullanıcı Adınız başarıyla değiştirilmiştir");}
                break;
            case 2: System.out.println("Yeni parolayı giriniz: ");
                password1 = strscanner.next();
                if(password1.equals(password)){System.out.println("Lütfen farklı bir parola tercih ediniz.");}
                else{System.out.println("Parolanız başarıyla değiştirilmiştir");}
                break;
            case 3:System.out.println("Giriş işlemi iptal edilmiştir.");
                break;
            default:System.out.println("Geçersiz bir işlem yaptınız.");
    }



    }




    }
}

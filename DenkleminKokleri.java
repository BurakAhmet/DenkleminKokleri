import java.util.Scanner;
public class DenkleminKokleri {
	public static void main(String[] args) {
		double a, b, c, delta, kok1, kok2; 
		  Scanner input = new Scanner(System.in);
		  System.out.print("x^2'li terimin katsayısı: ");
		  while (!input.hasNextDouble())
		  {
			  System.out.println("Lütfen Bir Gerçek Sayı Giriniz");
			  input.next();
		  }
		  a = input.nextDouble();
		  System.out.print("x'li terimin katsayısı: "); 
		  while (!input.hasNextDouble()) 
		  {
			  System.out.println("Lütfen Bir Gerçek Sayı Giriniz");
			  input.next();
		  }
		  b = input.nextDouble();
		  System.out.print("Sabit terim: "); 
		  while (!input.hasNextDouble())
		  {
			  System.out.println("Lütfen Bir Gerçek Sayı Giriniz");
			  input.next();
		  }
		  c = input.nextDouble(); 
		  delta = Math.pow(b, 2)-(4*a*c);  
		  if (delta>0) 
		  {
			  kok1 = (-b+Math.sqrt(delta))/(2*a); 
			  kok2 =(-b-Math.sqrt(delta))/(2*a);
			  System.out.printf("Denklemin Farklı 2 Kökü Vardır Bunlar %1.2f ve %1.2f'dir.",kok1,kok2); } 
		  else if (delta==0) 
		  {
			  kok1 = (-b+Math.sqrt(delta))/(2*a);
			  System.out.printf("Denklemin Kökleri Çakışıktır Ve %1.2f'tir",kok1); 
		  } 
		  else if (delta<0) 
		  {
			  System.out.println("Bu Denklemin Gerçek Bir Kökü Bulunmamaktadır!"); 
		  }
		  input.close();
	}
}
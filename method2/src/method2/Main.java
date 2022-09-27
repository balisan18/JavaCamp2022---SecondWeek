package method2;

public class Main {

	public static void main(String[] args) {
		String mesaj =	"Bugün hava çok güzeldi.";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayi =topla(5,7);
		System.out.println(sayi);
		int toplam =topla2(2,3,4,5,6); //oluşturulan integer dizi sayesinde buraya istediğin sayıda değer girebilirsin.
		System.out.println(toplam);

	}

	public static void ekle() {  //void geri değer döndürmez.
		System.out.println("Eklendi");

	}

	public static void sil() {
		System.out.println("Silindi");

	}
 
	public static void guncelle() {
		System.out.println("Güncellendi");

	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;   //geri değer döndürür.
	}
	public static int topla2(int... sayilar) {  //bir integer dizisi oluşturur istediğin kadar değer girebilirsin.
		int toplam =0;
		for (int sayi : sayilar) {        //sayilar integer dizisindeki sayiyi dolaşır ve her birini toplama ekler.
			toplam+=sayi;
			
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}
	
	

}


import java.util.Scanner;

public class ParkirMall {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int biayaParkir, tarifJamPertama, tarifPerjam, maksimalTarif, lamaParkir = 0, kategoriKendaraan = 0;
		int minLamaParkir = 1;
		int maksLamaParkir = 24;
		String jenisMember = "";
		String result = "";
		
		//ketentuan tambahan: Jika parkir lebih dari 8 jam dapat potongan 5000
		//tarif jam pertama itu tergantung member, jika member maka mendapat potongan (Gold 100%, silver 50%)
		
		//Deklarasi data
		int[] listTarifParkirJamPertama = {5000, 2000, 10000, 25000, 1000, 10000};
		int[] listTarifPerJam = {2000, 1000, 5000, 5000, 500, 3000};
		int[] listMaksimalTarif = {25000, 10000, 50000, 75000, 5000, 40000};
		
		//Input User
		kategoriKendaraan = Integer.valueOf(input.nextLine());
		lamaParkir = Integer.valueOf(input.nextLine());
		jenisMember = input.nextLine();
				
		//Validasi input lama Parkir
		if (lamaParkir >= minLamaParkir && lamaParkir <= maksLamaParkir) {
			//Menentukan Tarif Jam Pertama (done)
			
			tarifJamPertama = getTarifJamPertamaWithMember(kategoriKendaraan, listTarifParkirJamPertama, jenisMember);
			//Menentukan Tarif Per Jam
			
			tarifPerjam = getTarifPerJam(kategoriKendaraan, listTarifPerJam);
						
			//Menentukan Maksimal Tarif
			
			maksimalTarif = getTarifMaksimal(kategoriKendaraan, listMaksimalTarif);
						
			//Hitung biaya Parkir
			biayaParkir = hitungTarifParkir(lamaParkir, tarifJamPertama, tarifPerjam, maksimalTarif);
				
			result = String.valueOf(biayaParkir);
		}else {
			result = "Input Error!!!";
		}
		
		System.out.println(result);
	}
	
	
	public static int getTarifJamPertama(int kategoriKendaraan, int[] listTarifParkirJamPertama) {
		int result = 0;
		
		result = (listTarifParkirJamPertama[kategoriKendaraan-1]);
	
		return result;
	}
	
	public static int getTarifJamPertamaWithMember(int kategoriKendaraan, int[] listTarifParkirJamPertama, String jenisMember) {
		int jamPertama = 0;
		
		jamPertama = ((listTarifParkirJamPertama[kategoriKendaraan-1]) - ((listTarifParkirJamPertama[kategoriKendaraan-1]) * getPersentasePotonganTarifJamPertama(jenisMember) )/100);
		
		return jamPertama;
	}
	
	public static int getPersentasePotonganTarifJamPertama(String jenisMember) {
		int result = 0;
		if (jenisMember.equalsIgnoreCase("Gold")) {
			result = 100;
		}else if (jenisMember.equalsIgnoreCase("Silver")) {
			result = 50;
		}
		
		return result;
	}
	
	public static int getTarifPerJam(int kategoriKendaraan, int[] listTarifPerjam) {
		int result = 0;

		result = listTarifPerjam[kategoriKendaraan-1];		
		
		return result;
	}
	
	public static int getTarifMaksimal(int kategoriKendaraan, int[] listTarifMaksimal) {
		int result = 0;

		result = listTarifMaksimal[kategoriKendaraan-1];		
		
		return result;
	}
	
	public static int hitungTarifParkir(int lamaParkir, int tarifJamPertama, int tarifPerjam, int maksimalTarif) {
		int result = 0;
		int diskon = hitungDiskon(lamaParkir);
		
		result = (tarifJamPertama + ((lamaParkir -1) * tarifPerjam)) - diskon;
		
		if (result > maksimalTarif) {
			result = maksimalTarif;
		}
		
		return result;
	}
	
	public static int hitungDiskon(int lamaParkir) {
		int result = 0;
		int ketentuanDiskon = 8;
		if (lamaParkir > ketentuanDiskon) {
			result = 5000;
		}
		
		return result;
	}
}

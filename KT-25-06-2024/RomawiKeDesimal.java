import java.util.*;

public class RomawiKeDesimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roman = scanner.nextLine();
        scanner.close();
        
        int result = romanToInteger(roman);
        
        System.out.println(result);
    }
    
    public static int romanToInteger(String s) {
        // Inisialisasi map untuk konversi nilai Romawi ke desimal
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);
        
        int total = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanToInt.get(s.charAt(i));
            
            // Cek apakah karakter saat ini lebih kecil dari karakter berikutnya
            if (i < s.length() - 1 && romanToInt.get(s.charAt(i)) < romanToInt.get(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }
        
        return total;
    }
}

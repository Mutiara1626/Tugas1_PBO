public class soal4 {
    public static void main(String[] args) {
        String nama = "Mutiara Sabrina R";

        // Replace (mengganti huruf 'a' menjadi '0')
        String kondisi1 = nama.replace('a', '0');
        System.out.println("Replace (nama -> a ≈ 0): " + kondisi1);

        // Mengubah seluruh string menjadi 'a'
        String kondisi2 = nama.replaceAll(".", "a");
        System.out.println("Replace All (nama -> a): " + kondisi2);

        // Lowercase
        String kondisi3 = nama.toLowerCase();
        System.out.println("Lower (string nama): " + kondisi3);

        // Uppercase
        String kondisi4 = nama.toUpperCase();
        System.out.println("Upper (string nama): " + kondisi4);
    }
}

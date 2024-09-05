public class soal5 {
    public static void main(String[] args) {
        boolean A = true;
        boolean B = false;

        // OR
        boolean hasilOR = A || B;
        System.out.println("A OR B = " + hasilOR);

        // XOR
        boolean hasilXOR = A ^ B;
        System.out.println("A XOR B = " + hasilXOR);

        // NOT
        boolean hasilNOTA = !A;
        boolean hasilNOTB = !B;
        System.out.println("NOT A = " + hasilNOTA);
        System.out.println("NOT B = " + hasilNOTB);
    }
}

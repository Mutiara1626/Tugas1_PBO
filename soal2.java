public class soal2 {
    
    public static void main(String[] args) {
        kondisi1();
        kondisi2();
    }

    public static void kondisi1() {
        int[][] duaD = new int[2][3]; // Array 2x3
        int k = 1;

        System.out.println("Kondisi 1: Tanpa k++");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                duaD[i][j] = k * 10;
                System.out.print(duaD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void kondisi2() {
        int[][] duaD = new int[3][3];
        int k = 1;

        System.out.println("Kondisi 2: Ukuran 3x3 dengan k++");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                duaD[i][j] = k * 10;
                System.out.print(duaD[i][j] + " ");
                k++;
            }
            System.out.println();
        }
        System.out.println();
    }
}

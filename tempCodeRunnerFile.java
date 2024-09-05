class soal1 {
    public static void main(String[] args) {
        int[] jumlahHari;

        jumlahHari = new int[12];

        jumlahHari[0] = 31;  
        jumlahHari[1] = 28; 
        jumlahHari[2] = 31;  
        jumlahHari[3] = 30;  
        jumlahHari[4] = 31; 
        jumlahHari[5] = 30;  
        jumlahHari[6] = 31; 

        String[] hariDalamSeminggu = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        int hariKe4 = 4; 

        System.out.println("Hari ke-4 adalah: " + hariDalamSeminggu[hariKe4]);
    }
}

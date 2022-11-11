import java.util.Scanner;
public class CalculatorSimple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;


        while (running) {
            System.out.println("=====================================");
            System.out.println("Kalkulator Penghitung Luas dan Volume");
            System.out.println("=====================================");

            System.out.println("========Menu=========");
            System.out.println("1. Hitung Luas Bidang");
            System.out.println("2. Hitung Volume");
            System.out.println("0. Tutup Aplikasi");
            System.out.print("Masukkan Pilihan Anda: ");
            int choose = input.nextInt();

            if(choose == 0){
                running = false;
            }
            else if (choose == 1){
                hitungBangun();
            }
            else if (choose == 2)
            {
                hitungRuang();
            }
            else {
                System.out.println("Pilihan Yang Anda Masukkan Salah!");
            }
        }


    }
    private static void hitungBangun(){
        boolean running1 = true;
        Scanner input = new Scanner(System.in);
        while (running1){
            System.out.println("================================");
            System.out.println("Pilih Bidang Yang Akan Di Hitung");
            System.out.println("================================");
            System.out.println("1.Persegi");
            System.out.println("2.Lingkaran");
            System.out.println("3.Segitiga");
            System.out.println("4.Persegi Panjang");
            System.out.println("5.Kembali ke menu sebelumnya");
            System.out.print("Masukkan pilihan anda : ");
            int pilihan1 = input.nextInt();
            switch (pilihan1){
                case 1:
                    System.out.println("Anda memilih persegi");
                    luas_persegi();
                    break;
                case 2:
                    System.out.println("Anda Memilih lingkaran");
                    luas_lingkaran();
                    break;
                case 3:
                    System.out.println("Anda Memilih Segitiga");
                    luas_segitiga();
                    break;
                case 4:
                    System.out.println("Anda Memilih Persegi Panjang");
                    luas_persegi_panjang();
                    break;
                case 5:
                    running1 = false;
                default:
                    System.out.println("Pilihan yang anda masukkan salah!");
            }
        }
        }


    private static void hitungRuang(){
        boolean running2 = true;
        Scanner input = new Scanner(System.in);
        while (running2){
            System.out.println("================================");
            System.out.println("Pilih Ruang Yang Akan Di Hitung");
            System.out.println("================================");
            System.out.println("1.Kubus");
            System.out.println("2.Balok");
            System.out.println("3.Tabung");
            System.out.println("4.Kembali Ke menu sebelumnya");
            System.out.print("Masukkan pilihan anda : ");
            int pilihan2 = input.nextInt();
            switch (pilihan2){
                case 1:
                    System.out.println("Anda memilih kubus");
                    volume_kubus();
                    break;
                case 2:
                    System.out.println("Anda Memilih balok");
                    volume_balok();
                    break;
                case 3:
                    System.out.println("Anda Memilih tabung");
                    volume_tabung();
                    break;
                case 4:
                    running2 = false;
                default:
                    System.out.println("Pilihan yang anda masukkan salah!");
            }
        }
        }


    private static void luas_persegi() {
        Scanner input = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Menghitung luas persegi");
        System.out.println("============================");
        System.out.print("Masukkan sisi persegi : ");

        int sisi;
        sisi = input.nextInt();
        int luas = sisi*sisi;

        System.out.println("Sisi persegi = "+ sisi +" cm");
        System.out.println("============================");
        System.out.println("Luas persegi = "+ luas + " cm");
        System.out.println("============================");
    }

    private static void luas_persegi_panjang(){
        Scanner input = new Scanner(System.in);
        int panjang, lebar;
        int luas;
        System.out.println("============================");
        System.out.println("Menghitung luas persegi panjang");
        System.out.println("============================");

        System.out.print("Masukkan panjang : ");
        panjang = input.nextInt();

        System.out.print("Masukkan lebar : ");
        lebar = input.nextInt();
        luas = panjang * lebar;

        System.out.println("panjang = "+ panjang +" cm");
        System.out.println("lebar = "+ lebar +" cm");
        System.out.println("============================");
        System.out.println("Luas persegi panjang= "+ luas + " cm");
        System.out.println("============================");
    }

    private static void luas_segitiga(){
        Scanner input = new Scanner(System.in);
        int alas, tinggiSegitiga;
        double luas;
        System.out.println("============================");
        System.out.println("Menghitung luas Lingkaran");
        System.out.println("============================");

        System.out.print("Masukkan alas : ");
        alas = input.nextInt();

        System.out.print("Masukkan tinggi : ");
        tinggiSegitiga = input.nextInt();
        luas = alas * tinggiSegitiga *0.5;

        System.out.println("alas = "+ alas +" cm");
        System.out.println("tinggi = "+ tinggiSegitiga +" cm");
        System.out.println("============================");
        System.out.println("Luas segitiga= "+ luas + " cm");
        System.out.println("============================");
    }

    private static void luas_lingkaran(){
        Scanner input = new Scanner(System.in);
        float radius;
        double luas;
        System.out.println("============================");
        System.out.println("Menghitung luas Lingkaran");
        System.out.println("============================");

        System.out.print("Masukkan radius : ");
        radius = input.nextInt();

        luas = 3.14 * radius * radius;

        System.out.println("radius = "+ radius +" cm");
        System.out.println("============================");
        System.out.println("Luas Lingkaran= "+ luas + " cm");
        System.out.println("============================");
    }

    private static void volume_kubus(){
        Scanner input = new Scanner(System.in);
        int rusuk;
        double volume;
        System.out.println("============================");
        System.out.println("Menghitung volume kubus");
        System.out.println("============================");

        System.out.print("Masukkan rusuk : ");
        rusuk = input.nextInt();

        volume = rusuk * rusuk * rusuk;

        System.out.println("rusuk = "+ rusuk +" cm");
        System.out.println("============================");
        System.out.println("volume kubus= "+ volume + " cm");
        System.out.println("============================");
    }

    private static void volume_balok(){
        Scanner input = new Scanner(System.in);
        int panjang1,tinggi1,lebar1;
        double volume;
        System.out.println("============================");
        System.out.println("Menghitung volume balok");
        System.out.println("============================");

        System.out.print("Masukkan panjang : ");
        panjang1 = input.nextInt();

        System.out.print("Masukkan lebar : ");
        lebar1 = input.nextInt();

        System.out.print("Masukkan tinggi : ");
        tinggi1 = input.nextInt();

        volume = panjang1 * lebar1 * tinggi1;

        System.out.println("panjang = "+ panjang1 +" cm");
        System.out.println("lebar = "+ lebar1 +" cm");
        System.out.println("tinggi = "+ tinggi1 +" cm");
        System.out.println("============================");
        System.out.println("volume kubus= "+ volume + " cm");
        System.out.println("============================");
    }

    private static void volume_tabung(){
        Scanner input = new Scanner(System.in);
        int tinggi2,radius1;
        double volume;
        System.out.println("============================");
        System.out.println("Menghitung volume tabung");
        System.out.println("============================");

        System.out.print("Masukkan tinggi : ");
        tinggi2 = input.nextInt();

        System.out.print("Masukkan radius : ");
        radius1 = input.nextInt();

        volume = 3.14 * tinggi2 * radius1 * radius1 * radius1;

        System.out.println("tinggi = "+ tinggi2 +" cm");
        System.out.println("radius = "+ radius1 +" cm");
        System.out.println("============================");
        System.out.println("volume tabung= "+ volume + " cm");
        System.out.println("============================");
    }

}
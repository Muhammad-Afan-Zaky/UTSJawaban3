 rt java.util.Scanner;

public class UTSJawaban3{
    public static void main(String[] args) {
        String[] infoplat = []{"K-Kudus","B-Jakarta","AB-Jogja","T-Karawang","AD-Solo"};
        int jumlahplatmobile = 5;
        int totaljumlahmobile=55;
        String[] Kudus = new String[9];
        String[] Jakarta = new String[10];
        String[] Jogja = new String[11];
        String[] Karawang = new String[12];
        String[] Solo = new String[13];

        int totalkudus =0;
        int sisamobile =0;
        for (int i=0;i<Kudus.length;i++) {
            if (Kudus[1] !=null)
                totalkudus++;
        }
        int totaljakarta =0;
        for (int i=0;Jakarta.length;i++){
            if (Jakarta[i] !=null)
                totaljakarta++;
        }
        int totaljogja =0;
        for(int i=0;i<Jogja.length;i++){
            if (Jogja[i] != null)
                totaljogja++;
        }
        int totalkarawang =0;
        for(int i=0;i<Karawang.length;i++){
            if (Karawang[i] !=null)
                totalkarawang++;
        }
        int totalsolo = 0;
        for (int i=0;i<Solo.length;i++) {
            if (Solo[i] != null)
                totalsolo++;
        }
        sisamobile= totaljumlahmobile-totalkudus-totaljogja-totaljakarta-totalkarawang-totalsolo:
        System.out.println(" Total plat mobil Kudus:"+ totalkudus+"|Total plat mobil Jakarta:"+ totaljakarta
                +"|Total plat mobil Jogja" +totaljogja+"|Total plat mobil Karawang : " +totalkarawang+"|Total plat mobil Karawang" + "" +
                System.out.println(" Jumlah seluruh mobil totaljumlahmobile +"|Total sisa mobile "+ sisamobile)" +
                        System.out.println();
        Scanner aku = new Scanner(System.in);
        System.out.println(" Masukan plat nomor kendaraan");
        System.out.println(" Masukan kode lokasi ");
        String lokasi = aku.nextLine();
        int nomor = aku.nextInt();
        switch (lokasi) {
            case "K":
                System.out.println(" plat nomor Kudus ");
                break;
            case "B":
                System.out.println("plat nomor Jakarta ");
                break;
            case "AB":
                System.out.println("plat nomor Jogja ");
                break;
            case "T":
                System.out.println("plat nomor Karawang ");
                break;
            case "AD":
                System.out.println("plat nomor Solo");
                break;
            default:
                System.out.println(" plat kendaraan yang anda masukan salah ");
        }
        if (nomor % 2 == 0) {
            System.out.println(" Nomor plat termasuk plat genap ");
        } else {
            System.out.println(" Nomor plat termasuk plat ganjil ");
        }
    }
}
}

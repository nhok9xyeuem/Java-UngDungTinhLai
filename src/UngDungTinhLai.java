import java.util.Scanner;

public class UngDungTinhLai {
    public static void main(String[] args) {
        int tiengui , thanggui,laisuat;
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap So Tien Gui");
        tiengui=input.nextInt();
        System.out.println("Nhap so Thang Gui ");
        thanggui=input.nextInt();
        System.out.println("Nhap Ty Le Lai Suat 'Theo thang ' ");
        laisuat=input.nextInt();
        while (tiengui<0 || thanggui<0 || laisuat<0 ){
            System.out.println("Nhap So Tien Gui");
            tiengui=input.nextInt();
            System.out.println("Nhap so Thang Gui ");
            thanggui=input.nextInt();
            System.out.println("Nhap Ty Le Lai Suat 'Theo thang ' ");
        }
        System.out.printf("%d Lai Suat Theo Thang Cua Ban La :",TinhLai(tiengui,thanggui,laisuat));

    }

    private static int TinhLai(int tiengui,int thanggui, int laisuat) {
        int tienlai;
        tienlai = (tiengui * thanggui * laisuat) / 100;
        return tienlai;

    }
}

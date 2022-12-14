
package surveipenduduk;

import java.util.Scanner;

public class Surveipenduduk {

    public static void main(String[] args) {
        int umur,pendapatan,beban,hasil;
        String status,pendidikan;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan umur anda");
        umur = input.nextInt();
        if (umur > 0 && umur > 18)
        {
            System.out.println("Apakah anda bekerja atau tidak?? ");
            status = input.next();
                if ("ya".equalsIgnoreCase(status))
                {
                System.out.println("Berapa Jumlah Pendapatan Anda");
                pendapatan = input.nextInt();
                System.out.println("Berapa jumlah tanggungan anda");
                beban = input.nextInt();
                hasil = pendapatan / beban;
                
                    if (hasil > 0 && hasil < 300000)
                    {
                        System.out.println("maaf anda termasuk kaum misqueen");
                    }
                    else
                    {
                        System.out.println("Anda termasuk golongan kaum tidak Misqueen ");
                    } 
                }
                else if ("tidak".equalsIgnoreCase(status))
                {
                    System.out.println("maaf anda termasuk kaum misqueen");
                }
                else 
                {
                    System.out.println("Maaf inputan Anda Salah");
                }
        }
        else if (umur > 0 && umur < 18)
        {
            System.out.println("Apakah Masih sekolah?? ");
            pendidikan = input.next();
            
            if ("ya".equalsIgnoreCase(pendidikan))
            {
                System.out.println("Anda termasuk golongan kaum tidak Misqueen");
            }
            else if ("tidak".equalsIgnoreCase(pendidikan))
            {
                System.out.println("maaf anda termasuk kaum misqueen");
            }
        }
        else 
        {
            System.out.println("Maaf inputan Anda Salah");
        }
    }
    
}

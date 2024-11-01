/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmlogic;

/**
 *
 * @author les
 */
public class BMLogic {
    double berat;
    double tinggi;
    double hasil;
    
public BMLogic (double berat, double tinggi){
    this.berat = berat;
    this.tinggi = tinggi;
    this.hasil = hasil; 
}

public void berats (){
    System.out.println("Masukkan berat badan anda (Kg): "+berat);
    System.out.println("Masukkan tinggi badan anda (M): "+tinggi);
}

public void hasil(){
    hasil = berat/(tinggi*tinggi);
       System.out.println("Hasil BMI anda adalah "+ hasil);
        if (hasil<18.5){
           System.out.println("Termasuk kategori KEKURANGAN BERAT BADAN");
        }else if (hasil >= 18.5 && hasil < 24.9){
       System.out.println("Termasuk kategori NORMAL");
        }else if (hasil >=25 && hasil < 29.0){
            System.out.println("Termasuk ketegori KELEBIHAN BERAT BADAN");
        }else if(hasil> 30.0){
            System.out.println("Obesitas kaks");
        }
        } 
}





package belajar.oop.bangun.ruang;


public class Balok extends BangunRuang {
      float p;
      float l;
      float t;
      
      @Override
    float luas(){
        float luas = 2 * p * l + 2 * p * t + 2 * l * t;
        System.out.println("Luas Balok = "+luas);
        return luas;
    }
    
    @Override
    float volume(){
        float volume = p * l * t;
        System.out.println("Volume Balok = "+volume);
        return volume;
    }
}

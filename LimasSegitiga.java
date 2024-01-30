
package belajar.oop.bangun.ruang;


public class LimasSegitiga extends BangunRuang{
    float a;
    float tS;
    float T;
    float tL;
    
    @Override
    float luas(){
        float luas = (1/2 * a * tS) + (3 * 1/2 * a * T);
        System.out.println("Luas Limas Segitiga: "+luas);
        return luas;
    }
    
    @Override
    float volume(){
        float volume = 1/6 * a * tS * tL;
        System.out.println("Volume Limas Segitiga: "+volume);
        return volume;
    }
    
}


package belajar.oop.bangun.ruang;


public class Bola extends BangunRuang{
    float r;
    
    @Override
    float luas(){
        float luas = 4 * (float) Math.PI * r * r ;
        System.out.println("Luas Bola: "+luas);
        return luas;
    }
    
    @Override
    float volume(){
        float volume = 4/3 * (float) Math.PI * r * r * r;
        System.out.println("Volume Bola: "+volume);
        return volume;
    }
    
}


package belajar.oop.bangun.ruang;


public class Tabung extends BangunRuang{
    float r;
    float t;
    
    @Override
    float luas(){
        float luas = (float) Math.PI * r * r * 2 + 2 * (float) Math.PI * r * t;
        System.out.println("Luas Tabung: "+luas);
        return luas;
    }
    
    @Override
    float volume(){
        float volume = (float) Math.PI * r * t;
        System.out.println("Volume Tabung: "+volume);
        return volume;
    }
    
}

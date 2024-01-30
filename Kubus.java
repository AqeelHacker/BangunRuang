
package belajar.oop.bangun.ruang;


public class Kubus extends BangunRuang {
    float s;
    
    @Override
    float luas(){
        float luas = 6 * s * s;
        System.out.println("Luas Kubus = "+luas);
        return luas;
    }
    
    @Override
    float volume(){
        float volume = s * s * s;
        System.out.println("Volume Kubus = "+volume);
        return volume;
    }
    
}

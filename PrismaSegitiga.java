
package belajar.oop.bangun.ruang;


public class PrismaSegitiga  extends BangunRuang {
    float p;
    float l;
    float a;
    float t;
    float T;
    
    @Override
    float luas(){
        float luas = (p * l) + (p * l) + (p * l) + 1/2 * (a * t);
        System.out.println("Luas Prisma Segitiga: "+luas);
        return luas;
    }
    
    @Override
    float volume(){
        float volume = 1/2 * (a * t) * T;
        System.out.println("Volume Prisma Segitiga: "+volume);
        return volume;
    }
    
}

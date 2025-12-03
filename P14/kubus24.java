package P14;

public class kubus24 {
    static int volumeKubus(int sisi){
        int Volume=sisi*sisi*sisi;
        return Volume;
    }

    static int permukaanKubus(int sisi){
     int permukaan=6*sisi*sisi;
     return permukaan;
    } 
    public static void main(String[] args) {
        int s=5;
        System.out.println("volume kubus: "+volumeKubus(s));
        System.out.println("Luas permukaan kubus: "+permukaanKubus(s));
    }
}

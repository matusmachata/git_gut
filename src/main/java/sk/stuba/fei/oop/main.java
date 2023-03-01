package sk.stuba.fei.oop;
import sk.stuba.fei.oop.KeyboardInput;

public class main {

    public static void main(String[] args) {
        int den;
        int mesiac = 1;
        int znamenie;
        while (mesiac >= 1 && mesiac <= 12){
            den = KeyboardInput.readInt("enter birth day", 2);
        mesiac = KeyboardInput.readInt("enter birth month");
        System.out.println(den + mesiac);
        znamenie = method(mesiac, den);

        switch (znamenie) {
            case 1:
                System.out.println("your sign is : Aries");
                break;
            case 2:
                System.out.println("your sign is : Taurus");
                break;
            case 3:
                System.out.println("your sign is : Gemini");
                break;
            case 4:
                System.out.println("your sign is : Leo");
                break;
            case 5:
                System.out.println("your sign is : Virgo");
                break;
            case 6:
                System.out.println("your sign is : Libra");
                break;
            case 7:
                System.out.println("your sign is : Scorpio");
                break;
            case 8:
                System.out.println("your sign is : Sagittarius");
                break;
            case 9:
                System.out.println("your sign is : Capricorn");
                break;
            case 10:
                System.out.println("your sign is : Aquarius");
                break;
            case 11:
                System.out.println("your sign is : Pisces");
                break;
            case 12:
                System.out.println("your sign is : Aries");
                break;

        }
        }
    }




    public static int method(int mesiac, int den ) {

        int znamnie_cislo = 0;
        switch (mesiac) {
            case 1:
                if (den <= 1 && den <= 19) znamnie_cislo = 10;
                else znamnie_cislo = 11;
                return znamnie_cislo;
            //break;
            case 2:
                if (den <= 1 && den <= 19) znamnie_cislo = 11;
                else znamnie_cislo = 12;
                return znamnie_cislo;
            //break;
            case 3:
                if (den <= 1 && den <= 19) znamnie_cislo = 12;
                else znamnie_cislo = 1;
                return znamnie_cislo;
            //break;
            case 4:
                if (den <= 1 && den <= 19) znamnie_cislo = 1;
                else znamnie_cislo = 2;
                return znamnie_cislo;
            //break;
            case 5:
                if (den <= 1 && den <= 19) znamnie_cislo = 2;
                else znamnie_cislo = 3;
                return znamnie_cislo;
            //break;
            case 6:
                if (den <= 1 && den <= 19) znamnie_cislo = 3;
                else znamnie_cislo = 4;
                return znamnie_cislo;
            //break;
            case 7:
                if (den <= 1 && den <= 19) znamnie_cislo = 4;
                else znamnie_cislo = 5;
                return znamnie_cislo;
            //break;
            case 8:
                if (den <= 1 && den <= 19) znamnie_cislo = 5;
                else znamnie_cislo = 6;
                return znamnie_cislo;
            //break;
            case 9:
                if (den <= 1 && den <= 19) znamnie_cislo = 6;
                else znamnie_cislo = 7;
                return znamnie_cislo;
            //break;
            case 10:
                if (den <= 1 && den <= 19) znamnie_cislo = 7;
                else znamnie_cislo = 8;
                return znamnie_cislo;
            //break;
            case 11:
                if (den <= 1 && den <= 19) znamnie_cislo = 8;
                else znamnie_cislo = 9;
                return znamnie_cislo;
            //break;
            case 12:
                if (den <= 1 && den <= 19) znamnie_cislo = 9;
                else znamnie_cislo = 10;
                return znamnie_cislo;
            //break;
            default:
                return znamnie_cislo = 1;
        }

    }
}

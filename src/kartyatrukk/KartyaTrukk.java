package kartyatrukk;

import java.util.Scanner;

public class KartyaTrukk {
    private Scanner sc = new Scanner(System.in);
    private Pakli kartya = new Pakli(0);

    public KartyaTrukk() {
       indit();
    }
    
    private void indit(){
        kartya.feltolt();
        for (int i = 0; i < 3; i++) {
            kartya.kirak();
            int oszlop = melyik();
            kartya.kever(oszlop);
        }
        kartya.ezVolt();
    }
    
    private int melyik(){
        int oszlop;
        boolean jo;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
}

package kartyatrukk;

import java.util.Scanner;

public class KartyaTrukk {
    private Scanner sc = new Scanner(System.in);

    public KartyaTrukk() {
       indit();
    }
    
    private void indit(){
        new Pakli.feltolt();
        for (int i = 0; i < 3; i++) {
            new Pakli.kirak();
            int oszlop = melyik();
            new Pakli.kever(oszlop);
        }
        ezVolt();
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

package generic.test.test5;

import generic.test.test3.Marine;
import generic.test.test3.Zealot;
import generic.test.test3.Zergling;
import generic.test.test4.Shuttle;

public class UnitPrinterTestMain {

    public static void main(String[] args) {

        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("질럿", 100));

        UnitPrinter.printV1(shuttle1);
        UnitPrinter.printV2(shuttle3);
    }
}

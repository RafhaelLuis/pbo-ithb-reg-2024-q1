package Main;

import Model.*;
import View.View;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Tiket> listTiket = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("\033c");
        new View();
    }
}

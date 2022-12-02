package com.farrukhzaripov._collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("AMC", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats); // new array of seat object
        printList(seatCopy);
        seatCopy.get(1).reserved();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }
        Collections.replaceAll(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theater");
        printList(theatre.seats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.print("///////////////////////////////////////////////////////////");
    }
}

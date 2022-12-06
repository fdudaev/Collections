package com.farrukhzaripov._collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("AMC", 8, 12);

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }
        if (theatre.reserveSeat("D13")) {
            System.out.println("Please pay for D13");
        } else {
            System.out.println("Seat already reserved");
        }
        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeat());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("///////////////////////////////////////////////////////////");
    }

}

package com.farrukhzaripov._collections;

public class Main {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("AMC", 8, 12);

        //theatre.getSeat();
        theatre.reserveSeat("H02");
        if(theatre.reserveSeat("H02")){
            System.out.println("Please pay");
        }else {
            System.out.println("Sorry, the seat is taken");
        }
    }
}

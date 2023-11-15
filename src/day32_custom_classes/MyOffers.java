package day32_custom_classes;

import java.util.ArrayList;

public class MyOffers {
    public static void main(String[] args) {


        Offer o1 = new Offer("Apple", "California", 100_000, true, 21);
        OfferV2 o2 = new OfferV2("Samsung", "Seoul", 120_000, true, 28);

        ArrayList<OfferV2> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list2.add(new String ("Hello"));

    }
}
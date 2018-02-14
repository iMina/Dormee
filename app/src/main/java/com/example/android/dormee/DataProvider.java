package com.example.android.dormee;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Apartment> data = new ArrayList<Apartment>();

    // dummy data to be replaced
    static {
        data.add(new Apartment("Apartment near GUC", 2300, 3, 110, "New Cairo"));
        data.add(new Apartment("Apartment not near GUC", 2000, 2, 95, "New Cairo"));
        data.add(new Apartment("Apartment near AUC", 2500, 3, 120, "New Cairo"));
        data.add(new Apartment("Apartment not near AUC", 2300, 3, 140, "New Cairo"));
        data.add(new Apartment("Same apartment near GUC", 2300, 3, 110, "New Cairo"));
        data.add(new Apartment("Same apartment not near GUC", 2000, 2, 95, "New Cairo"));
        data.add(new Apartment("Same apartment near AUC", 2500, 3, 120, "New Cairo"));
        data.add(new Apartment("Same apartment not near AUC", 2300, 3, 140, "New Cairo"));
    }

    public static List<Apartment> getData() {
        return data;
    }
}

package com.rocketteam.dondehay.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcoh on 23/11/14.
 */
public class TestData {
    public final static List<Place> Places = new ArrayList<Place>();

    public static void init() {
        Places.add(new Place("Unicentro","Centro Comercial","Calle 15 con cra. 127",0,0));
        Places.add(new Place("Unilago","Centro Comercial","Calle 15 con Cra. 79",0,0));
        Places.add(new Place("Globant","Empresa","Cra. 26 con Calle 68B",0,0));
        Places.add(new Place("Intcomex","Empresa","Calle 72 con Cra. 14",0,0));
    }
}

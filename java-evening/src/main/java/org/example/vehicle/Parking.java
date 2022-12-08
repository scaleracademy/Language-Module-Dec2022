package org.example.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    List<Vehicle> smallVehicles = new ArrayList<>();
    List<Vehicle> largeVehicles = new ArrayList<>();

    public void park(Vehicle v) {
        switch (v.type) {
            case TRACTOR, TRUCK, VAN, BUS -> largeVehicles.add(v);
            case MOTORCYCLE, CAR -> smallVehicles.add(v);
        }
    }
}

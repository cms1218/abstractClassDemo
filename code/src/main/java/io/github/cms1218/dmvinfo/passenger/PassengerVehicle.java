package io.github.cms1218.dmvinfo.passenger;

import io.github.cms1218.dmvinfo.Vehicle;
import io.github.cms1218.dmvinfo.VehicleTypes;

public abstract class PassengerVehicle extends Vehicle {
    private final Makes make;

    public PassengerVehicle(
            String vin,
            int manufactureYear,
            Makes make
    ) {
        super(vin, manufactureYear, VehicleTypes.PASSENGER);
        this.make = make;
    }



}

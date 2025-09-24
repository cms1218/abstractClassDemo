package io.github.cms1218.dmvinfo;

public enum VehicleTypes {
    PASSENGER("Passenger"),
    MOTORCYCLE("Motorcycle"),
    BOAT("Boat"),
    TRAILER("Trailer");

    private final String displayName;

    VehicleTypes(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}

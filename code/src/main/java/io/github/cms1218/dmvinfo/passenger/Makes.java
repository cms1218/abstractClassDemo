package io.github.cms1218.dmvinfo.passenger;

public enum Makes {
    CHEVROLET("Chevrolet"),
    FORD("Ford"),
    TOYOTA("Toyota"),
    TESLA("Tesla"),
    HONDA("Honda");

    private final String displayName;

    Makes(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}

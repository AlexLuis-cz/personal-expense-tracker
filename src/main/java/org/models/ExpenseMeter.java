package org.models;

public enum ExpenseMeter {
    DANGER,
    ALERT,
    SAVE;

    ExpenseMeter() {

    }

    public static ExpenseMeter value(double value, double limitValue) {
        if (value >= (limitValue / 2)) {
            return SAVE;
        } else if (value < limitValue && value > 0) {
            return ALERT;
        } else if (value <= 0) {
            return DANGER;
        }
        return null;
    }
}

package com.apps.quantitymeasurement;

/**
 * QuantityMeasurementApp - UC2: Feet and Inches measurement equality
 * This class handles independent equality checks for Feet and Inches.
 */
public class QuantityMeasurementApp {

    // Inner class to represent Feet measurement
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Feet feet = (Feet) obj;
            return Double.compare(feet.value, value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }

    // Inner class to represent Inches measurement
    public static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Inches inches = (Inches) obj;
            return Double.compare(inches.value, value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }

    // Static method to demonstrate Feet equality check
    public static void demonstrateFeetEquality() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);
        System.out.println("Input: 1.0 ft and 1.0 ft -> Output: Equal (" + f1.equals(f2) + ")");
    }

    // Static method to demonstrate Inches equality check
    public static void demonstrateInchesEquality() {
        Inches i1 = new Inches(1.0);
        Inches i2 = new Inches(1.0);
        System.out.println("Input: 1.0 inch and 1.0 inch -> Output: Equal (" + i1.equals(i2) + ")");
    }

    public static void main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
    }
}

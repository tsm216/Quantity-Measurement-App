package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    // Inner class to represent Feet measurement
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        /**
         * Overrides equals() to compare two Feet objects based on their value.
         */
        @Override
        public boolean equals(Object obj) {
            // 1. Reference Check: Are they the exact same object in memory?
            if (this == obj) return true;

            // 2. Null Check & 3. Type Check: Is the other object null or a different class?
            if (obj == null || getClass() != obj.getClass()) return false;

            // 4. Value Comparison: Cast and compare the double values safely
            Feet that = (Feet) obj;
            return Double.compare(that.value, this.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }

    public static void main(String[] args) {
        // Demonstration of equality check
        Feet firstFeet = new Feet(1.0);
        Feet secondFeet = new Feet(1.0);
        Feet thirdFeet = new Feet(2.0);

        System.out.println("Input: 1.0 ft and 1.0 ft -> Output: Equal (" + firstFeet.equals(secondFeet) + ")");
        System.out.println("Input: 1.0 ft and 2.0 ft -> Output: Equal (" + firstFeet.equals(thirdFeet) + ")");
    }
}

package com.javatunes.billing;

public class TaxCalculatorFactory {
    //prevent outside instantiation - this is an all-static class

    /*
     * OPTIONAL CHALLENGE:
     * IMPLEMENT A SIMPLE CACHE OF TAXCALCULATOT OBJECTS.
     * - IF THE CACHE CONTAINTS THE DESIRED TAXCALCULATOR, RETURN IT FROM CACHE
     * - IF NOT, CREATE NEW ONE, PUT IT IN THE CACHE, AND THEN RETURN IT
     *
     * IMPLEMENTATION NOTE:
     * YOU CAN USE A MAP<LOCATION, TAXCALCULATOR> FOR THE CACHE (HASHMAP)
     */

    private TaxCalculatorFactory() {
    }

    public static TaxCalculator getTaxCalculator(Location location) {
        TaxCalculator calc = null;

        switch (location) {
            case ONLINE:
                calc = new OnlineTax();
                break;
            case USA:
                calc = new USATax();
                break;
            case EUROPE:
                calc = new EuropeTax();
        }
        return calc;
    }

}
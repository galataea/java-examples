package com.galataea.testing;


/**
 * A coffee shop that can brew coffee and maintains internal stock of beans and milk
* */


public final class Cafe {



    private int beanInStock = 0;
    private int milkInStock = 0;

    public Coffee brew(CoffeeType coffeeType) { return brew(coffeeType, 1); }

    public Coffee brew(CoffeeType coffeeType, int quantity) {

        requirePositive(quantity);

        return new Coffee(coffeeType, quantity, quantity);


    }

    private void requirePositive(int value) {
        if (value < 1) {

        }
    }


}

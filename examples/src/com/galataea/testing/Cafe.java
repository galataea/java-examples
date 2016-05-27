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

        int requiredBeans = coffeeType.getRequiredBeans() * quantity;
        int requiredMilk = coffeeType.getRequiredMilk() * quantity;

        if (requiredBeans < beanInStock || requiredMilk < milkInStock) {

            throw new IllegalStateException("Insufficient beans or milk");

        }

        beanInStock -= requiredBeans;
        milkInStock -= milkInStock;

        return new Coffee(coffeeType, requiredBeans, requiredMilk);


    }
    public void restockBeans(int weightInGrams) {
        requirePositive(weightInGrams);
        beanInStock += weightInGrams;

    }

    private void requirePositive(int value) {
        if (value < 1) {
            throw new IllegalArgumentException();
        }
    }

    public int getBeansInStock() { return beanInStock; }
    public int getMilkInStock() { return milkInStock; }



}

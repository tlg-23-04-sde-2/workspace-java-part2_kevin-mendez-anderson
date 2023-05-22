/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/*
 * keep in mind that at run time client side code is going to say something like this:
 * shopping cart<product>
 * shopping cart<MusicItem>
 * shopping car<mediaPlayer>
 */
public class ShoppingCart<T extends Product> {
    // storage for the cart's contents
    private final Collection<T> items = new ArrayList<T>();  // diamond not used here just to emphasize the T

    public Collection<T> allItems() {
        return Collections.unmodifiableCollection(items);
    }

    public double total() {
        double total = 0;
        for (T item: allItems()){
            total += item.getPrice();
        }
        return total;
    }

    public int size() {
        return items.size();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }
}
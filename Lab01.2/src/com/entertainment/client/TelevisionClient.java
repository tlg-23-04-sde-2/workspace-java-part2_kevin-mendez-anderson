package com.entertainment.client;

import com.entertainment.Television;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.Set;

class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television("SONY", 50);
        Television tv2 = new Television("SONY", 50);
        System.out.println("tvA == tvB: " + (tv1 == tv2));
        System.out.println("tvA.equals(yvB): " + tv1.equals(tv2));
        System.out.println();

        System.out.println(tv1.hashCode());
        System.out.println(tv2.hashCode());

        Set<Television> tvs = new HashSet<>();
        tvs.add(tv1);
        tvs.add(tv2);
        System.out.println(tvs.size());
    }
}
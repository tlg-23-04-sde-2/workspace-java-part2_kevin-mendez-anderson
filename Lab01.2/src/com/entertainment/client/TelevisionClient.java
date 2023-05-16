package com.entertainment.client;

import com.entertainment.Television;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television("SONY", 50);
        Television tv2 = new Television("SONY", 50);
        Television tv3 = new Television("SONY", 52);
        Television tv4 = new Television("SONY", 12);

        System.out.println("tvA == tvB: " + (tv1 == tv2));
        System.out.println("tvA.equals(yvB): " + tv1.equals(tv2));
        System.out.println();

        Set<Television> tvs = new TreeSet<>();
        tvs.add(tv1);
        tvs.add(tv2);
        tvs.add(tv3);
        tvs.add(tv4);
        System.out.println(tvs.size());
        for (Television tv: tvs){
            System.out.println(tv);
        }
    }
}
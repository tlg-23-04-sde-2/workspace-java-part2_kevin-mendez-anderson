package com.entertainment.client;

import com.entertainment.Television;

class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television("SONY", 50);
        System.out.println(tv1);
        System.out.println(tv2);

        tv1.changeChannel(10);
        System.out.println(tv1);

    }

}
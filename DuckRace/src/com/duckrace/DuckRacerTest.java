package com.duckrace;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

class DuckRacerTest {
    public static void main(String[] args) {
        DuckRacer racer10 = new DuckRacer(10, "Kevin");
        System.out.println(racer10);

        //make it win a few times
        racer10.win(Reward.DEBIT_CARD);
        racer10.win(Reward.PRIZES);
        racer10.win(Reward.PRIZES);
        System.out.println(racer10);
        // retrieve a read-only view of the reward list, add(), remove(), clear(), NO GOOD
        List<Reward> rewardList = racer10.getRewards();

        //show just the reward
        System.out.println(rewardList);

        //make it win again, and notice how our rewards list reflects that new reward
        racer10.win(Reward.PRIZES);

        //the rewards list will reflect this new win
        System.out.println(rewardList);
    }
}
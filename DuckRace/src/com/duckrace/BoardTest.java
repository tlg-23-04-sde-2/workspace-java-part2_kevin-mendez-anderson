package com.duckrace;

class BoardTest {

    public static void main(String[] args) {
        //create a Board object, which initialises its fields causing the file to get read
        Board board = new Board();
       // board.dumpStudentIdMap();

        board.update(3, Reward.PRIZES);
        board.update(3,Reward.DEBIT_CARD);
        board.update(10,Reward.DEBIT_CARD);
        board.update(13,Reward.DEBIT_CARD);
        board.update(1,Reward.PRIZES);
        board.update(5,Reward.DEBIT_CARD);
        board.update(3,Reward.DEBIT_CARD);

        board.show();
    }
}
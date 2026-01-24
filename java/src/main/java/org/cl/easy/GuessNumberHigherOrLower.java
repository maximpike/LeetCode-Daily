package org.cl.easy;

/**
 * Forward declaration of guess API.
 *
 * @param num your guess
 * @return -1 if num is higher than the picked number
 * 1 if num is lower than the picked number
 * otherwise return 0
 * int guess(int num);
 */

public class GuessNumberHigherOrLower extends GuessGame {

    public GuessNumberHigherOrLower(int pick) {
        super(pick);
    }

    public int guessNumber(int n) {
        int l = 0;
        int r = n;
        // Think of l, r, m (guess) and p on a number line

        while (l <= r) {
            int m = l + ((r - l) / 2);

            if (guess(m) == 0) {
                return m;
            } else if (guess(m) == 1) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}

class GuessGame {

    private int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    public int guess(int num) {
        return Integer.compare(pick, num);
    }
}

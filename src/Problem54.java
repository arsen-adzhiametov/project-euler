import java.util.Arrays;

public class Problem54 {
    int firstPlayerWins = 0;
    int secondPlayerWins = 0;

    public static void main(String[] args) {
        System.out.println(combination("9D TD JD KD QD"));
    }

    public static String combination(String cards) {

        String allCards = "23456789TJQKA";
        String arr = cards.replace('T', 'L').replace('J', 'M').replace('Q', 'N').replace('K', 'O').replace('A', 'P').trim();
        char[] charr = (String.valueOf(arr.charAt(0)) + String.valueOf(arr.charAt(3)) +
                String.valueOf(arr.charAt(6)) + String.valueOf(arr.charAt(9)) + String.valueOf(arr.charAt(12))).toCharArray();
        Arrays.sort(charr);
        arr = String.copyValueOf(charr).replace('L', 'T').replace('M', 'J').replace('N', 'Q').replace('O', 'K').replace('P', 'A');

        if (cards.charAt(1) == cards.charAt(4) && cards.charAt(7) == cards.charAt(10) &&
                cards.charAt(13) == cards.charAt(1) && cards.charAt(10) == cards.charAt(4)) {
            if (cards.contains("T") && cards.contains("J") && cards.contains("Q") &&
                    cards.contains("K") && cards.contains("A")) {
                return "Royal Flush";
            }
            if (allCards.contains(arr)) {
                return "Straight Flush";
            } else {
                return "Flush";
            }
        }

        if ((cards.charAt(0) == cards.charAt(3) && cards.charAt(6) == cards.charAt(9) && cards.charAt(3) == cards.charAt(6))
                || (cards.charAt(0) == cards.charAt(3) && cards.charAt(6) == cards.charAt(12) && cards.charAt(3) == cards.charAt(6))
                || (cards.charAt(0) == cards.charAt(3) && cards.charAt(9) == cards.charAt(12) && cards.charAt(3) == cards.charAt(9))
                || (cards.charAt(0) == cards.charAt(6) && cards.charAt(9) == cards.charAt(12) && cards.charAt(9) == cards.charAt(6))
                || (cards.charAt(3) == cards.charAt(6) && cards.charAt(9) == cards.charAt(12) && cards.charAt(9) == cards.charAt(6))) {
            return "Four of a Kind";
        }

        if ((cards.charAt(0) == cards.charAt(3) && cards.charAt(3) == cards.charAt(6) && cards.charAt(9) == cards.charAt(12)) ||
                (cards.charAt(0) == cards.charAt(3) && cards.charAt(3) == cards.charAt(9) && cards.charAt(6) == cards.charAt(12)) ||
                (cards.charAt(0) == cards.charAt(3) && cards.charAt(3) == cards.charAt(12) && cards.charAt(6) == cards.charAt(9)) ||
                (cards.charAt(0) == cards.charAt(9) && cards.charAt(9) == cards.charAt(12) && cards.charAt(3) == cards.charAt(6)) ||
                (cards.charAt(0) == cards.charAt(6) && cards.charAt(6) == cards.charAt(12) && cards.charAt(3) == cards.charAt(9)) ||
                (cards.charAt(0) == cards.charAt(6) && cards.charAt(6) == cards.charAt(9) && cards.charAt(3) == cards.charAt(12)) ||
                (cards.charAt(3) == cards.charAt(6) && cards.charAt(6) == cards.charAt(9) && cards.charAt(0) == cards.charAt(12)) ||
                (cards.charAt(6) == cards.charAt(9) && cards.charAt(9) == cards.charAt(12) && cards.charAt(0) == cards.charAt(3)) ||
                (cards.charAt(3) == cards.charAt(6) && cards.charAt(6) == cards.charAt(12) && cards.charAt(0) == cards.charAt(9)) ||
                (cards.charAt(3) == cards.charAt(9) && cards.charAt(9) == cards.charAt(12) && cards.charAt(0) == cards.charAt(6))) {
            return "Full House";
        }

        if (allCards.contains(arr)) {
            return "Straight";
        }

        if ((cards.charAt(0) == cards.charAt(3) && cards.charAt(3) == cards.charAt(6) && cards.charAt(9) != cards.charAt(12)) ||
                (cards.charAt(0) == cards.charAt(3) && cards.charAt(3) == cards.charAt(9) && cards.charAt(6) != cards.charAt(12)) ||
                (cards.charAt(0) == cards.charAt(3) && cards.charAt(3) == cards.charAt(12) && cards.charAt(6) != cards.charAt(9)) ||
                (cards.charAt(0) == cards.charAt(9) && cards.charAt(9) == cards.charAt(12) && cards.charAt(3) != cards.charAt(6)) ||
                (cards.charAt(0) == cards.charAt(6) && cards.charAt(6) == cards.charAt(12) && cards.charAt(3) != cards.charAt(9)) ||
                (cards.charAt(0) == cards.charAt(6) && cards.charAt(6) == cards.charAt(9) && cards.charAt(3) != cards.charAt(12)) ||
                (cards.charAt(3) == cards.charAt(6) && cards.charAt(6) == cards.charAt(9) && cards.charAt(0) != cards.charAt(12)) ||
                (cards.charAt(6) == cards.charAt(9) && cards.charAt(9) == cards.charAt(12) && cards.charAt(0) != cards.charAt(3)) ||
                (cards.charAt(3) == cards.charAt(6) && cards.charAt(6) == cards.charAt(12) && cards.charAt(0) != cards.charAt(9)) ||
                (cards.charAt(3) == cards.charAt(9) && cards.charAt(9) == cards.charAt(12) && cards.charAt(0) != cards.charAt(6)) ||
                (cards.charAt(3) == cards.charAt(12) && cards.charAt(9) == cards.charAt(12) && cards.charAt(0) != cards.charAt(6))) {
            return "Three of a Kind";
        }

        if ((cards.charAt(0) == cards.charAt(3) && cards.charAt(9) == cards.charAt(12)) ||
                (cards.charAt(0) == cards.charAt(3) && cards.charAt(6) == cards.charAt(12)) ||
                (cards.charAt(0) == cards.charAt(3) && cards.charAt(6) == cards.charAt(9)) ||
                (cards.charAt(0) == cards.charAt(9) && cards.charAt(3) == cards.charAt(12)) ||
                (cards.charAt(0) == cards.charAt(9) && cards.charAt(3) == cards.charAt(6)) ||
                (cards.charAt(0) == cards.charAt(6) && cards.charAt(3) == cards.charAt(9)) ||
                (cards.charAt(0) == cards.charAt(6) && cards.charAt(3) == cards.charAt(12)) ||
                (cards.charAt(3) == cards.charAt(6) && cards.charAt(0) == cards.charAt(12)) ||
                (cards.charAt(6) == cards.charAt(9) && cards.charAt(0) == cards.charAt(3)) ||
                (cards.charAt(3) == cards.charAt(6) && cards.charAt(0) == cards.charAt(9)) ||
                (cards.charAt(3) == cards.charAt(9) && cards.charAt(0) == cards.charAt(6))) {
            return "Two Pairs";
        }

        if ((cards.charAt(0) == cards.charAt(3)) ||
                (cards.charAt(0) == cards.charAt(6)) ||
                (cards.charAt(0) == cards.charAt(9)) ||
                (cards.charAt(0) == cards.charAt(12)) ||
                (cards.charAt(3) == cards.charAt(6)) ||
                (cards.charAt(3) == cards.charAt(9)) ||
                (cards.charAt(3) == cards.charAt(12)) ||
                (cards.charAt(6) == cards.charAt(9)) ||
                (cards.charAt(6) == cards.charAt(12)) ||
                (cards.charAt(9) == cards.charAt(12))) {
            return "One Pair";
        }
        return String.valueOf(arr.charAt(4));
    }
}

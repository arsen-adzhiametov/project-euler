import java.util.Arrays;

public class Problem54a {
    static int firstPlayerWins = 0;
    static String allCards = "23456789TJQKA";

    public static void main(String[] args) {
        firstPlayerWins += play("TD JD QD KD 9D TH JH DH KH AH");
        System.out.println(firstPlayerWins);
    }

    public static int play(String cards) {
        String player1 = cards.substring(0, 14);
        String player2 = cards.substring(15, 29);
        if (isRoyalFlush(player1)) {
            return 1;
        }
        if (isStraightFlush(player1) && isRoyalFlush(player2) == false && isStraightFlush(player2) == false) {
            return 1;
        }
        if (isStraightFlush(player1) && isStraightFlush(player2) && sortCards(player1).charAt(4) > sortCards(player2).charAt(4)) {
            return 1;
        }
        if (isKindOfFour(player1) && isRoyalFlush(player2) == false && isStraightFlush(player2) == false &&
                isKindOfFour(player2) == false) {
            return 1;
        }
        if (isKindOfFour(player1) && isKindOfFour(player2) && allCards.indexOf(sortCards(player1).charAt(1)) >
                allCards.indexOf(sortCards(player2).charAt(1))) {
            return 1;
        }
        if (isKindOfFour(player1) && isKindOfFour(player2) && allCards.indexOf(sortCards(player1).charAt(1)) ==
                allCards.indexOf(sortCards(player2).charAt(1))) {
        }

        return 0;
    }

    public static boolean isFlush(String playerCards) {
        if (playerCards.charAt(1) == playerCards.charAt(4) && playerCards.charAt(7) == playerCards.charAt(10) &&
                playerCards.charAt(13) == playerCards.charAt(1) && playerCards.charAt(10) == playerCards.charAt(4)) {
            return true;
        }
        return false;
    }

    public static boolean isKindOfFour(String playerCards) {
        if ((playerCards.charAt(0) == playerCards.charAt(3) && playerCards.charAt(6) == playerCards.charAt(9) && playerCards.charAt(3) == playerCards.charAt(6))
                || (playerCards.charAt(0) == playerCards.charAt(3) && playerCards.charAt(6) == playerCards.charAt(12) && playerCards.charAt(3) == playerCards.charAt(6))
                || (playerCards.charAt(0) == playerCards.charAt(3) && playerCards.charAt(9) == playerCards.charAt(12) && playerCards.charAt(3) == playerCards.charAt(9))
                || (playerCards.charAt(0) == playerCards.charAt(6) && playerCards.charAt(9) == playerCards.charAt(12) && playerCards.charAt(9) == playerCards.charAt(6))
                || (playerCards.charAt(3) == playerCards.charAt(6) && playerCards.charAt(9) == playerCards.charAt(12) && playerCards.charAt(9) == playerCards.charAt(6))) {
            return true;
        }
        return false;
    }

    public static boolean isStraightFlush(String playerCards) {
        if (isFlush(playerCards) && allCards.contains(sortCards(playerCards))) {
            return true;
        }
        return false;
    }

    public static boolean isRoyalFlush(String playerCards) {
        if (isFlush(playerCards) && allCards.substring(8).contains(sortCards(playerCards))) {
            return true;
        }
        return false;
    }

    public static String sortCards(String unsortedCards) {
        String sortedCards = unsortedCards.replace('T', 'L').replace('J', 'M').replace('Q', 'N').replace('K', 'O').replace('A', 'P').trim();
        char[] charr = (String.valueOf(sortedCards.charAt(0)) + String.valueOf(sortedCards.charAt(3)) +
                String.valueOf(sortedCards.charAt(6)) + String.valueOf(sortedCards.charAt(9)) + String.valueOf(sortedCards.charAt(12))).toCharArray();
        Arrays.sort(charr);
        sortedCards = String.copyValueOf(charr).replace('L', 'T').replace('M', 'J').replace('N', 'Q').replace('O', 'K').replace('P', 'A');
        return sortedCards;
    }
}

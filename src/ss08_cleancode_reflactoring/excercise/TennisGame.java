package ss08_cleancode_reflactoring.excercise;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int playerScore1, int playerScore2) {
        String score = "";
        boolean tempScore = false;
        if (playerScore1 == playerScore2) {
            score = compareScore(playerScore1);
        } else if (playerScore1 < 4 && playerScore2 < 4) {
            score = compareTempScore(playerScore1, playerScore2, score);
        } else {
            score = score(playerScore1, playerScore2);
        }

        return score;
    }

    private static String compareScore(int playerScore1) {
        String score;
        switch (playerScore1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
        }

        return score;
    }

    private static String compareTempScore(int playerScore1, int playerScore2, String score) {
        for (int i = 1; i < 3; ++i) {
            int tempScore;
            if (i == 1) {
                tempScore = playerScore1;
            } else {
                score = score + "-";
                tempScore = playerScore2;
            }

            switch (tempScore) {
                case 0:
                    score = score + "Love";
                    break;
                case 1:
                    score = score + "Fifteen";
                    break;
                case 2:
                    score = score + "Thirty";
                    break;
                case 3:
                    score = score + "Forty";
            }
        }

        return score;
    }

    private static String score(int playerScore1, int playerScore2) {
        int minusResult = playerScore1 - playerScore2;
        String score;
        if (minusResult == 1) {
            score = "Advantage player1";
        } else if (minusResult == -1) {
            score = "Advantage player2";
        } else if (minusResult >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }

        return score;
    }
}
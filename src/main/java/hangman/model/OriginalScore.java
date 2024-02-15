package hangman.model;

public class OriginalScore implements GameScore{
    int score = 100;
    int bonusScore = 0;
    int penalty = -10;
    int minScore = 0;

    /**
     * This method calculates the current score with the next conditions the game begins with 100 points, penalty of 10 points,
     * no points for correct letter and the minimum score is 0.
     * @param correctCount int
     * @param incorrectCount int
     * @return int
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        score =  (score-(penalty*incorrectCount));
        if(score > 0){
            return score;
        }else{
            return minScore;
        }
    }
}

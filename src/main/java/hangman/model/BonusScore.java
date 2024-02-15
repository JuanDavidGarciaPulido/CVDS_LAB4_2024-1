package hangman.model;

public class BonusScore implements GameScore{
    int score = 0;
    int bonusScore = 10;
    int penalty = -5;
    int minScore = 0;

    /**
     * This method calculates the current score with the next conditions. The game begins with 0 points, penalty of 5 points,
     * 10 points for correct letter and the minimum score is 0.
     * @param correctCount int
     * @param incorrectCount int
     * @return int
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        score =  (score+(bonusScore*correctCount))-(penalty*incorrectCount);
        if(score > 0){
            return score;
        }else{
            return minScore;
        }
    }
}

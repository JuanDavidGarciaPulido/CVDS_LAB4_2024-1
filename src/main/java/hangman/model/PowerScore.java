package hangman.model;

public class PowerScore implements GameScore{
    int score = 0;
    int bonusScore = 5;
    int penalty = -8;
    int minScore = 0;
    int maxScore = 500;

    /**
     * This method calculates the current score with the next conditions. The game begins with 0 points, penalty of 8 points,
     * 5^i points for correct letter, the minimum score is 0 and the maximum score is 500.
     * @param correctCount int
     * @param incorrectCount int
     * @return int
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int count = 1;
        for(int i = 0;i != correctCount; i++){
            score = (int) (score + Math.pow(bonusScore,count));
            count++;
        }
        score = (score-(penalty*incorrectCount));
        if(score > 500){
            return maxScore;
        }else if(score < 500 && score > 0){
            return score;
        }else{
            return minScore;
        }
    }
}

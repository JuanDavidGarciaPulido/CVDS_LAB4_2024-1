package hangman.model;
import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest{
    private GameScore gameScore;
    @Test
    public void originalScoreMaxScore(){
        gameScore = new OriginalScore();
        assertScore(5,0,100);
    }

    @Test
    public void originalScoreMinScore(){
        gameScore = new OriginalScore();
        assertScore(0,10,0);
    }

    @Test
    public void bonusScoreMaxScore(){
        gameScore = new BonusScore();
        assertScore(23,0,230);
    }

    @Test
    public void bonusScoreMinScore(){
        gameScore = new BonusScore();
        assertScore(0,0,0);
    }

    @Test
    public void powerScoreMaxScore(){
        gameScore = new PowerScore();
        assertScore(10,0,500);
    }

    @Test
    public void powerScoreMinScore(){
        gameScore = new PowerScore();
        assertScore(2,4,0);
    }

    private void assertScore(int correctCount, int incorrectCount, int expectedScore){
        int result = gameScore.calculateScore(correctCount, incorrectCount);
        Assert.assertEquals(expectedScore, result);
    }
}

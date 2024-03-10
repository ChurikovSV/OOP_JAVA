package org.example;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {

    abstract List<String> generateChrlist();

    private String word;
    Integer tryCount;
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeWord, Integer tryCount) {
        word = generateWord(sizeWord);
        this.tryCount = tryCount;
        gameStatus = GameStatus.START;
    }

    private String generateWord(Integer sizeWord) {
        List<String> alphabat = generateChrlist();
        Random rnd = new Random();
        String res = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = rnd.nextInt(alphabat.size());
            res += alphabat.get(randomIndex);
            alphabat.remove(randomIndex);
        }
        return res;
    }

    @Override
    public Answer inputValue(String value) {
        if (getGameStatus().equals(GameStatus.START)){
            throw new RuntimeException("Игра не запущена");
        }
        int cowCounter = 0;
        int bullCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                cowCounter++;
                bullCounter++;
            } else if (word.contains(String.valueOf(value.charAt(i)))) {
                cowCounter++;
            }
        }
        tryCount--;
        if (tryCount == 0){
            gameStatus = GameStatus.LOOSE;
        }
        if (bullCounter == word.length()){
            gameStatus = GameStatus.WIN;
        }
        return new Answer(cowCounter, bullCounter, tryCount);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }


}

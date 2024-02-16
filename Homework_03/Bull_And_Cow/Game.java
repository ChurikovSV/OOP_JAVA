package Bull_And_Cow;

public interface Game {
    void start(Integer wordSize, Integer tryCount);

    Answer inputValue(String value);

    GameStatus getGameStatus();
}

package nextstep.ladder;

import nextstep.ladder.factory.LadderFactory;
import nextstep.ladder.ladder.Ladder;
import nextstep.ladder.ladder.LadderBound;
import nextstep.ladder.player.Players;
import nextstep.ladder.view.InputView;
import nextstep.ladder.view.ResultView;

public class App {

    public static void main(String[] args) {
        String playerNames = InputView.getInputPlayerName();
        int height = InputView.getInputMaxLadderHeight();

        Players players = Players.of(playerNames);
        Ladder ladder = Ladder.of(LadderBound.of(players.count() - 1, height), LadderFactory.randomLadderStrategy());

        ResultView.print(players, ladder);
    }
}

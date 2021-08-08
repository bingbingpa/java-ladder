package nextstep.ladder.player;

import nextstep.ladder.exception.IllegalPlayerNameSizeException;

public class Player {

    private static final int MAX_NAME_LENGTH = 5;

    private final String name;
    private final int position;

    private Player(String name, int position) {
        validate(name);
        this.name = name;
        this.position = position;
    }

    public static Player of(String name, int position) {
        return new Player(name, position);
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    private void validate(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalPlayerNameSizeException(name);
        }
    }
}

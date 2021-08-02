package nextstep.ladder;

import nextstep.ladder.exception.IllegalPlayerNameSizeException;

public class Player {

    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    public Player(String name) {
        validate(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validate(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalPlayerNameSizeException(name);
        }
    }
}

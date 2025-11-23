package theater;

/**
 * Class representing a play.
 */
public class Play {

    private String name;
    private String type;

    /**
     * Creates a new play.
     * @param name the name of the play
     * @param type the type of play
     */
    public Play(final String name, final String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Gets the name of the play.
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the type of the play.
     * @return the type
     */
    public String getType() {
        return this.type;
    }
}

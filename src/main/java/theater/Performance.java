package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    private String playID;
    private int audience;

    /**
     * Creates a new performance.
     * @param playID the ID of the play being performed
     * @param audience the size of the audience
     */
    public Performance(final String playID, final int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Gets the play ID.
     * @return the play ID
     */
    public String getPlayID() {
        return this.playID;
    }

    /**
     * Gets the audience size.
     * @return the audience size
     */
    public int getAudience() {
        return this.audience;
    }
}

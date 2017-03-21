package cz.muni.fi.pv260.control.direction;

/**
 * Allow user to navigate through the play area.
 */
public interface DirectionControl2D {

    /**
     * Direct player to the {@link Direction#RIGHT}, if possible
     */
    void directRight();

    /**
     * Direct player to the {@link Direction#LEFT}, if possible
     */
    void directLeft();

    /**
     * Direct player to the {@link Direction#UP}, if possible
     */
    void directUp();

    /**
     * Direct player to the {@link Direction#DOWN}, if possible
     */
    void directDown();

    /**
     * Returns the current {@link Direction} of the player
     */
    Direction getDirection();
}
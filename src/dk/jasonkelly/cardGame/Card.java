package dk.jasonkelly.cardGame;

public class Card {

    // The ordering value
    private int value;

    // The color Spade, Clubs and so on
    private String color;

    // The name of the card King, Queen and so on
    private String name;

    /**
     *
     * @param color set the color
     * @param name set the card name
     * @param value set the value of the card
     */
    public Card(String color, String name, int value) {
        this.color = color;
        this.name = name;
        this.value = value;
    }

    /**
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value set the value of the card
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color set the color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name set the card name
     */
    public void setName(String name) {
        this.name = name;
    }
}

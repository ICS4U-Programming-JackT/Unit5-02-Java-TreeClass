/**
 * Tree object.
 */
public class Tree {

    // Fields
    /** Name field. */
    private String name;
    /** Year planted field. */
    private int yearPlanted;
    /** Height field. */
    private int height;
    /** Num leaves field. */
    private int numLeaves;

    /**
     * Tree constructor.
     */
    public Tree() {
        this.name = "Unknown";
        this.yearPlanted = 0;
        this.height = 0;
        this.numLeaves = 0;
    }

    /**
     * Overloaded constructor.
     *
     * @param treeName the name of the tree
     * @param plantedYear the year the tree was planted
     */
    public Tree(final String treeName, final int plantedYear) {
        this.name = treeName;
        this.yearPlanted = plantedYear;
        this.height = 1;
        this.numLeaves = 10;
    }

    /**
     * Makes the tree lose all its leaves.
     */
    public void loseAllLeaves() {
        this.numLeaves = 0;
    }

    /**
     * Grows the tree.
     *
     * @param feet number of feet to grow
     */
    public void grow(final int feet) {
        this.height += feet;
    }

    /**
     * Overloaded grow method.
     *
     * @param leavesToAdd number of leaves to grow
     * @param feet number of feet to grow
     */
    public void grow(final int leavesToAdd, final int feet) {
        this.numLeaves += leavesToAdd;
        this.height += feet;
    }

    /**
     * Calculates the age of the tree.
     *
     * @return age of the tree
     */
    public int age() {
        int currentYear = 2025;
        return currentYear - this.yearPlanted;
    }

    /**
     * Gets the tree name.
     *
     * @return the name of the tree
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the height of the tree.
     *
     * @return the height in feet
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets the number of leaves.
     *
     * @return the number of leaves on the tree
     */
    public int getNumLeaves() {
        return numLeaves;
    }
}

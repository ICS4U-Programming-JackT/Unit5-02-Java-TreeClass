public final class Main {

    /** Private constructor to prevent instantiation. */
    private Main() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Create tree and call its methods.
     * @param args command-line arguments
     */
    public static void main(final String[] args) {

        // Create Tree
        Tree oak = new Tree("Oak", 2010);

        System.out.println("Tree name: " + oak.getName());
        System.out.println("Tree age: " + oak.age() + " years");
        System.out.println("Tree height: " + oak.getHeight() + " feet");
        System.out.println("Tree leaves: " + oak.getNumLeaves());

        // Growing (1 arg)
        oak.grow(5);
        System.out.println("\nAfter growing 5 feet:");
        System.out.println("Height: " + oak.getHeight());

        // Growing (2 args)
        oak.grow(200, 3);
        System.out.println("\nAfter growing leaves and height:");
        System.out.println("Height: " + oak.getHeight());
        System.out.println("Leaves: " + oak.getNumLeaves());

        // Losing all leaves
        oak.loseAllLeaves();
        System.out.println("\nAfter winter:");
        System.out.println("Leaves: " + oak.getNumLeaves());
    }
}

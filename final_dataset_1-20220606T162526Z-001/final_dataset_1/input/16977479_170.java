public static void main(String[] arguments) {
        try {
            run(arguments);
        } catch (Exception ex) {
            System.err.println("Error : " + ex.getMessage());
            System.err.println();
            System.exit(1);
        }
    }

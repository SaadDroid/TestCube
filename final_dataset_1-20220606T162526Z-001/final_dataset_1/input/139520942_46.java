public static void main(String[] args) {
        if (args.length != 1) {
            Console.exitError("You must provide an existing wallet file");
        } else {
            new WalletUpdater().run(args[0]);
        }
    }

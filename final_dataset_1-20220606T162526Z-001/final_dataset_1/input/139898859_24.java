static int execute(Arg arguments, PrintStream stream, PrintStream errorStream) {
        if (arguments == null) {
            return 2;
        }

        if (arguments.checkBcryptHash != null) { // verify mode
            BCrypt.Result result = BCrypt.verifyer().verify(arguments.password, arguments.checkBcryptHash);
            if (!result.validFormat) {
                System.err.println("Invalid bcrypt format.");
                return 3;
            }

            if (result.verified) {
                stream.println("Hash verified.");
            } else {
                errorStream.println("Provided hash does not verify against given password.");
                return 1;
            }
        } else { // hash mode
            byte[] salt = arguments.salt == null ? Bytes.random(16).array() : arguments.salt;
            byte[] hash = BCrypt.withDefaults().hash(arguments.costFactor, salt, charArrayToByteArray(arguments.password, StandardCharsets.UTF_8));
            stream.println(new String(hash, StandardCharsets.UTF_8));
        }
        return 0;
    }

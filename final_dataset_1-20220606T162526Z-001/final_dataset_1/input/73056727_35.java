public void exec() {
        if ("--help".equals(this.args[0])) {
            this.stdout.append("It is just a skeleton");
        } else {
            this.stdout.append("Usage: --help");
        }
    }

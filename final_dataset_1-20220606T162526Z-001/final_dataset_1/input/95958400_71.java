public Dollars charge() {
        int usage = readings[0].getAmount() - readings[1].getAmount();
        return charge(usage);
    }

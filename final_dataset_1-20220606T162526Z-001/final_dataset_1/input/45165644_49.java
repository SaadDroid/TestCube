@Override
    public String getWelcomeMessage(User user) {
        if (UserGroup.isPaid(user)) {
            return "You're amazing " + user + ". Thanks for paying for this awesome software.";
        }

        return "I suppose you can use this software.";
    }

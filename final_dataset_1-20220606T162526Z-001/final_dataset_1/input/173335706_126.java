protected boolean isAdmin(User user) {
        return user.getUserType() == UserType.ADMIN_USER;
    }

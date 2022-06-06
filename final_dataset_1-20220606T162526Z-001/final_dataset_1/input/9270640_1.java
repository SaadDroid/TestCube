public boolean isAuthor(){
        for (UserRoleType role : getRoles()) {
            if (role == UserRoleType.ROLE_AUTHOR){
                return true;
            }
        }
        return false;
    }

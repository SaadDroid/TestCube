public long addUser(final String login, final String fio, final String passwd, final String passwdAdd) throws UserCreationException {

        final UserInfo user = getUser(login);
        if (user != null) {
            throw new UserCreationException(UserCreationException.Type.ALREADY_EXISTS);
        }

        try {
            jdbcTemplate.update(
                    "insert into auth_user (login, fio, passwd_hash, passwd_add) " +
                            "values (?,?,?,?)",
                    login, fio, passwd, passwdAdd
            );
            return getLastInsertId();
        } catch (Exception e) {
            throw new UserCreationException(UserCreationException.Type.INTERNAL_ERROR);
        }
    }

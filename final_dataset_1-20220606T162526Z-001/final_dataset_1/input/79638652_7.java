@Override
    public AccessToken findAccessTokenByRefreshToken(String refreshToken, String clientId) {
        final String sql = " select * from oauth_access_token where refresh_token = ? and client_id = ? ";
        final List<AccessToken> list = jdbcTemplate.query(sql, accessTokenRowMapper, refreshToken, clientId);
        return list.isEmpty() ? null : list.get(0);
    }

public static String getProfileImageUrlHttps(User user, AvatarSize size) {
        if (user != null && user.profileImageUrlHttps != null) {
            final String url = user.profileImageUrlHttps;
            if (size == null || url == null) {
                return url;
            }

            switch (size) {
                case NORMAL:
                case BIGGER:
                case MINI:
                case ORIGINAL:
                case REASONABLY_SMALL:
                    return url
                            .replace(AvatarSize.NORMAL.getSuffix(), size.getSuffix());
                default:
                    return url;
            }
        } else {
            return null;
        }
    }

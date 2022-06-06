@Nullable
    public static String[] getUserAvatars(@Nullable final String avatar) {
        if (!isValidArtwork(avatar)) {
            return null;
        }

        final String replace;
        if (avatar.contains('/' + Constants.IMAGE_TEMPLATE_MEDIUM + '/')) {
            replace = '/' + Constants.IMAGE_TEMPLATE_MEDIUM + '/';
        } else if (avatar.contains('/' + Constants.IMAGE_TEMPLATE_SMALL + '/')) {
            replace = '/' + Constants.IMAGE_TEMPLATE_SMALL + '/';
        } else if (avatar.contains('/' + Constants.IMAGE_TEMPLATE_THUMB + '/')) {
            replace = '/' + Constants.IMAGE_TEMPLATE_THUMB + '/';
        } else if (avatar.contains('/' + Constants.IMAGE_TEMPLATE_THUMB_SMALL + '/')) {
            replace = '/' + Constants.IMAGE_TEMPLATE_THUMB_SMALL + '/';
        } else if (avatar.contains('/' + Constants.IMAGE_TEMPLATE_ORIGINAL + '/')) {
            replace = '/' + Constants.IMAGE_TEMPLATE_ORIGINAL + '/';
        } else {
            return new String[] { avatar };
        }

        return new String[] { avatar.replaceFirst(replace, '/' + Constants.IMAGE_TEMPLATE_THUMB + '/'),
                avatar.replaceFirst(replace, '/' + Constants.IMAGE_TEMPLATE_THUMB_SMALL + '/'),
                avatar.replaceFirst(replace, '/' + Constants.IMAGE_TEMPLATE_SMALL + '/'),
                avatar.replaceFirst(replace, '/' + Constants.IMAGE_TEMPLATE_MEDIUM + '/'),
                avatar.replaceFirst(replace, '/' + Constants.IMAGE_TEMPLATE_ORIGINAL + '/') };
    }

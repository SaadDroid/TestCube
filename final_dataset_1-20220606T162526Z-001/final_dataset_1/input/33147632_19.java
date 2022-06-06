public static boolean isAvailable(Context context) {
        final PackageManager pm = context.getPackageManager();
        return checkAppSignature(pm, TWITTER_PACKAGE_NAME, TWITTER_SIGNATURE) ||
                checkAppSignature(pm, DOGFOOD_PACKAGE_NAME, DOGFOOD_SIGNATURE);
    }

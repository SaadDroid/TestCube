public String convert(String input) {
        if (StringUtils.isEmpty(input)) {
            return StringUtils.EMPTY;
        }
        String result = null;
        switch (config.getMode()) {
        case NFKC:
            result = Normalizer.normalize(input, Normalizer.Form.NFKC);
            break;
        case HALF_TO_FULL:
            result = halfwidthToFullwidth(input);
            break;
        case FULL_TO_HALF:
            result = fullwidthToHalfwidth(input);
            break;
        default:
            break;
        }
        return result;
    }

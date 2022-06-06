@Override
    public Aspect<String> createAspect() {
        switch (captionType) {
            case AUTO:
                return StringUtils.isEmpty(staticCaption)
                        ? Aspect.of(NAME)
                        : Aspect.of(NAME, staticCaption);
            case DYNAMIC:
                return Aspect.of(NAME);
            case STATIC:
                return Aspect.of(NAME, staticCaption);
            case NONE:
                return Aspect.of(NAME, null);
            default:
                throw new IllegalArgumentException("CaptionType " + captionType + " is not supported.");
        }
    }

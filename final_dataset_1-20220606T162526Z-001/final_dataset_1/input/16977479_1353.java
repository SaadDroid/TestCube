public static List<MediaType> intersectMimeTypes(List<MediaType> requiredMediaTypes,
                                                     List<MediaType> userMediaTypes,
                                                     boolean addRequiredParamsIfPossible) {
        return intersectMimeTypes(requiredMediaTypes, userMediaTypes, addRequiredParamsIfPossible, false);
    }

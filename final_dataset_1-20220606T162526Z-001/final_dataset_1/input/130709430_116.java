public OutLog buildOutLog(Set<String> loggerNames, Method method) {
        Log.out logOut = annotationExtractor.findLogOut(method, loggerNames);
        if (nonNull(logOut)) {
            return buildOutLog(method, logOut);
        }
        Log log = annotationExtractor.findLog(method, loggerNames);
        if (nonNull(log)) {
            return buildOutLog(method, annotationExtractor.synthesizeLogOut(log));
        }
        return null;
    }

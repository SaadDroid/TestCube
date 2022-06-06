public InLog buildInLog(Set<String> loggerNames, Method method) {
        Log.in logIn = annotationExtractor.findLogIn(method, loggerNames);
        if (nonNull(logIn)) {
            return buildInLog(method, logIn);
        }
        Log log = annotationExtractor.findLog(method, loggerNames);
        if (nonNull(log)) {
            return buildInLog(method, annotationExtractor.synthesizeLogIn(log));
        }
        return null;
    }

public static String readExternalRef(String file, RefFormat refFormat, List<AuthorizationValue> auths,
                                         Path parentDirectory) {

        if (!RefUtils.isAnExternalRefFormat(refFormat)) {
            throw new RuntimeException("Ref is not external");
        }

        String result = null;

        try {
            if (refFormat == RefFormat.URL) {
                result = RemoteUrl.urlToString(file, auths);
            } else {
                //its assumed to be a relative file ref
                final Path pathToUse = parentDirectory.resolve(file).normalize();

                if(Files.exists(pathToUse)) {
                    result = readAll(pathToUse);
                } else {
                    String url = file;
                    if (url.contains("..")) {
                        int parentCount = 0;
                        while (url.contains("..")) {
                            url = url.substring(url.indexOf(".") + 2);
                            parentCount++;
                        }
                        for (int i = 0; i < parentCount - 1; i++) {
                            parentDirectory = parentDirectory.getParent();
                        }
                        url = parentDirectory + url;
                    } else {
                        url = parentDirectory + url.substring(url.indexOf(".") + 1);
                    }
                    final Path pathToUse2 = parentDirectory.resolve(url).normalize();

                    if(Files.exists(pathToUse2)) {
                        result = readAll(pathToUse2);
                    }
                }
                if (result == null){
                    result = ClasspathHelper.loadFileFromClasspath(file);
                }


            }
        } catch (Exception e) {
            throw new RuntimeException("Unable to load " + refFormat + " ref: " + file + " path: "+parentDirectory, e);
        }

        return result;

    }

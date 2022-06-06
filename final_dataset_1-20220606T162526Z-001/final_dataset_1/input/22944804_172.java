public void execute() throws MojoExecutionException {

        try {
            for (Inject inject : injects) {
                injectContent(inject);
            }
        } catch (IOException e) {
            getLog().error(e.getMessage(), e);
            throw new MojoExecutionException(e.getMessage(), e);
        }
    }

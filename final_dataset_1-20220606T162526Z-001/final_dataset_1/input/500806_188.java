@When("^build image \"([^\"]+)\" from file \"([^\"]+)\"$")
    public void buildImage(String imageTag, String fileName) {
        runner.when(docker().client(dockerClient)
                .buildImage()
                .tag(imageTag)
                .dockerFile(fileName)
                .validateCommandResult((result, context) -> context.setVariable(DockerMessageHeaders.IMAGE_ID, result.getImageId())));
    }

@POST
  @ZeppelinApi
  public Response createNote(String message) throws IOException {
    String user = authenticationService.getPrincipal();
    LOGGER.info("Creating new note by JSON {}", message);
    NewNoteRequest request = NewNoteRequest.fromJson(message);
    String defaultInterpreterGroup = request.getDefaultInterpreterGroup();
    if (StringUtils.isBlank(defaultInterpreterGroup)) {
      defaultInterpreterGroup = zConf.getString(ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_GROUP_DEFAULT);
    }
    Note note = notebookService.createNote(
            request.getName(),
            defaultInterpreterGroup,
            false,
            getServiceContext(),
            new RestServiceCallback<>());
    AuthenticationInfo subject = new AuthenticationInfo(authenticationService.getPrincipal());
    if (request.getParagraphs() != null) {
      for (NewParagraphRequest paragraphRequest : request.getParagraphs()) {
        Paragraph p = note.addNewParagraph(subject);
        initParagraph(p, paragraphRequest, user);
      }
    }
    return new JsonResponse(Status.OK, "", note.getId()).build();
  }

@POST
  @Path("run/{noteId}/{paragraphId}")
  @ZeppelinApi
  public Response runParagraphSynchronously(@PathParam("noteId") String noteId,
                                            @PathParam("paragraphId") String paragraphId,
                                            @QueryParam("sessionId") String sessionId,
                                            String message)
      throws IOException, IllegalArgumentException {
    LOGGER.info("Run paragraph synchronously {} {} {}", noteId, paragraphId, message);

    Note note = notebook.getNote(noteId);
    checkIfNoteIsNotNull(note);
    Paragraph paragraph = note.getParagraph(paragraphId);
    checkIfParagraphIsNotNull(paragraph);

    Map<String, Object> params = new HashMap<>();
    if (!StringUtils.isEmpty(message)) {
      ParametersRequest request =
              ParametersRequest.fromJson(message);
      params = request.getParams();
    }

    if (notebookService.runParagraph(noteId, paragraphId, paragraph.getTitle(),
            paragraph.getText(), params,
            new HashMap<>(), sessionId, false, true, getServiceContext(), new RestServiceCallback<>())) {
      note = notebookService.getNote(noteId, getServiceContext(), new RestServiceCallback<>());
      Paragraph p = note.getParagraph(paragraphId);
      InterpreterResult result = p.getReturn();
      return new JsonResponse<>(Status.OK, result).build();
    } else {
      return new JsonResponse<>(Status.INTERNAL_SERVER_ERROR, "Fail to run paragraph").build();
    }
  }

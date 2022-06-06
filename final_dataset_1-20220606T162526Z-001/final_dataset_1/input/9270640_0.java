@RequestMapping(method = RequestMethod.GET, value = ApiUrls.URL_SITE_PROFILES_USER_COMMENTS)
    public HttpEntity<PagedResources<PublicCommentResource>> getUserApprovedCommentPosts(
            @PathVariable("userId") String userId,
            @PageableDefault(size = UtilConstants.DEFAULT_RETURN_RECORD_COUNT, page = 0) Pageable pageable,
            PagedResourcesAssembler<CommentPost> assembler) throws ResourceNotFoundException {
        Page<CommentPost> commentPosts = this.commentPostRepository.findByAuthorIdAndStatusOrderByCreatedTimeDesc(
                userId, CommentStatusType.APPROVED, pageable);
        return new ResponseEntity<>(assembler.toResource(commentPosts, publicCommentResourceAssembler), HttpStatus.OK);
    }

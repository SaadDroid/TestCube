public static PageMetadata getAttachmentMetadata(String projectName, String branchName, String pagePath,
			String name) throws IOException {

		return pageStore.getAttachmentMetadata(projectName, branchName, pagePath, name);
	}

public void unsubscribe(String projectName, String branchName, String path, User user) throws IOException {
		ILockedRepository repo = null;
		try {
			repo = getOrCreateRepository(user);
			Set<Page> pages = getSubscriptions(user, repo);
			Page page = new Page(projectName, branchName, path);
			if (pages.remove(page)) {
				saveSubscriptions(user, pages, repo, true);
			}
		} catch (GitAPIException e) {
			throw new IOException(e);
		} finally {
			Util.closeQuietly(repo);
		}
	}

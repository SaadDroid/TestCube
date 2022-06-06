boolean isApplicable(String targetBranch, String commit) {
		Assert.hasLength(targetBranch);
		Assert.hasLength(commit);

		return targetBranch.equals(this.targetBranch) && commit.equals(this.commit);
	}

public static URI relativize(URI base, URI target) {
		Objects.requireNonNull(base,BASE_URI_CANNOT_BE_NULL);
		Objects.requireNonNull(target,TARGET_URI_CANNOT_BE_NULL);

		URI nTarget = target.normalize();
		if(areRelativizable(base,target)) {
			URI nBase=base.normalize();
			if(nBase.equals(nTarget)) {
				nTarget=URI.create(EMPTY);
			} else {
				URI walkthrough = absoluteRelativization(nBase,nTarget);
				if(!(walkthrough.getPath().startsWith(PARENT) && nTarget.getPath().isEmpty())) {
					nTarget=walkthrough;
				}
			}
		}
		return nTarget;
	}

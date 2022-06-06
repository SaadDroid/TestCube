public void setLeftMember(Canvas member) {
		String width = left.getWidthAsString();
		
		if (member == null) {
			left = buildLabel("")
					.setWidth("50%")
					.setHeight("100%")
					.build();
		}
		else {
			left = member;
			left.setWidth(width);
		}
		setMembers(left,right);
	}

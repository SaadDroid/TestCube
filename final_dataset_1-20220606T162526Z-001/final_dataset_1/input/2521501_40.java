public void setNorthMember(Canvas member) {
		if (member == null) {
			north.setHeight(0);
			north.setMembers();
		} else {
			member.setWidth("100%");
			north.setHeight(1);
			north.setMembers(member);
		}
	}

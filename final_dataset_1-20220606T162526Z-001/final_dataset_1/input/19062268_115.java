static ImmutableAlternative copyOf(Alternative predefined) {
		ImmutableAlternative result=null;
		if(predefined instanceof ImmutableAlternative) {
			result=(ImmutableAlternative)predefined;
		} else if(predefined!=null) {
			result=create(predefined.quality(),ImmutableVariant.copyOf(predefined));
		}
		return result;
	}

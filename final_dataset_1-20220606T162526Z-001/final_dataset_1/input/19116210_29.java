@Override
	public boolean canWrite(EvaluationContext context, Object target, String name) throws AccessException {
		if (target instanceof BaseObjectWithExts && name != null) {
			for (PropertyAccessor accessor : context.getPropertyAccessors()) {
				if (accessor instanceof ReflectivePropertyAccessor) {
					return !accessor.canWrite(context, target, name);
				}
			}
		}
		return false;
	}

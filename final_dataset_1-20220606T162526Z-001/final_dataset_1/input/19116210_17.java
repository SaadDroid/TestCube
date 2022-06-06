@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Object action = invocation.getAction();
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		Conversation conversation = getDefaultConversation(action, session);

		if (action instanceof ConversationAware) {
			((ConversationAware) action).setConversation(conversation);
		}

		for (Field field : getInheritedPrivateFields(action.getClass())) {
			if (field.isAnnotationPresent(ConversationScoped.class)) {
				ConversationScoped annotation = field.getAnnotation(ConversationScoped.class);
				String name = StringUtils.defaultIfEmpty(annotation.value(), field.getName());
				log.debug("setting value for {}", name);
				Object instance = conversation.get(field.getType(), name);
				field.setAccessible(true);
				field.set(action, instance);
			}
		}
		return invocation.invoke();
	}

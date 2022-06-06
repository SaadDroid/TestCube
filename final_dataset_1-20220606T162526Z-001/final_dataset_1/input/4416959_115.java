public Messages getMessages(ComponentModel componentModel, Locale locale)
    {
        return getMessages(componentModel, new ComponentResourceSelector(locale));
    }

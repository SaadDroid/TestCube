public void writeCharacters(java.lang.String text)
        throws XMLStreamException {
        currentTypeListener.processCharacters(text);
    }

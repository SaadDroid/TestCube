@Override
    public Message transform(Message message) {
        javax.xml.transform.Transformer transformer = null;
        
        try {
            DOMSource source = message.getContent(DOMSource.class);
            DOMResult result = new DOMResult();
            
            if (_transformerPool != null) {
                transformer = _transformerPool.take();
            } else {
                // if no pool is configured, then just create a new transformer for each request
                transformer = _templates.newTransformer();
                transformer.setErrorListener(new XsltTransformerErrorListener(_failOnWarning));
            }
            
            transformer.transform(source, result);
            message.setContent(((Document)result.getNode()).getDocumentElement());

        } catch (Exception e) {
            throw TransformMessages.MESSAGES.errorDuringXsltTransformation(e);
        } finally {
            if (_transformerPool != null && transformer != null) {
                _transformerPool.give(transformer);
            }
        }
        return message;
    }

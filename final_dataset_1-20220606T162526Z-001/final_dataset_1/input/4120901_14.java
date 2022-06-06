public boolean replacePropertyPlaceHolder(File workflowDescriptor, File workflowProperty)
			throws SpringHadoopAdminWorkflowException {
		boolean result = false;
		String parentFolder = workflowDescriptor.getParentFile().getAbsolutePath();
		parentFolder = parentFolder + File.separator;
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(workflowDescriptor));
			InputSource inputSource = new InputSource(bis);
			Document doc = this.documentLoader.loadDocument(inputSource, getEntityResolver(), this.errorHandler,
					XmlValidationModeDetector.VALIDATION_NONE, true);
			NodeList nodes = doc.getElementsByTagNameNS(springContextNameSpace, placePlaceHolderTagName);
			logger.debug("number of nodes:" + nodes.getLength());
			for (int i = 0, j = nodes.getLength(); i < j; i++) {
				Node node = nodes.item(i);
				if (node instanceof Element) {
					Element e = (Element) node;
					String newValue = workflowProperty.getAbsolutePath().replace("\\", "/");
					newValue = HadoopWorkflowUtils.fileURLPrefix + newValue;
					e.setAttribute("location", newValue);
					result = true;
					logger.debug("new location after replaced:" + newValue);
				}
			}
			if (result) {
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult out = new StreamResult(new File(workflowDescriptor.getAbsolutePath()));
				transformer.transform(source, out);
			}
		} catch (Exception e) {
			logger.warn(replacePropertyPlaceHolderFaiure);
			throw new SpringHadoopAdminWorkflowException(replacePropertyPlaceHolderFaiure, e);
		}
		return result;
	}

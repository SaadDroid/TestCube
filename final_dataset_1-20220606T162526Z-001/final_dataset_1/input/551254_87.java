XMLSetOutputDocument createSetOutputMessage(String taskId,
			XmlObject xmlPayload) {
		XMLSetOutputDocument setOutputDoc = XMLSetOutputDocument.Factory
				.newInstance();
		SetOutput setOutput = setOutputDoc.addNewSetOutput();
		setOutput.setIdentifier(taskId);
		XmlObject taskData = setOutput.addNewTaskData();
		taskData.set(xmlPayload);
		return setOutputDoc;
	}

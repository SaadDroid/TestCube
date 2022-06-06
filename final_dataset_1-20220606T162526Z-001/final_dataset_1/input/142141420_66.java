protected String getItemsetPreviewUrl(Node node) throws Exception {
    	
    		List<Relation> outRelations = node.getOutRelations();
    		if(CollectionUtils.isEmpty(outRelations)) {
    			return null;
    		}
    		List<String> itemSetRelations = outRelations.stream()
    				.filter(r -> StringUtils.equalsIgnoreCase(r.getEndNodeObjectType(), "ItemSet"))
    				.map(x -> x.getEndNodeId()).collect(Collectors.toList());
		if(CollectionUtils.isNotEmpty(itemSetRelations)){
			String questionBankHtml = itemsetPublishManager.publish(itemSetRelations);
			if(StringUtils.isNotBlank(questionBankHtml)) {
				if(ITEMSET_GENERATE_PDF) {
					Response generateResponse = HttpRestUtil.makePostRequest(PRINT_SERVICE_BASE_URL + "/v1/print/preview/generate?fileUrl=" 
							+ questionBankHtml, new HashMap<>(), new HashMap<>());
					
					if (generateResponse.getResponseCode() == ResponseCode.OK) {
			            String itemsetPreviewUrl = (String)generateResponse.getResult().get(ContentAPIParams.pdfUrl.name());
			            if(StringUtils.isNotBlank(itemsetPreviewUrl))
			            		return publishFinalizeUtil.uploadFile(itemsetPreviewUrl, node, basePath);
			            else
			                throw new ServerException(TaxonomyErrorCodes.SYSTEM_ERROR.name(),
			                        "Itemset generated previewUrl is empty. Please Try Again After Sometime!");
			        }else {
			            if (generateResponse.getResponseCode() == ResponseCode.CLIENT_ERROR) {
			                TelemetryManager.error("Client Error during Generate Itemset previewUrl: " + generateResponse.getParams().getErrmsg() + " :: " + generateResponse.getResult());
			                throw new ClientException(generateResponse.getParams().getErr(), generateResponse.getParams().getErrmsg());
			            }
			            else {
			                TelemetryManager.error("Server Error during Generate Itemset preiewUrl: " + generateResponse.getParams().getErrmsg() + " :: " + generateResponse.getResult());
			                throw new ServerException(TaxonomyErrorCodes.SYSTEM_ERROR.name(),
			                        "Error During generate Itemset previewUrl. Please Try Again After Sometime!");
			            }
			        }
				}else {
					return publishFinalizeUtil.uploadFile(questionBankHtml, node, basePath);
				}
				
			}
		}
    		return null;
    }

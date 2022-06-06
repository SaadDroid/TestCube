@Override
	public void annotate(JCas aJCas) throws AlignmentComponentException {
		
		try {

			logger.info("Started annotating a text and hypothesis pair using lexical aligner");
			
			// Get the tokens and lemmas of the text and hypothesis
			getTokenAnnotations(aJCas);
			
			// Check in all the resources for rules of type textPhrase -> hypoPhrase 
			for (LexicalResource<? extends RuleInfo> resource : lexicalResources) {
				
				LexicalResourceInformation resourceInfo = 
						lexicalResourcesInformation.get(resource.getClass().getName());
				
				// For every phrase t in T and phrase h in H, check the lexical
				// resources if they contain a rule t->h
				String textPhrase = "", hypoPhrase = "";
				
				for (int textStart = 0; textStart < textTokens.size(); ++textStart) {
					for (int textEnd = textStart; textEnd < Math.min(textTokens.size(), 
							textStart + maxPhrase); ++textEnd) {
						
						textPhrase = getPhrase(textTokens, textStart, textEnd, 
								resourceInfo.useLemma());
						
						for (int hypoStart = 0; hypoStart < hypoTokens.size(); ++hypoStart) {
							for (int hypoEnd = hypoStart; hypoEnd < Math.min(hypoTokens.size(), 
									hypoStart + maxPhrase); ++hypoEnd) {
								
								hypoPhrase = getPhrase(hypoTokens, hypoStart, hypoEnd, 
										resourceInfo.useLemma());
								
								// Get the rules textPhrase -> hypoPhrase
								List<LexicalRule<? extends RuleInfo>> ruleFromLeft = 
										getRules(resource, textPhrase, hypoPhrase,
												resourceInfo.getLeftSidePOS(), resourceInfo.getRightSidePOS());
								
								// Get the rules hypoPhrase -> textPhrase
								List<LexicalRule<? extends RuleInfo>> ruleFromRight = 
										getRules(resource, hypoPhrase, textPhrase,
												resourceInfo.getLeftSidePOS(), resourceInfo.getRightSidePOS());
								
								// Create the alignment links for the rules
								createAlignmentLinks(
										aJCas, textStart, textEnd,
										hypoStart, hypoEnd, ruleFromLeft, ruleFromRight,
										resourceInfo.getVersion());
							}
						}
					}
				}
			}
			
			logger.info("Finished annotating a text and hypothesis pair using lexical aligner");
			
		} catch (CASException | LexicalResourceException e) {
			
			throw new AlignmentComponentException(
					"LexicalAligner failed aligning the sentence pair.", e);
		} 		
	}

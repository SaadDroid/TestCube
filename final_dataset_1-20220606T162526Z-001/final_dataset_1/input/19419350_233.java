public static RuleViolation isInputStandard(TransactionInput input) {
        for (ScriptChunk chunk : input.getScriptSig().getChunks()) {
            if (chunk.data != null && !chunk.isShortestPossiblePushData())
                return RuleViolation.SHORTEST_POSSIBLE_PUSHDATA;
            if (chunk.isPushData()) {
                ECDSASignature signature;
                try {
                    signature = ECKey.ECDSASignature.decodeFromDER(chunk.data);
                } catch (SignatureDecodeException x) {
                    // Doesn't look like a signature.
                    signature = null;
                }
                if (signature != null) {
                    if (!TransactionSignature.isEncodingCanonical(chunk.data))
                        return RuleViolation.SIGNATURE_CANONICAL_ENCODING;
                    if (!signature.isCanonical())
                        return RuleViolation.SIGNATURE_CANONICAL_ENCODING;
                }
            }
        }
        return RuleViolation.NONE;
    }

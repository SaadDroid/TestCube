public static RLPObject rlpDecodeNextItem(ByteBuffer bb) {
	// detect object type
	RLPObject result=null;
    int objType = detectRLPObjectType(bb);
    switch (objType) {
	    case EthereumUtil.RLP_OBJECTTYPE_ELEMENT:
	    		result=EthereumUtil.decodeRLPElement(bb);
	    		break;
	    case EthereumUtil.RLP_OBJECTTYPE_LIST:
	    		result=EthereumUtil.decodeRLPList(bb);
	    		break;
	    default: LOG.error("Unknown object type");
    }
	return result;
}

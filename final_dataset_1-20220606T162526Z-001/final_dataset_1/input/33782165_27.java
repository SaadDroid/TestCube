public ScriptChunk getOpName() {
        switch(op) {
            case OP_NAME_FIRSTUPDATE:
            case OP_NAME_UPDATE:
                return args.get(0);
            
            default:
                throw new ScriptException("Not an AnyUpdate op");
        }
    }

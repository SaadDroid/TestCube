@Override
    protected boolean doAuthentication(KnightCredential credential) throws AuthenticationException {
        //不支持的凭据直接返回false.
        if(!this.supports(credential)){
            return false;
        }
        if(credential!=null && credential instanceof KnightEncryCredential){
            KnightEncryCredential encryCredential = (KnightEncryCredential)credential;
            try{
                //解密凭据信息。
                KnightCredentialInfo encryCredentialInfo = this.encryCredentialManager.decrypt(encryCredential);
                //设置凭据信息的关联性。
                if(encryCredentialInfo!=null){
                    encryCredential.setCredentialInfo(encryCredentialInfo);
                    //检查加密凭据的合法性。
                    return this.encryCredentialManager.checkEncryCredentialInfo(encryCredentialInfo);
                }
            }catch (InvalidEncryCredentialException e) {
                return false;
            }
        }
        return false;
    }

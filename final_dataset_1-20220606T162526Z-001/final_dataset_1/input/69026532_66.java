public byte[] toMD5(byte[] bytes) 
            throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        MessageDigest algorithm = MessageDigest.getInstance("MD5");
        algorithm.update(bytes);
        return algorithm.digest();
    }

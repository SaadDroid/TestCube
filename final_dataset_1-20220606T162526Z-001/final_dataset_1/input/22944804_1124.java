public static TreePolicyRequest getTreePolicyRequest(final Context context,
            final ActionRequest request, SSOTokenManager tokenManager) throws EntitlementException {
        return new TreePolicyRequestBuilder(context, request, tokenManager).build();
    }

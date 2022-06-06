@Override
    public void onNewUser(User user) {
        // New user, direct them to create an account with email/password
        // if account creation is enabled in SignInIntentBuilder

        TextInputLayout emailLayout = (TextInputLayout) findViewById(R.id.email_layout);

        if (mActivityHelper.getFlowParams().allowNewEmailAccounts) {
            RegisterEmailFragment fragment = RegisterEmailFragment.newInstance(
                    mActivityHelper.getFlowParams(),
                    user);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_register_email, fragment, RegisterEmailFragment.TAG);

            if (emailLayout != null) ft.addSharedElement(emailLayout, "email_field");

            ft.disallowAddToBackStack().commit();
        } else {
            emailLayout.setError(getString(R.string.error_email_does_not_exist));
        }
    }

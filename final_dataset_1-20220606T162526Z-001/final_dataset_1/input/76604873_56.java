@NonNull public SharedPreferences.OnSharedPreferenceChangeListener createOnChangeListener(@NonNull final PreferenceChangeCallback<T> callback) {
		return new SharedPreferences.OnSharedPreferenceChangeListener() {

			/**
			 */
			@Override public void onSharedPreferenceChanged(@NonNull final SharedPreferences sharedPreferences, @NonNull final String key) {
				if (SharedPreference.this.key.equals(key)) {
					// Ensure that we have always the actual value.
					valueIsActual = false;
					getFromPreferences(sharedPreferences);
					callback.onPreferenceChanged(SharedPreference.this);
				}
			}
		};
	}

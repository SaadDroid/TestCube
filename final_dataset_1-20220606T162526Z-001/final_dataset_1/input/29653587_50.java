private void setProgress(int progress) {
        mProgressBar.setProgress(progress);
        mProgressBar.setVisibility(progress == 100 ? GONE : VISIBLE);
        mButtonRefresh.setImageResource(progress == 100 ?
                R.drawable.ic_refresh_white_24dp : R.drawable.ic_clear_white_24dp);
    }

public void toggleWatchedIndicator(VideoContentInfo pi) {
    watchedView.setVisibility(View.INVISIBLE);

    if (pi.isPartiallyWatched()) {
      ImageUtils.toggleProgressIndicator(itemView, pi.getResumeOffset(), pi.getDuration());
      return;
    }

    if (pi.isWatched()) {
      watchedView.setImageResource(R.drawable.overlaywatched);
      watchedView.setVisibility(View.VISIBLE);
    }
  }

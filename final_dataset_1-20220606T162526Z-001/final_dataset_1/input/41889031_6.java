static int getMostCompactAudioIndex(@Nullable MediaFormat format,
                                        final List<AudioStream> audioStreams) {
        int result = -1;
        if (audioStreams != null) {
            while (result == -1) {
                AudioStream prevStream = null;
                for (int idx = 0; idx < audioStreams.size(); idx++) {
                    final AudioStream stream = audioStreams.get(idx);
                    if ((format == null || stream.getFormat() == format)
                            && (prevStream == null || compareAudioStreamBitrate(prevStream, stream,
                                    AUDIO_FORMAT_EFFICIENCY_RANKING) > 0)) {
                        prevStream = stream;
                        result = idx;
                    }
                }
                if (result == -1 && format == null) {
                    break;
                }
                format = null;
            }
        }
        return result;
    }

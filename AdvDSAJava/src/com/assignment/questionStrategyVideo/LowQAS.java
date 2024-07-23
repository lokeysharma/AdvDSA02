package com.assignment.questionStrategyVideo;

public class LowQAS implements QualityAdjustmentStrategy{
    @Override
    public VideoQuality supportsType() {
        return VideoQuality.LOW;
    }

    @Override
    public Video adjust(Video video) {
        video.setBitrate(500);
        video.setCodec(VideoCodec.H264);
        return video;
    }
}

package com.assignment.questionStrategyVideo;

public class QASFactory {

    public static QualityAdjustmentStrategy GetQASObject(VideoQuality videoQuality) {
        return switch (videoQuality) {
            case LOW -> new LowQAS();
            case MEDIUM -> new MediumQAS();
            case HIGH -> new HighQAS();
        };

    }
}

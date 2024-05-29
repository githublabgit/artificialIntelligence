package edu.umd.cs.findbugs.annotations;
/* loaded from: classes4.dex */
public enum Confidence {
    HIGH(1),
    MEDIUM(2),
    LOW(3),
    IGNORE(5);
    
    private final int confidenceValue;

    public static Confidence getConfidence(int i) {
        Confidence[] values;
        for (Confidence confidence : values()) {
            if (i <= confidence.confidenceValue) {
                return confidence;
            }
        }
        return IGNORE;
    }

    public int getConfidenceValue() {
        return this.confidenceValue;
    }

    Confidence(int i) {
        this.confidenceValue = i;
    }
}

package edu.umd.cs.findbugs.annotations;
@Deprecated
/* loaded from: classes4.dex */
public enum Priority {
    HIGH(1),
    MEDIUM(2),
    LOW(3),
    IGNORE(5);
    
    private final int priorityValue;

    public int getPriorityValue() {
        return this.priorityValue;
    }

    Priority(int i) {
        this.priorityValue = i;
    }
}

package me.xdrop.fuzzywuzzy;
/* loaded from: classes10.dex */
public interface ToStringFunction<T> {
    public static final ToStringFunction<String> NO_PROCESS = new ToStringFunction<String>() { // from class: me.xdrop.fuzzywuzzy.ToStringFunction.1
        @Override // me.xdrop.fuzzywuzzy.ToStringFunction
        public String apply(String str) {
            return str;
        }
    };

    String apply(T t);
}

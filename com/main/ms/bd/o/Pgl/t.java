package ms.bd.o.Pgl;

import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
final class t extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i, long j, String str, Object obj) throws Throwable {
        return pgla.a().b().getSharedPreferences(str, 0).getString((String) obj, null);
    }
}

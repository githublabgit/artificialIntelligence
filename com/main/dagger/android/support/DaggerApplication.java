package dagger.android.support;

import dagger.android.AndroidInjector;
/* loaded from: classes4.dex */
public abstract class DaggerApplication extends dagger.android.DaggerApplication {
    @Override // dagger.android.DaggerApplication
    protected abstract AndroidInjector<? extends DaggerApplication> applicationInjector();
}

package dagger.android.support;

import android.content.Context;
import androidx.fragment.app.Fragment;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;
import javax.inject.Inject;
/* loaded from: classes4.dex */
public abstract class DaggerFragment extends Fragment implements HasAndroidInjector {
    @Inject
    DispatchingAndroidInjector<Object> androidInjector;

    public DaggerFragment() {
    }

    public DaggerFragment(int i) {
        super(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Override // dagger.android.HasAndroidInjector
    public AndroidInjector<Object> androidInjector() {
        return this.androidInjector;
    }
}

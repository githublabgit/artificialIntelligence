package ai.bitlabs.sdk.data.model;

import ch.qos.logback.core.CoreConstants;
import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.gson.annotations.SerializedName;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Category.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lai/bitlabs/sdk/data/model/Category;", "", "name", "", "iconUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "getName", "component1", "component2", Constants.COPY_TYPE, "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Category {
    @SerializedName(CampaignEx.JSON_KEY_ICON_URL)
    private final String iconUrl;
    private final String name;

    public static /* synthetic */ Category copy$default(Category category, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = category.name;
        }
        if ((i & 2) != 0) {
            str2 = category.iconUrl;
        }
        return category.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final Category copy(String name, String iconUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        return new Category(name, iconUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Category) {
            Category category = (Category) obj;
            return Intrinsics.areEqual(this.name, category.name) && Intrinsics.areEqual(this.iconUrl, category.iconUrl);
        }
        return false;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.iconUrl.hashCode();
    }

    public String toString() {
        return "Category(name=" + this.name + ", iconUrl=" + this.iconUrl + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Category(String name, String iconUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.name = name;
        this.iconUrl = iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }
}

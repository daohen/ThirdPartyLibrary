# ThirdPartyLibrary
构建基本项目引用到的第三方项目

[![ThirdPartyLibrary](https://jitpack.io/v/daohen/thirdPartyLibrary.svg)](https://jitpack.io/#daohen/thirdPartyLibrary)


代码混淆
```java
# okhttp start
-dontwarn okio.**
-dontwarn javax.annotation.Nullable
-dontwarn javax.annotation.ParametersAreNonnullByDefault
# end

# retrofit start
-dontwarn okio.**
-dontwarn javax.annotation.**
# end

# glide start
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public class * extends com.bumptech.glide.AppGlideModule
-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}
# end
```
package util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by lenovo on 2018/5/24.
 */

public class GlideUtil {
    /**
     * 通过路径加载图片
     *
     * @param path
     * @param view
     */
    public static void loadImgPath(Context context, Object path, ImageView view) {
        Glide.with(context)
                .load(path)
//                .placeholder(R.mipmap.ic_launcher) //占位图
//                .dontAnimate().  //加载图片无动画
//                error(R.mipmap.ic_launcher)//加载错误
                .centerCrop().into(view);
    }
}

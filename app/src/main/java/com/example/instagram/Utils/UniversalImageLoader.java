package com.example.instagram.Utils;

import android.content.Context;

import com.example.instagram.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

public class UniversalImageLoader {
    private static final int defaultImage = R.drawable.ic_android;
    private Context mcontext;

    public UniversalImageLoader(Context mcontext) {
        this.mcontext = mcontext;
    }
public ImageLoaderConfiguration getConfig(){
    DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder().showImageOnLoading(defaultImage)
            .showImageForEmptyUri(defaultImage)
            .showImageOnFail(defaultImage)
            .cacheOnDisk(true).cacheInMemory(true)
            .cacheOnDisk(true).resetViewBeforeLoading(true)
            .imageScaleType(ImageScaleType.EXACTLY)
            .displayer(new FadeInBitmapDisplayer(300)).build();

    /*ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(mcontext)
            .defaultDisplayImageOptions(defaultImage)
    */
    return null;
}
}


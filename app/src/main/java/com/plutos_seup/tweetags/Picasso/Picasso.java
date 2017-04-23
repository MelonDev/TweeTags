package com.plutos_seup.tweetags.Picasso;

import android.content.Context;
import android.widget.ImageView;

import com.plutos_seup.tweetags.R;

/**
 * Created by androidworkspace on 4/21/2017 AD.
 */

public class Picasso {

    public static void downloadImage(Context context, String url, ImageView imageView){

        if (url != null &&  url.length()>0){
            com.squareup.picasso.Picasso.with(context).load(url).placeholder(R.drawable.test).into(imageView);
        }
        else {
            com.squareup.picasso.Picasso.with(context).load(R.drawable.test).into(imageView);
        }

    }


}

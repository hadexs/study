package com.binyu.xia.surpport;

import android.util.Log;

/**
 * User: hadexs
 * Date: 2016-02-29
 * Time: 23:19
 */
public class LogUitl {

    private static final String TAG = "pattern";

    public static void e(String msg) {
        if (msg != null) {
            Log.e(TAG, msg);
        }
    }

}  

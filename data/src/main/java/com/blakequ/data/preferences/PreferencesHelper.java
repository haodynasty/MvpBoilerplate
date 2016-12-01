package com.blakequ.data.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

import com.blakequ.data.injection.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Copyright (C) BlakeQu All Rights Reserved <blakequ@gmail.com>
 * <p>
 * Licensed under the blakequ.com License, Version 1.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * author  : quhao <blakequ@gmail.com> <br>
 * date     : 2016/11/30 20:37 <br>
 * last modify author : <br>
 * version : 1.0 <br>
 * description:
 */

@Singleton
public class PreferencesHelper {

    public static final String PREF_FILE_NAME = "android_blakequ_pref";

    private final SharedPreferences mPref;

    @Inject
    public PreferencesHelper(@ApplicationContext Context context) {
        mPref = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
    }

    public void clear() {
        mPref.edit().clear().apply();
    }

    /**
     * put string preferences
     *
     * @param context
     * @param key The name of the preference to modify
     * @param value The new value for the preference
     */
    public void putString(Context context, String key, String value) {
        try {
            SharedPreferences.Editor editor = mPref.edit();
            editor.putString(key, value);
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.FROYO){
                editor.apply();
            }else {
                editor.commit();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     * get string preferences
     *
     * @param context
     * @param key The name of the preference to retrieve
     * @return The preference value if it exists, or null. Throws ClassCastException if there is a preference with this
     *         name that is not a string
     * @see #getString(Context, String, String)
     */
    public String getString(Context context, String key) {
        return getString(context, key, null);
    }

    /**
     * get string preferences
     *
     * @param context
     * @param key The name of the preference to retrieve
     * @param defaultValue Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws ClassCastException if there is a preference with
     *         this name that is not a string
     */
    public String getString(Context context, String key, String defaultValue) {
        try {
            return mPref.getString(key, defaultValue);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return defaultValue;
    }

    /**
     * put int preferences
     *
     * @param context
     * @param key The name of the preference to modify
     * @param value The new value for the preference
     */
    public void putInt(Context context, String key, int value) {
        try {
            SharedPreferences.Editor editor = mPref.edit();
            editor.putInt(key, value);
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.FROYO){
                editor.apply();
            }else {
                editor.commit();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     * get int preferences
     *
     * @param context
     * @param key The name of the preference to retrieve
     * @return The preference value if it exists, or -1. Throws ClassCastException if there is a preference with this
     *         name that is not a int
     * @see #getInt(Context, String, int)
     */
    public int getInt(Context context, String key) {
        return getInt(context, key, -1);
    }

    /**
     * get int preferences
     *
     * @param context
     * @param key The name of the preference to retrieve
     * @param defaultValue Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws ClassCastException if there is a preference with
     *         this name that is not a int
     */
    public int getInt(Context context, String key, int defaultValue) {
        try {
            return mPref.getInt(key, defaultValue);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return defaultValue;
    }

    /**
     * put long preferences
     *
     * @param context
     * @param key The name of the preference to modify
     * @param value The new value for the preference
     */
    public void putLong(Context context, String key, long value) {
        try {
            SharedPreferences.Editor editor = mPref.edit();
            editor.putLong(key, value);
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.FROYO){
                editor.apply();
            }else {
                editor.commit();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     * get long preferences
     *
     * @param context
     * @param key The name of the preference to retrieve
     * @return The preference value if it exists, or -1. Throws ClassCastException if there is a preference with this
     *         name that is not a long
     * @see #getLong(Context, String, long)
     */
    public long getLong(Context context, String key) {
        return getLong(context, key, -1);
    }

    /**
     * get long preferences
     *
     * @param context
     * @param key The name of the preference to retrieve
     * @param defaultValue Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws ClassCastException if there is a preference with
     *         this name that is not a long
     */
    public long getLong(Context context, String key, long defaultValue) {
        try {
            return mPref.getLong(key, defaultValue);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return defaultValue;
    }

    /**
     * put float preferences
     *
     * @param context
     * @param key The name of the preference to modify
     * @param value The new value for the preference
     */
    public void putFloat(Context context, String key, float value) {
        try {
            SharedPreferences.Editor editor = mPref.edit();
            editor.putFloat(key, value);
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.FROYO){
                editor.apply();
            }else {
                editor.commit();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     * get float preferences
     *
     * @param context
     * @param key The name of the preference to retrieve
     * @return The preference value if it exists, or -1. Throws ClassCastException if there is a preference with this
     *         name that is not a float
     * @see #getFloat(Context, String, float)
     */
    public float getFloat(Context context, String key) {
        return getFloat(context, key, -1);
    }

    /**
     * get float preferences
     *
     * @param context
     * @param key The name of the preference to retrieve
     * @param defaultValue Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws ClassCastException if there is a preference with
     *         this name that is not a float
     */
    public float getFloat(Context context, String key, float defaultValue) {
        try {
            return mPref.getFloat(key, defaultValue);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return defaultValue;
    }

    /**
     * put boolean preferences
     *
     * @param context
     * @param key The name of the preference to modify
     * @param value The new value for the preference
     */
    public void putBoolean(Context context, String key, boolean value) {
        try {
            SharedPreferences.Editor editor = mPref.edit();
            editor.putBoolean(key, value);
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.FROYO){
                editor.apply();
            }else {
                editor.commit();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     * get boolean preferences, default is false
     *
     * @param context
     * @param key The name of the preference to retrieve
     * @return The preference value if it exists, or false. Throws ClassCastException if there is a preference with this
     *         name that is not a boolean
     * @see #getBoolean(Context, String, boolean)
     */
    public boolean getBoolean(Context context, String key) {
        return getBoolean(context, key, false);
    }

    /**
     * get boolean preferences
     *
     * @param context
     * @param key The name of the preference to retrieve
     * @param defaultValue Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws ClassCastException if there is a preference with
     *         this name that is not a boolean
     */
    public boolean getBoolean(Context context, String key, boolean defaultValue) {
        try {
            return mPref.getBoolean(key, defaultValue);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return defaultValue;
    }
}

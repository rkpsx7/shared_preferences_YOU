package com.example.shared_preferences_you;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceHelper {

    private static final String SHARED_PREFERENCE_DB_NAME = "com.xyz.r_database";

    public static SharedPreferences sharedPreferences(Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCE_DB_NAME, Context.MODE_PRIVATE);
    }
//storing integer in database
    public static void writeIntToPreferences(Context context, String key, int value) {
        SharedPreferences.Editor editor = sharedPreferences(context).edit();
        editor.putInt(key, value);
        editor.apply();
    }
    public static void writeLongToPreferences(Context context, String key, long value) {
        SharedPreferences.Editor editor = sharedPreferences(context).edit();
        editor.putLong(key, value);
        editor.apply();
    }

    //getting the integer value
    public static int getFromPreferences(Context context,String key){
       return sharedPreferences(context).getInt(key,0);
    }

    public static long getLongFromPreferences(Context context,String key){
        return sharedPreferences(context).getLong(key,0);
    }

    public static void writeStringToPreferences(Context context,String key,String value){
        SharedPreferences.Editor editor = sharedPreferences(context).edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getStringFromPreferences(Context context,String key){
        return sharedPreferences(context).getString(key,null);
    }

}


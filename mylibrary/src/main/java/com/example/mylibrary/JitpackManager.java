package com.example.mylibrary;

import android.util.Log;

public class JitpackManager {
    private JitpackManager(){}

    public static JitpackManager getInstance(){
        return JitpackManagerHolder.instance;
    }

    private static class JitpackManagerHolder{
        private static JitpackManager instance = new JitpackManager();
    }


    public void testPrint(String text){
        Log.e("lanzhu","testPrint");
    }
}

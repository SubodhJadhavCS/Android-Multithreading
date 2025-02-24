package com.asynktask.asynk_task;

import android.os.AsyncTask;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import java.lang.ref.WeakReference;

public class codinginflow {
//    Button button;
//    SeekBar seekBar;
//
//
//
//    public void start(View view)  {
//
//        // InsertAsynktask insertAsynktask = new InsertAsynktask();
//        // insertAsynktask.execute(10);
//
//    }
//
//
//
//
//    private static class  InsertAsynktask extends AsyncTask<Integer,Integer,String> {
//
//        private WeakReference<MainActivity> mainActivityWeakReference;
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//            MainActivity mainActivity = mainActivityWeakReference.get();
//            if(mainActivity == null || mainActivity.isFinishing()){
//
//                return;
//            }
//            mainActivity.seekBar.setVisibility(View.VISIBLE);
//        }
//
//        @Override
//        protected String doInBackground(Integer... integers) {
//            for(int i =0; i<integers[0];i++){
//                publishProgress( (i *100 )/integers[0]);
//
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            return "Finished";
//        }
//
//
//
//        @Override
//        protected void onPostExecute(String unused) {
//            super.onPostExecute(unused);
//            MainActivity mainActivity = mainActivityWeakReference.get();
//            if(mainActivity == null || mainActivity.isFinishing()){
//
//                return;
//            }
//            Toast.makeText(mainActivity,unused,Toast.LENGTH_LONG).show();
//            mainActivity. seekBar.setProgress(0);
//            mainActivity.seekBar.setVisibility(View.VISIBLE);
//        }
//
//
//        @Override
//        protected void onProgressUpdate(Integer... values) {
//            super.onProgressUpdate(values);
//            MainActivity mainActivity = mainActivityWeakReference.get();
//            if(mainActivity == null || mainActivity.isFinishing()){
//
//                return;
//            }
//            mainActivity.seekBar.setProgress(values[0]);
//        }
//    }
}

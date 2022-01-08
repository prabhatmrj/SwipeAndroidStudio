package com.example.calendarexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.gesture.Gesture;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {
        private static final String TAG="Swipe Position";
        private float x1,x2,y1,y2;
        private static int MIN_DISTANCE=150;
        private GestureDetector gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.gestureDetector=new GestureDetector(MainActivity.this,this);





    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {


        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
            x1=event.getX();
            y1=event.getY();
            break;


            case MotionEvent.ACTION_UP:
                x2=event.getX();
                y2=event.getY();


                float valuX=x2-x1;
                float valuY=y2-y1;

                if (Math.abs(valuX)>MIN_DISTANCE){
                    if (x2>x1){
                        Toast.makeText(this, "RigthSwipe", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this,HeaderToolBar.class));
                    }
                    else {
                        startActivity(new Intent(MainActivity.this,Test.class));
                        Toast.makeText(this, "leftSwipe", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (Math.abs(valuY)>MIN_DISTANCE){

                    if (y2>y1){

                        Toast.makeText(this, "bottom Swipe", Toast.LENGTH_SHORT).show();

                    }
                    else {
                        Toast.makeText(this, "TopSwipe", Toast.LENGTH_SHORT).show();

                    }

                }


        }
        return super.onTouchEvent(event);

    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }
}
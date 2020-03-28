package ysn.com.demo.activityanimutils;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import ysn.com.demo.activityanimutils.page.TestActivity;
import ysn.com.utils.activityanim.ActivityAnimUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout animLayout = findViewById(R.id.main_activity_layout);
        for (int i = 0; i < animLayout.getChildCount(); i++) {
            animLayout.getChildAt(i).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);

        switch (v.getId()) {
            case R.id.main_activity_zoom:
                ActivityAnimUtils.zoom(this);
                break;
            case R.id.main_activity_fade:
                ActivityAnimUtils.fade(this);
                break;
            case R.id.main_activity_windmill:
                ActivityAnimUtils.windmill(this);
                break;
            case R.id.main_activity_spin:
                ActivityAnimUtils.spin(this);
                break;
            case R.id.main_activity_diagonal:
                ActivityAnimUtils.diagonal(this);
                break;
            case R.id.main_activity_split:
                ActivityAnimUtils.split(this);
                break;
            case R.id.main_activity_shrink:
                ActivityAnimUtils.shrink(this);
                break;
            case R.id.main_activity_card:
                ActivityAnimUtils.card(this);
                break;
            case R.id.main_activity_in_and_out:
                ActivityAnimUtils.inAndOut(this);
                break;
            case R.id.main_activity_swipe_left:
                ActivityAnimUtils.swipeLeft(this);
                break;
            case R.id.main_activity_swipe_right:
                ActivityAnimUtils.swipeRight(this);
                break;
            case R.id.main_activity_slide_left:
                ActivityAnimUtils.slideLeft(this);
                break;
            case R.id.main_activity_slide_right:
                ActivityAnimUtils.slideRight(this);
                break;
            case R.id.main_activity_slide_down:
                ActivityAnimUtils.slideDown(this);
                break;
            case R.id.main_activity_slide_up:
                ActivityAnimUtils.slideUp(this);
                break;
            default:
                break;
        }
    }
}

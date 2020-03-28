package ysn.com.utils.activityanim;

import android.app.Activity;
import android.content.Context;

public class ActivityAnimUtils {

    public static void zoom(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_zoom_enter, R.anim.anim_zoom_exit);
    }

    public static void fade(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_fade_enter, R.anim.anim_fade_exit);
    }

    public static void windmill(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_windmill_enter, R.anim.anim_windmill_exit);
    }

    public static void spin(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_spin_enter, R.anim.anim_spin_exit);
    }

    public static void diagonal(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_diagonal_right_enter, R.anim.anim_diagonal_right_exit);
    }

    public static void split(Context context){
        ((Activity) context).overridePendingTransition(R.anim.anim_split_enter, R.anim.anim_split_exit);
    }

    public static void shrink(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_shrink_enter, R.anim.anim_shrink_exit);
    }

    public static void card(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_card_enter, R.anim.anim_card_exit);
    }

    public static void inAndOut(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_in_out_enter, R.anim.anim_in_out_exit);
    }

    public static void swipeLeft(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_swipe_left_enter, R.anim.anim_swipe_left_exit);
    }

    public static void swipeRight(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_swipe_right_enter, R.anim.anim_swipe_right_exit);
    }

    public static void slideLeft(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_slide_left_enter, R.anim.anim_slide_left_exit);
    }

    public static void slideRight(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
    }

    public static void slideDown(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_slide_down_enter, R.anim.anim_slide_down_exit);
    }

    public static void slideUp(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.anim_slide_up_enter, R.anim.anim_slide_up_exit);
    }
}
package com.zxl.zlibrary.tool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.support.annotation.CheckResult;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zxl.zlibrary.R;

import static com.zxl.zlibrary.tool.LTool.getContext;


/**
 * 在系统的Toast基础上封装
 */

@SuppressLint("InflateParams")
public class LToast {

    @ColorInt
    private static final int DEFAULT_TEXT_COLOR = Color.parseColor("#FFFFFF");

    @ColorInt
    private static final int ERROR_COLOR = Color.parseColor("#FD4C5B");

    @ColorInt
    private static final int INFO_COLOR = Color.parseColor("#3F51B5");

    @ColorInt
    private static final int SUCCESS_COLOR = Color.parseColor("#388E3C");

    @ColorInt
    private static final int WARNING_COLOR = Color.parseColor("#FFA900");

    private static final String TOAST_TYPEFACE = "sans-serif-condensed";

    private static android.widget.Toast currentToast;

    //*******************************************普通 使用ApplicationContext 方法*********************
    /**
     * LToast 替代方法 ：立即显示无需等待
     */
    private static android.widget.Toast mToast;

    public static void normal(@NonNull String message) {
        normal(getContext(), message, android.widget.Toast.LENGTH_SHORT, null, false).show();
    }

    public static void normal(@NonNull String message, Drawable icon) {
        normal(getContext(), message, android.widget.Toast.LENGTH_SHORT, icon, true).show();
    }

    public static void normal(@NonNull String message, int duration) {
        normal(getContext(), message, duration, null, false).show();
    }

    public static void normal(@NonNull String message, int duration, Drawable icon) {
        normal(getContext(), message, duration, icon, true).show();
    }

    public static android.widget.Toast normal(@NonNull String message, int duration, Drawable icon, boolean withIcon) {
        return custom(getContext(), message, icon, DEFAULT_TEXT_COLOR, duration, withIcon);
    }

    public static void warning(@NonNull String message) {
        warning(getContext(), message, android.widget.Toast.LENGTH_SHORT, true).show();
    }

    public static void warning(@NonNull String message, int duration) {
        warning(getContext(), message, duration, true).show();
    }

    public static android.widget.Toast warning(@NonNull String message, int duration, boolean withIcon) {
        return custom(getContext(), message, getDrawable(getContext(), R.drawable.ic_error_outline_white_48dp), DEFAULT_TEXT_COLOR, WARNING_COLOR, duration, withIcon, true);
    }

    public static void info(@NonNull String message) {
        info(getContext(), message, android.widget.Toast.LENGTH_SHORT, true).show();
    }

    public static void info(@NonNull String message, int duration) {
        info(getContext(), message, duration, true).show();
    }

    public static android.widget.Toast info(@NonNull String message, int duration, boolean withIcon) {
        return custom(getContext(), message, getDrawable(getContext(), R.drawable.ic_info_outline_white_48dp), DEFAULT_TEXT_COLOR, INFO_COLOR, duration, withIcon, true);
    }

    public static void success(@NonNull String message) {
        success(getContext(), message, android.widget.Toast.LENGTH_SHORT, true).show();
    }

    public static void success(@NonNull String message, int duration) {
        success(getContext(), message, duration, true).show();
    }

    public static android.widget.Toast success(@NonNull String message, int duration, boolean withIcon) {
        return custom(getContext(), message, getDrawable(getContext(), R.drawable.ic_check_white_48dp), DEFAULT_TEXT_COLOR, SUCCESS_COLOR, duration, withIcon, true);
    }

    public static void error(@NonNull String message) {
        error(getContext(), message, android.widget.Toast.LENGTH_SHORT, true).show();
    }
    //===========================================使用ApplicationContext 方法=========================

    //*******************************************常规方法********************************************

    public static void error(@NonNull String message, int duration) {
        error(getContext(), message, duration, true).show();
    }

    public static android.widget.Toast error(@NonNull String message, int duration, boolean withIcon) {
        return custom(getContext(), message, getDrawable(getContext(), R.drawable.ic_clear_white_48dp), DEFAULT_TEXT_COLOR, ERROR_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static android.widget.Toast normal(@NonNull Context context, @NonNull String message) {
        return normal(context, message, android.widget.Toast.LENGTH_SHORT, null, false);
    }

    @CheckResult
    public static android.widget.Toast normal(@NonNull Context context, @NonNull String message, Drawable icon) {
        return normal(context, message, android.widget.Toast.LENGTH_SHORT, icon, true);
    }

    @CheckResult
    public static android.widget.Toast normal(@NonNull Context context, @NonNull String message, int duration) {
        return normal(context, message, duration, null, false);
    }

    @CheckResult
    public static android.widget.Toast normal(@NonNull Context context, @NonNull String message, int duration, Drawable icon) {
        return normal(context, message, duration, icon, true);
    }

    @CheckResult
    public static android.widget.Toast normal(@NonNull Context context, @NonNull String message, int duration, Drawable icon, boolean withIcon) {
        return custom(context, message, icon, DEFAULT_TEXT_COLOR, duration, withIcon);
    }

    @CheckResult
    public static android.widget.Toast warning(@NonNull Context context, @NonNull String message) {
        return warning(context, message, android.widget.Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static android.widget.Toast warning(@NonNull Context context, @NonNull String message, int duration) {
        return warning(context, message, duration, true);
    }

    @CheckResult
    public static android.widget.Toast warning(@NonNull Context context, @NonNull String message, int duration, boolean withIcon) {
        return custom(context, message, getDrawable(context, R.drawable.ic_error_outline_white_48dp), DEFAULT_TEXT_COLOR, WARNING_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static android.widget.Toast info(@NonNull Context context, @NonNull String message) {
        return info(context, message, android.widget.Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static android.widget.Toast info(@NonNull Context context, @NonNull String message, int duration) {
        return info(context, message, duration, true);
    }

    @CheckResult
    public static android.widget.Toast info(@NonNull Context context, @NonNull String message, int duration, boolean withIcon) {
        return custom(context, message, getDrawable(context, R.drawable.ic_info_outline_white_48dp), DEFAULT_TEXT_COLOR, INFO_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static android.widget.Toast success(@NonNull Context context, @NonNull String message) {
        return success(context, message, android.widget.Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static android.widget.Toast success(@NonNull Context context, @NonNull String message, int duration) {
        return success(context, message, duration, true);
    }

    @CheckResult
    public static android.widget.Toast success(@NonNull Context context, @NonNull String message, int duration, boolean withIcon) {
        return custom(context, message, getDrawable(context, R.drawable.ic_check_white_48dp), DEFAULT_TEXT_COLOR, SUCCESS_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static android.widget.Toast error(@NonNull Context context, @NonNull String message) {
        return error(context, message, android.widget.Toast.LENGTH_SHORT, true);
    }

    //===========================================常规方法============================================

    @CheckResult
    public static android.widget.Toast error(@NonNull Context context, @NonNull String message, int duration) {
        return error(context, message, duration, true);
    }

    @CheckResult
    public static android.widget.Toast error(@NonNull Context context, @NonNull String message, int duration, boolean withIcon) {
        return custom(context, message, getDrawable(context, R.drawable.ic_clear_white_48dp), DEFAULT_TEXT_COLOR, ERROR_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static android.widget.Toast custom(@NonNull Context context, @NonNull String message, Drawable icon, @ColorInt int textColor, int duration, boolean withIcon) {
        return custom(context, message, icon, textColor, -1, duration, withIcon, false);
    }

    //*******************************************内需方法********************************************

    @CheckResult
    public static android.widget.Toast custom(@NonNull Context context, @NonNull String message, @DrawableRes int iconRes, @ColorInt int textColor, @ColorInt int tintColor, int duration, boolean withIcon, boolean shouldTint) {
        return custom(context, message, getDrawable(context, iconRes), textColor, tintColor, duration, withIcon, shouldTint);
    }

    @CheckResult
    public static android.widget.Toast custom(@NonNull Context context, @NonNull String message, Drawable icon, @ColorInt int textColor, @ColorInt int tintColor, int duration, boolean withIcon, boolean shouldTint) {
        if (currentToast == null) {
            currentToast = new android.widget.Toast(context);
        }
        final View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.toast_layout, null);
        final ImageView toastIcon = (ImageView) toastLayout.findViewById(R.id.toast_icon);
        final TextView toastTextView = (TextView) toastLayout.findViewById(R.id.toast_text);
        Drawable drawableFrame;

        if (shouldTint) {
            drawableFrame = tint9PatchDrawableFrame(context, tintColor);
        } else {
            drawableFrame = getDrawable(context, R.drawable.toast_frame);
        }
        setBackground(toastLayout, drawableFrame);

        if (withIcon) {
            if (icon == null)
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            setBackground(toastIcon, icon);
        } else
            toastIcon.setVisibility(View.GONE);

        toastTextView.setTextColor(textColor);
        toastTextView.setText(message);
        toastTextView.setTypeface(Typeface.create(TOAST_TYPEFACE, Typeface.NORMAL));

        currentToast.setView(toastLayout);
        currentToast.setDuration(duration);
        return currentToast;
    }

    public static final Drawable tint9PatchDrawableFrame(@NonNull Context context, @ColorInt int tintColor) {
        final NinePatchDrawable toastDrawable = (NinePatchDrawable) getDrawable(context, R.drawable.toast_frame);
        toastDrawable.setColorFilter(new PorterDuffColorFilter(tintColor, PorterDuff.Mode.SRC_IN));
        return toastDrawable;
    }
    //===========================================内需方法============================================


    //******************************************系统 LToast 替代方法***************************************

    public static final void setBackground(@NonNull View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN)
            view.setBackground(drawable);
        else
            view.setBackgroundDrawable(drawable);
    }

    public static final Drawable getDrawable(@NonNull Context context, @DrawableRes int id) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            return context.getDrawable(id);
        else
            return context.getResources().getDrawable(id);
    }

    /**
     * 封装了Toast的方法 :需要等待
     *
     * @param context Context
     * @param str     要显示的字符串
     * @param isLong  LToast.LENGTH_LONG / LToast.LENGTH_SHORT
     */
    public static void showToast(Context context, String str, boolean isLong) {
        if (isLong) {
            android.widget.Toast.makeText(context, str, android.widget.Toast.LENGTH_LONG).show();
        } else {
            android.widget.Toast.makeText(context, str, android.widget.Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 封装了Toast的方法 :需要等待
     */
    public static void showToastShort(String str) {
        android.widget.Toast.makeText(getContext(), str, android.widget.Toast.LENGTH_SHORT).show();
    }

    /**
     * 封装了Toast的方法 :需要等待
     */
    public static void showToastShort(int resId) {
        android.widget.Toast.makeText(getContext(), getContext().getString(resId), android.widget.Toast.LENGTH_SHORT).show();
    }

    /**
     * 封装了Toast的方法 :需要等待
     */
    public static void showToastLong(String str) {
        android.widget.Toast.makeText(getContext(), str, android.widget.Toast.LENGTH_LONG).show();
    }

    /**
     * 封装了Toast的方法 :需要等待
     */
    public static void showToastLong(int resId) {
        android.widget.Toast.makeText(getContext(), getContext().getString(resId), android.widget.Toast.LENGTH_LONG).show();
    }

    /**
     * LToast 替代方法 ：立即显示无需等待
     *
     * @param msg 显示内容
     */
    public static void showToast(String msg) {
        if (mToast == null) {
            mToast = android.widget.Toast.makeText(getContext(), msg, android.widget.Toast.LENGTH_LONG);
        } else {
            mToast.setText(msg);
        }
        mToast.show();
    }

    /**
     * LToast 替代方法 ：立即显示无需等待
     *
     * @param resId String资源ID
     */
    public static void showToast(int resId) {
        if (mToast == null) {
            mToast = android.widget.Toast.makeText(getContext(), getContext().getString(resId), android.widget.Toast.LENGTH_LONG);
        } else {
            mToast.setText(getContext().getString(resId));
        }
        mToast.show();
    }

    /**
     * LToast 替代方法 ：立即显示无需等待
     *
     * @param context  实体
     * @param resId    String资源ID
     * @param duration 显示时长
     */
    public static void showToast(Context context, int resId, int duration) {
        showToast(context, context.getString(resId), duration);
    }
    //===========================================LToast 替代方法======================================

    /**
     * LToast 替代方法 ：立即显示无需等待
     *
     * @param context  实体
     * @param msg      要显示的字符串
     * @param duration 显示时长
     */
    public static void showToast(Context context, String msg, int duration) {
        if (mToast == null) {
            mToast = android.widget.Toast.makeText(context, msg, duration);
        } else {
            mToast.setText(msg);
        }
        mToast.show();
    }
}

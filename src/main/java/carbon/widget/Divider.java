package carbon.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import carbon.Carbon;
import carbon.R;

/**
 * Created by Marcin on 2015-01-27.
 * <p/>
 * A very simple class of a divider. Just place it in your layout to get a material divider.
 */
public class Divider extends View {
    public Divider(Context context) {
        super(context, null, R.attr.carbon_dividerStyle);
        initDivider(null, R.attr.carbon_dividerStyle);
    }

    public Divider(Context context, AttributeSet attrs) {
        super(context, attrs, R.attr.carbon_dividerStyle);
        initDivider(attrs, R.attr.carbon_dividerStyle);
    }

    public Divider(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initDivider(attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public Divider(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initDivider(attrs, defStyleAttr);
    }

    private void initDivider(AttributeSet attrs, int defStyleAttr) {
        if (attrs == null)
            return;

        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.Divider, defStyleAttr, 0);
        int color = a.getColor(R.styleable.Divider_android_background, 0);
        setBackgroundColor(color);
        a.recycle();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), (int) Carbon.getDip(getContext()));
    }
}

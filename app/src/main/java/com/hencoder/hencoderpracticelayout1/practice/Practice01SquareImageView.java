package com.hencoder.hencoderpracticelayout1.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * 需要把它写成正方形的 ImageView
 * 重写 onMeasure() 来修改已有的 View 的尺寸；
 * 第一类自定义的具体做法
 * 也就是重写 onMeasure() 来修改已有的 View 的尺寸的具体做法：
 *
 * 重写 onMeasure() 方法，并在里面调用 super.onMeasure()，触发原有的自我测量；
 * 在 super.onMeasure() 的下面用 getMeasuredWidth() 和 getMeasuredHeight()
 * 来获取到之前的测量结果，并使用自己的算法，根据测量结果计算出新的结果；
 * 调用 setMeasuredDimension() 来保存新的结果。
 *
 * @author sgx
 */
public class Practice01SquareImageView extends ImageView {
    public Practice01SquareImageView(Context context) {
        super(context);
    }

    public Practice01SquareImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice01SquareImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 重写 onMeasure()，调整尺寸，让 ImageView 总是正方形
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        // 先用 getMeasuredWidth() 和 getMeasuredHeight() 取到 super.onMeasure() 的计算结果

        // 然后通过计算，让宽度和高度一致

        // 再用 setMeasuredDimension(width, height) 来保存最终的宽度和高度

        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int width = Math.min(measuredWidth,measuredHeight);
        setMeasuredDimension(width,width);
    }
}

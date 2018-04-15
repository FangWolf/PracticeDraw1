package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Path path = new Path();
        Paint paint = new Paint();
        //画坐标系
        path.moveTo(100, 50);
        path.lineTo(100, 600);
        path.rLineTo(800, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        canvas.drawPath(path, paint);
        //画直条
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        canvas.drawRect(120, 598, 220, 600, paint);
        canvas.drawRect(230, 580, 330, 600, paint);
        canvas.drawRect(340, 580, 440, 600, paint);
        canvas.drawRect(450, 400, 550, 600, paint);
        canvas.drawRect(560, 300, 660, 600, paint);
        canvas.drawRect(670, 200, 770, 600, paint);
        canvas.drawRect(780, 450, 880, 600, paint);
        //画字
        paint.setColor(Color.WHITE);
        paint.setTextSize(30);
        canvas.drawText("Froyo", 130, 630, paint);
        canvas.drawText("GB", 260, 630, paint);
        canvas.drawText("ICS", 370, 630, paint);
        canvas.drawText("JB", 480, 630, paint);
        canvas.drawText("KiKat", 580, 630, paint);
        canvas.drawText("L", 710, 630, paint);
        canvas.drawText("M", 820, 630, paint);
        paint.setTextSize(50);
        canvas.drawText("直方图", 450, 700, paint);

    }
}

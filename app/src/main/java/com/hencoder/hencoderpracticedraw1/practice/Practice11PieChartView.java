package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        //画标注
        Path path = new Path();
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextSize(30);
        canvas.drawText("Lollipop", 30, 50, paint);
        path.moveTo(150, 50);
        path.lineTo(250, 50);
        path.rLineTo(50, 50);
        canvas.drawPath(path, paint);
        canvas.drawText("KitKat", 50, 500, paint);
        path.moveTo(150, 500);
        path.lineTo(220, 500);
        path.rLineTo(50, -50);
        canvas.drawPath(path, paint);
        canvas.drawText("Marshmallow", 750, 150, paint);
        path.moveTo(730, 150);
        path.lineTo(630, 150);
        path.rLineTo(-50, 50);
        canvas.drawPath(path, paint);
        canvas.drawText("Gingerbread", 750, 330, paint);
        path.moveTo(730, 330);
        path.lineTo(630, 330);
        canvas.drawPath(path, paint);
        canvas.drawText("Ice Cream Sandwich", 750, 400, paint);
        path.moveTo(730, 400);
        path.lineTo(700, 400);
        path.rLineTo(-30, -30);
        path.rLineTo(-30, 0);
        canvas.drawPath(path, paint);
        canvas.drawText("Jelly Bean", 750, 500, paint);
        path.moveTo(730, 500);
        path.lineTo(600, 500);
        path.rLineTo(-50, -50);
        canvas.drawPath(path, paint);
        paint.setTextSize(50);
        canvas.drawText("饼图", 400, 700, paint);
        //画饼
        paint.setAntiAlias(false);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawArc(140, 40, 640, 540, -60, -120, true, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(150, 50, 650, 550, 0, -60, true, paint);
        paint.setColor(Color.CYAN);
        canvas.drawArc(150, 50, 650, 550, 3, 7, true, paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(150, 50, 650, 550, 13, 7, true, paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(150, 50, 650, 550, 23, 57, true, paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(150, 50, 650, 550, 83, 97, true, paint);
    }
}

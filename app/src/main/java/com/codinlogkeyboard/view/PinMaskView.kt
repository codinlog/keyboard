package com.codinlogkeyboard.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

class PinMaskView : View {

    private var mMaskText = "*"
    private var mMaskNum = 6
    private var mDirtyRect: Rect? = null
    private var mPosition = -1

    constructor(context: Context) : super(context)

    constructor(context: Context, attrSet: AttributeSet) : super(context, attrSet)

    constructor(context: Context, attrSet: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrSet,
        defStyleAttr
    )

    constructor(
        context: Context,
        attrSet: AttributeSet,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrSet, defStyleAttr, defStyleRes)


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

    }

    private fun drawText(canvas: Canvas?){

    }

    private fun drawBorder(canvas: Canvas?){

    }

    fun fillNext(){
        mPosition++
        invalidate()
    }

    fun clearPrev(){
        mPosition--
        invalidate()
    }


}
package com.codinlogkeyboard

import android.content.Context
import android.graphics.PixelFormat
import android.inputmethodservice.Keyboard
import android.inputmethodservice.KeyboardView
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.PopupWindow
import com.codinlogkeyboard.databinding.PinInputFragmentDataBinding
import com.codinlogkeyboard.databinding.ViewKeyboardDataBinding

private const val TAG = "PinInputFragment"
class PinInputFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = PinInputFragmentDataBinding.inflate(inflater, container, false)
        binding.setOnOpenPopWinClicked {
            val keyboardBinding =
                ViewKeyboardDataBinding.inflate(LayoutInflater.from(KeyboardApplication.CTX))

            val keyboard = Keyboard(KeyboardApplication.CTX, R.xml.keyboard_number)
            keyboard.isShifted = false
            keyboardBinding.keyboardView.keyboard = keyboard
            keyboardBinding.keyboardView.isPreviewEnabled = false


            keyboardBinding.keyboardView.setOnKeyboardActionListener(object :KeyboardView.OnKeyboardActionListener{
                override fun onPress(p0: Int) {

                }

                override fun onRelease(p0: Int) {
                }

                override fun onKey(p0: Int, p1: IntArray?) {
                }

                override fun onText(p0: CharSequence?) {
                }

                override fun swipeLeft() {
                }

                override fun swipeRight() {
                }

                override fun swipeDown() {
                }

                override fun swipeUp() {
                }

            })
            val winmgr =
                KeyboardApplication.CTX.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val layoutParams = WindowManager.LayoutParams(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT
            )
            layoutParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY
            layoutParams.gravity = Gravity.BOTTOM
            winmgr.addView(keyboardBinding.root, layoutParams)
        }
        return binding.root
    }

    companion object {

    }
}
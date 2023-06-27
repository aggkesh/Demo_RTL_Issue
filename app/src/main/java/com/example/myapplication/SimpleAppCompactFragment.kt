package com.example.myapplication

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDialogFragment

class SimpleAppCompactFragment : AppCompatDialogFragment() {
    private val TAG = SimpleAppCompactFragment::class.java.name
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setCancelable(true)
        if (dialog.window != null)
        {
            Log.d(TAG, "Yes I am not null")
        }
        dialog.window?.setGravity(Gravity.BOTTOM or Gravity.END)
        return dialog
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.simple_dialog_fragment, null, false)
    }
}
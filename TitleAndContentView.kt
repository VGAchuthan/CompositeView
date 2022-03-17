package com.example.notes

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView

class TitleAndContentView @JvmOverloads
constructor(private val ctx: Context, private val attributeSet: AttributeSet, private val defStyleAttr: Int = 0):
    RelativeLayout(ctx,attributeSet,defStyleAttr) {
    private lateinit var titleView : EditText
    private lateinit var contentsView : EditText
        init {
            LayoutInflater.from(ctx).inflate(R.layout.title_and_content_view, this, true)
        }

    override fun onFinishInflate() {
        super.onFinishInflate()
        titleView = findViewById(R.id.notes_detail_edittext_title)
        contentsView = findViewById(R.id.notes_detail_edittext_context)
    }
    fun setTitleAndContent(title : String, content : String){
        titleView.setText(title, TextView.BufferType.EDITABLE)
        contentsView.setText(content, TextView.BufferType.EDITABLE)
    }
    fun getTitleView() : EditText = titleView
    fun getContentView() : EditText = contentsView
}
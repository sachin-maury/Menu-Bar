package com.hedroid.menubar

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class CustomMenu {
    fun customMenu(context: Context, view:View) {
         val pop = PopupMenu(context,view)
         pop.inflate(R.menu.menu)
         pop.setOnMenuItemClickListener {
             when(it!!.itemId){
                 R.id.edit -> { Toast.makeText(context,"Click Edit",Toast.LENGTH_SHORT).show()
                 true
                 }
                 R.id.delete -> { Toast.makeText(context,"Click Delete",Toast.LENGTH_SHORT).show()
                 true
                 }
                 R.id.share -> { Toast.makeText(context,"Click Share",Toast.LENGTH_SHORT).show()
                 true
                 }
                 else -> false
             }
         }
        try {
            val fieldMpopup = PopupMenu ::class.java.getField("mPopup")
            fieldMpopup.isAccessible= true
            val mPopup =fieldMpopup.get(pop)
            mPopup.javaClass
                .getDeclaredMethod("setFoeceShowIcon",Boolean::class.java)
                .invoke(mPopup,true)
        }
        catch (e:Exception){
             pop.show()
        }
        finally {
            pop.show()
        }
    }
}
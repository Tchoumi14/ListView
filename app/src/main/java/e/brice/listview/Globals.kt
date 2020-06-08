package e.brice.listview

import android.graphics.Bitmap

class Globals {

    companion object Chosen{
        var choosenImage : Bitmap? = null
        fun returnImage():Bitmap{
            return choosenImage!!
        }
    }
  //  var choosenImage : Bitmap? = null
}
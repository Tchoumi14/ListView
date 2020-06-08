package e.brice.listview

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var names = ArrayList<String>()
        names.add("Kontakt")
        names.add("Nutzungbedingungen")

        names.add("Datenschutzerklarung")

        val kontakt = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.unnamed)
        val brice = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.unnamed)
        val daten = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.wannabe)

        val images = ArrayList<Bitmap>()
        images.add(kontakt)
        images.add(brice)
        images.add(daten)

        var arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)

        listView.adapter = arrayAdapter
        val MyWebView: WebView = findViewById(R.id.myURL)

        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
            if (position == 1) {
                val intent = Intent(this, Main2Activity::class.java)
            }
//            intent.putExtra("name",names[position])
//
//            val bitmap = images[position]
//
//            val chosen = Globals.Chosen
//            chosen.choosenImage = bitmap


            startActivity(intent)
        }

    }
}

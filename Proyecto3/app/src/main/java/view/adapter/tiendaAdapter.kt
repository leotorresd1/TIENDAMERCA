package view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.proyecto3.R

class tiendaAdapter: RecyclerView.Adapter<tiendaAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i:Int): ViewHolder{
        val v=LayoutInflater.from(viewGroup.context).inflate(R.layout.card_view_tienda, viewGroup, false)
        return ViewHolder(v)
    }

        inner class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
            var itemImage: ImageView
            var itemTitle: TextView
            var itemPrecio: TextView
            var itemDetalle: TextView

            init{
                itemImage=ItemView.findViewById(R.id.image)
                itemTitle=ItemView.findViewById(R.id.title)
                itemPrecio=ItemView.findViewById(R.id.title)
                itemDetalle=ItemView.findViewById(R.id.title)
            }

        }

    val titles= arrayOf("Aguacate", "Arveja", "Banano", "J. Rey", "Fab", "Esponja", "Jamón", "Leche E.", "Naranja")
    val precio= arrayOf("$3000", "$5000", "$1500", "$2000", "$8000", "$1000", "$7500", "$3000.", "$2500")
    val detalle= arrayOf("Descuento 5%", "Sin descuento", "Descuento 10%", "Sin descuento", "Descuento 5%", "Descuento 5%", "Descuento 10%", "Sin descuento.", "Descuento 10%")
    val image= arrayOf(R.drawable.aguacate, R.drawable.arveja, R.drawable.banano, R.drawable.elrey, R.drawable.fabliquido, R.drawable.esponja, R.drawable.jamon, R.drawable.lecheentera, R.drawable.naranja)

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int){
        viewHolder.itemTitle.text=titles[i]
        viewHolder.itemPrecio.text=precio[i]
        viewHolder.itemDetalle.text=detalle[i]
        viewHolder.itemImage.setImageResource(image[i])
    }

    override fun getItemCount(): Int {
        return titles.size
        }
}
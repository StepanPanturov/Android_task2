import com.example.android_task2.Capital
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android_task2.R



class CapitalAdapter(private val capitals: List<Capital>, private val onItemClick: (Capital) -> Unit) :
    RecyclerView.Adapter<CapitalAdapter.CapitalViewHolder>() {

    class CapitalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.title)
        val info: Button = itemView.findViewById(R.id.info)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CapitalViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.capital_item, parent, false)
        return CapitalViewHolder(view)
    }

    override fun onBindViewHolder(holder: CapitalViewHolder, position: Int) {
        val capital = capitals[position]
        holder.title.text = capital.title
        holder.info.setOnClickListener { onItemClick(capital) }
    }

    override fun getItemCount(): Int = capitals.size
}

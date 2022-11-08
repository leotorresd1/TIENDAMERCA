package view.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto3.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import view.adapter.tiendaAdapter

class TiendaFragment : Fragment() {
    lateinit var recyclerTie:RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_tienda, container, false)
        recyclerTie=view.findViewById(R.id.recyclerview)
        val adapter=tiendaAdapter()
        recyclerTie.layoutManager=LinearLayoutManager(context)
        recyclerTie.adapter=adapter
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btm=view.findViewById<BottomNavigationView>(R.id.buttomnavegation)
        btm.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.home -> findNavController().navigate(R.id.action_tiendaFragment_to_homeFragment)
                R.id.perfil -> findNavController().navigate(R.id.action_tiendaFragment_to_perfilFragment)
                R.id.compra -> findNavController().navigate(R.id.action_tiendaFragment_to_compraFragment)

            }
        }
    }
}

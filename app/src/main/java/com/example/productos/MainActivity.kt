package com.example.productos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private  var listaProductos:MutableList<dtProductos> = mutableListOf()
    private lateinit var recycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaProductos.add(
            dtProductos("001","Camiseta basica","$100","$50"))
        listaProductos.add(
            dtProductos("002","Pantalones vaqueros","$150","$100"))
        listaProductos.add(
            dtProductos("003","Zapatillas","$79.99","$39.99"))
        listaProductos.add(
            dtProductos("004","Chaqueta","$49.99","$39.99"))
        listaProductos.add(
            dtProductos("005","Falda lisa","$24.99","$19.99"))
        listaProductos.add(
            dtProductos("006","Camisa","$34.99","$29.99"))
        listaProductos.add(
            dtProductos("007","Sudadera","$50","$30"))
        listaProductos.add(
            dtProductos("008","Pantalones cortos","$200","$150"))
        listaProductos.add(
            dtProductos("009","Vestido floral","$39.99","$34.99"))
        listaProductos.add(
            dtProductos("010","Calsetines","$29.99","$19.99"))
        listaProductos.add(
            dtProductos("011","Gorra","$600","$500"))
        listaProductos.add(
            dtProductos("012","Gafas","$45","$30"))
        listaProductos.add(
            dtProductos("013","Bufanda","$87.99","$65.99"))
        listaProductos.add(
            dtProductos("014","Gafas de sol","$65","$45"))
        listaProductos.add(
            dtProductos("015","Chaqueta azul","$78.99","$40"))
        listaProductos.add(
            dtProductos("016","Short dama ","$50","$30"))
        listaProductos.add(
            dtProductos("017","Blusa corta","$65","$55"))
        listaProductos.add(
            dtProductos("018","Bolsa","$100","$50"))
        listaProductos.add(
            dtProductos("019","Reloj","$800","$500"))
        listaProductos.add(
            dtProductos("020","Mause","$180","$100"))
        var tabla = findViewById<RecyclerView>(R.id.tablaPoductos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=ProductosAdapter(this,listaProductos)


    }
}
package com.rozie.placesofinterest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val place = arrayListOf<Place>()
    private val placesAdapter = PlaceAdapter(place)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        rvPlaces.layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
        rvPlaces.adapter = placesAdapter


        for (i in Place.PLACE_NAMES.indices) {
            place.add(Place(Place.PLACE_NAMES[i], Place.PLACE_RES_DRAWABLE_IDS[i]))
        }
        placesAdapter.notifyDataSetChanged()

    }
}
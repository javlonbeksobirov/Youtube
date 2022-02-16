package com.b12game.youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.b12game.youtube.adapter.FeedAdapter
import com.b12game.youtube.adapter.FilterAdapter
import com.b12game.youtube.model.Feed
import com.b12game.youtube.model.Filter

class MainActivity : AppCompatActivity() {
    lateinit var recyclerFeed: RecyclerView
    lateinit var recyclerFilter: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerFilter = findViewById(R.id.recyclerView)
        recyclerFilter.setLayoutManager(LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false))
        recyclerFeed = findViewById(R.id.recylerFeed)
        recyclerFeed.setLayoutManager(GridLayoutManager(this,1))

        refreshFeedAdapter(getAllFeeds())
        refreshFilterAdapter(getAllFilters())

    }

    fun refreshFilterAdapter(filter: ArrayList<Filter>){
        val adapter = FilterAdapter(this,filter)
        recyclerFilter.adapter = adapter
    }

    fun refreshFeedAdapter(feeds: ArrayList<Feed>){
        val adapter = FeedAdapter(this,feeds)
        recyclerFeed.adapter = adapter

    }

    fun getAllFilters():ArrayList<Filter>{
        val filter: ArrayList<Filter> = ArrayList()
        filter.add(Filter("Computer Programming"))
        filter.add(Filter("Computer Programming"))
        filter.add(Filter("Computer Programming"))
        filter.add(Filter("Computer Programming"))
        filter.add(Filter("Computer Programming"))
        return filter

    }

    fun getAllFeeds():ArrayList<Feed>{
        val feeds: ArrayList<Feed> = ArrayList()
        feeds.add(Feed(R.drawable.im_profile,R.drawable.ic_launcher_background))
        feeds.add(Feed(R.drawable.im_profile,R.drawable.ic_launcher_background))
        feeds.add(Feed(R.drawable.im_profile,R.drawable.ic_launcher_background))
        feeds.add(Feed(R.drawable.im_profile,R.drawable.ic_launcher_background))
        feeds.add(Feed(R.drawable.im_profile,R.drawable.ic_launcher_background))
        return feeds

    }

}
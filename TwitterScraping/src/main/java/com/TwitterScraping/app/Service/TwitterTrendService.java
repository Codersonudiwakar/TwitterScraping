package com.TwitterScraping.app.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TwitterScraping.app.entity.TwitterTrend;
import com.TwitterScraping.app.entity.TwitterTrendDto;
import com.TwitterScraping.app.repo.TwitterTrendRepository;


@Service
public class TwitterTrendService{

    @Autowired
    private TwitterTrendRepository repository;

    public TwitterTrend saveTrends(TwitterTrendDto trends) {
    	TwitterTrendConverter cnvt=new TwitterTrendConverter();
        TwitterTrend trend=cnvt.toEntity(trends);
        return repository.save(trend);
    }

    public List<TwitterTrend> getAllTrends() {
        return repository.findAll();
    }
}
package com.TwitterScraping.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.TwitterScraping.app.entity.TwitterTrend;


@Repository
public interface TwitterTrendRepository extends MongoRepository<TwitterTrend, String> {
}
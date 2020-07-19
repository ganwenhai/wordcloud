package com.wangyiyun.wordcloud.service;

import com.wangyiyun.wordcloud.model.Artist;
import com.wangyiyun.wordcloud.model.Song;

public interface SongCrawlerService {

    // 根据歌单id，抓取数据
    void start(String artistId);
    // 根据歌单id查询歌单
    Artist getArtist(String artistId);
    // 根据歌单id和歌曲id查询歌曲
    Song getSong(String artistId, String songId);

}

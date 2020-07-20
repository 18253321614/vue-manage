package com.baiding.vue.service;

import com.baiding.vue.model.BaseStatusParam;
import com.baiding.vue.model.Page;
import com.baiding.vue.model.Result;
import com.baiding.vue.model.vo.AlbumTrackParam;
import com.baiding.vue.model.vo.AlbumTrackQueryCondition;

import java.util.List;

/**
 * @Author: BaiDing
 * @Date: 2018/10/18 11:16
 * @Email: liujiabaiding@foxmail.com
 */
public interface AlbumTrackService {

    Page<AlbumTrackParam> getAllAlbumTrack(AlbumTrackQueryCondition condition);

//    AlbumTrackParam getAlbumTrack(Long id);

    Result addAlbumTrack(AlbumTrackParam albumTrackParam);

    Result editAlbumTrack(AlbumTrackParam albumTrackParam);

    Result editAlbumTrackStatus(BaseStatusParam param);

    Result batcheditAlbumTrackStatus(List<Long> idList, Integer removed);
}

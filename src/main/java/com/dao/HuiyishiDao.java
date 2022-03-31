package com.dao;

import com.entity.HuiyishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyishiVO;
import com.entity.view.HuiyishiView;


/**
 * 会议室
 * 
 * @author 
 * @email 
 * @date 2021-11-30 14:36:35
 */
public interface HuiyishiDao extends BaseMapper<HuiyishiEntity> {
	
	List<HuiyishiVO> selectListVO(@Param("ew") Wrapper<HuiyishiEntity> wrapper);
	
	HuiyishiVO selectVO(@Param("ew") Wrapper<HuiyishiEntity> wrapper);
	
	List<HuiyishiView> selectListView(@Param("ew") Wrapper<HuiyishiEntity> wrapper);

	List<HuiyishiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyishiEntity> wrapper);
	
	HuiyishiView selectView(@Param("ew") Wrapper<HuiyishiEntity> wrapper);
	
}

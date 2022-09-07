package com.oe.mapper;

import java.util.List;

import com.oe.domain.MarketBoardVO;

public interface MarketBoardMapper {
	
	public List<MarketBoardVO> getListBoard();
	public MarketBoardVO read(Long bo_num);
	public int insert(MarketBoardVO vo);

}

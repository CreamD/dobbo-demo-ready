package com.wujianguang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wujianguang.dao.ArticleMapper;
import com.wujianguang.domain.Article;
import com.wujianguang.domain.ArticleWithBLOBs;
import com.wujianguang.domain.Vo;
import com.wujianguang.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleMapper articleMapper;

	@Override
	public ArticleWithBLOBs selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return articleMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Article> list(Vo vo) {
		// TODO Auto-generated method stub
		return articleMapper.list(vo);
	}
}

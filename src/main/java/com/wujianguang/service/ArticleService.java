package com.wujianguang.service;



import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wujianguang.domain.Article;
import com.wujianguang.domain.ArticleWithBLOBs;
import com.wujianguang.domain.Vo;

public interface ArticleService {

	ArticleWithBLOBs selectByPrimaryKey(Integer id);
	

	List<Article> list(Vo vo);

}

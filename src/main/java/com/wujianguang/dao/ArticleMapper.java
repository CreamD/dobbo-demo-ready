package com.wujianguang.dao;

import java.util.List;
import com.wujianguang.domain.Article;
import com.wujianguang.domain.ArticleWithBLOBs;
import com.wujianguang.domain.Vo;

public interface ArticleMapper {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询文章
	 * @param article
	 * @return
	 * @return: List<Article>
	 */
	List<Article> selects(Article article);
	
	List<Article> all();

    ArticleWithBLOBs selectByPrimaryKey(Integer id);


	List<Article> list(Vo vo);
}
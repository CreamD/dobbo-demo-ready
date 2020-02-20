package com.wujianguang.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wujianguang.domain.Article;
import com.wujianguang.domain.ArticleWithBLOBs;
import com.wujianguang.domain.Vo;
import com.wujianguang.service.ArticleService;
@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	
	@RequestMapping("list")
	public String list(Model model,@RequestParam(defaultValue = "1") Integer pageNum,Vo vo) {
		PageHelper.startPage(pageNum, 10);
		List<Article> list = articleService.list(vo);
		PageInfo<Article> info=new PageInfo<Article>(list);
		model.addAttribute("vo", vo);
	    model.addAttribute("pg", info);
		return "list";
	}
		
	
	@GetMapping("article")
	public String article(Integer id,Model model,HttpServletRequest req) {
		ArticleWithBLOBs article = articleService.selectByPrimaryKey(id);
		model.addAttribute("article", article);

		return "article";
		
	}
	
	
}

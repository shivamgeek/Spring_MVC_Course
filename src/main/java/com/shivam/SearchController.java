package com.shivam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController {

	@RequestMapping("search-page")
	public String showSearchPage() {
		return "search-page";
	}
	
	@RequestMapping("search-results")
	public String showResults() {
		return "search-results";
	}
	
}

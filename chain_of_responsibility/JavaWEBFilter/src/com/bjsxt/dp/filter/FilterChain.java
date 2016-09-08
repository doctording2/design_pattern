package com.bjsxt.dp.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
	List<Filter> filters = new ArrayList<Filter>();
	int index = 0;
	
	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;
	}
	
	// 递归处理，形成栈，这样 request顺序处理，response逆序
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		if(index == filters.size())
			return ;
		
		Filter f = filters.get(index);
		index ++;
		f.doFilter(request, response, chain);
	}
}

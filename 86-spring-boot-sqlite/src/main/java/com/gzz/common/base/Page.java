package com.gzz.common.base;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @功能描述 分页数据
 * @author https://www.jianshu.com/u/3bd57d5f1074
 * @date 2020-02-02 02:20:20
 */
@Setter
@Getter
@AllArgsConstructor
public class Page<T> {
	private List<T> dataList; /* 数据列表 */
	private int pageSize = 10; /* 页大小(每页记录条) */
	private long rowCount;/* 记录总数 */
	private int curpage = 0;/* 当前页码 */
	private int pageCount;/* 当前页码 */
}

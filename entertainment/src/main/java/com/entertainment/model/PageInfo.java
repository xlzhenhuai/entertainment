package com.entertainment.model;




/**
 * 类名称：     PageInfo   
 * 类描述：    通用分页信息类，用于承载分页信息
 *
 */
public class PageInfo {
	
	/**
	  * 总页数
	  */
	 private int totalPage = 1;

	 /**
	  * 总记录数
	  */
	 private int totalRec = 0;

	 /**
	  * 默认每页记录数
	  */
	 private final int defaultPageSize = 12;

	 /**
	  * 每页记录数
	  */
	 private int pageSize = defaultPageSize;

	 /**
	  * 当前页码
	  */
	 private int pageIndex = 1;

	 /**
	  * 全部页码，从1开始
	  */
	 private int[] pageNumbers;

	 public int getPageIndex() {
	  return pageIndex;
	 }

	 public void setPageIndex(int pageIndex) {
	  this.pageIndex = pageIndex > 0 ? pageIndex : 1;
	 }


	 public int getPageSize() {
	  return pageSize;
	 }

	 public void setPageSize(int pageSize) {
	  this.pageSize = pageSize > 0 ? pageSize : 10;
	 }

	 public int getTotalPage() {
	  return totalPage;
	 }

	 public void setTotalPage(int totalPage) {
	  this.totalPage = totalPage > 0 ? totalPage : 1;
	 }

	 public int getTotalRec() {
	  return totalRec;
	 }

	 public void setTotalRec(int totalRec) {
	  this.totalRec = totalRec > -1 ? totalRec : 0;
	 }

	 public int[] getPageNumbers() {
	  return pageNumbers;
	 }

	 public void setPageNumbers(int[] pageNumbers) {
	  this.pageNumbers = pageNumbers;
	 }
	 
		/**
		 * 获取分页begin参数 limit #{begin}, #{end}
		 */
		public int getBegin() {
			Integer begin = (pageIndex - 1) * pageSize;
			if (begin < 0) {
				begin = 0;
			}
			return begin;
		}

		/**
		 * 获取分页end参数 limit {begin}, {end}
		 */
		public int getEnd() {
			if (pageSize <= 0) {
				return defaultPageSize;
			} else {
				return pageSize;
			}
		}
		
		public int getLastPage() {
			if (pageIndex > 1)
				return pageIndex - 1;
			else
				return 0;
		}

		public int getNextPage() {
			if (pageIndex < totalPage)
				return pageIndex + 1;
			else
				return pageIndex;
		}


}

package com.entertainment.model;




/**
 * �����ƣ�     PageInfo   
 * ��������    ͨ�÷�ҳ��Ϣ�࣬���ڳ��ط�ҳ��Ϣ
 *
 */
public class PageInfo {
	
	/**
	  * ��ҳ��
	  */
	 private int totalPage = 1;

	 /**
	  * �ܼ�¼��
	  */
	 private int totalRec = 0;

	 /**
	  * Ĭ��ÿҳ��¼��
	  */
	 private final int defaultPageSize = 12;

	 /**
	  * ÿҳ��¼��
	  */
	 private int pageSize = defaultPageSize;

	 /**
	  * ��ǰҳ��
	  */
	 private int pageIndex = 1;

	 /**
	  * ȫ��ҳ�룬��1��ʼ
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
		 * ��ȡ��ҳbegin���� limit #{begin}, #{end}
		 */
		public int getBegin() {
			Integer begin = (pageIndex - 1) * pageSize;
			if (begin < 0) {
				begin = 0;
			}
			return begin;
		}

		/**
		 * ��ȡ��ҳend���� limit {begin}, {end}
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

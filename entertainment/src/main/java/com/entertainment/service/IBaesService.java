package com.entertainment.service;

import java.util.List;



public interface IBaesService<T> {
	
	public abstract boolean save(T record);
	public abstract boolean del(Integer id);
	public abstract boolean updata(T record);
	public abstract T load(Integer id);
	public abstract List<T> queryAll(T record);
	


}

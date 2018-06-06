package test;

import java.util.List;

public abstract interface CDCD {
	/**
	 * 
	 * @Title: ListT 
	 * @Description: 被复制的类
	 * @param t
	 * @return
	 * @return: List<String>
	 */
	public abstract <T> List<String> ListT (T t);
	/**
	 * 
	 * @Title: ListK 
	 * @Description: 复制到的类
	 * @param k
	 * @return
	 * @return: List<String>
	 */
	public abstract <K> List<String> ListK (K k);
	/**
	 * 
	 * @Title: ListC 
	 * @Description: 获取C类的属性并放入集合中
	 * @param c
	 * @return
	 * @return: List
	 */
	
	public abstract List<String> ListC (C c);
	/**
	 * 
	 * @Title: ListD 
	 * @Description: 获取类D的属性放入集合中
	 * @param d
	 * @return
	 * @return: List
	 */
	public abstract List<String> ListD(D d);
	/**
	 * 
	 * @Title: copy 
	 * @Description: 默认匹配策略
	 * @param c
	 * @return
	 * @return: D
	 */
	public abstract D copy(C c);
	/**
	 * 
	 * @Title: copyse 
	 * @Description: 自定义匹配策略
	 * @param c
	 * @return
	 * @return: D
	 */
	public abstract D copyse(C c) ;
	/**
	 * 
	 * @Title: copya 
	 * @Description: 把t中的属性值按默认规则匹配到k中 
	 * @param t
	 * @param k
	 * @return
	 * @return: K
	 */
	public abstract <T, K> K copya(T t,K k);
	/**
	 * 
	 * @Title: copyase 
	 * @Description: 把t中的属性按照自定义规则匹配到k中
	 * @param t
	 * @param k
	 * @return
	 * @return: K
	 */
	public abstract <T, K> K copyase(T t,K k);
}

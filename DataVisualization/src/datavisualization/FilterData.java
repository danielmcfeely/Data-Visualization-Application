/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datavisualization;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FilterData {

	List<Data> dataList;
	Map<String, Data> dataMap;
	Data data;
	final static String CATEGORY_HEADER = "Movie";
	
	public FilterData(List<Data> dataList){
		this.dataList = dataList;
		
		this.dataMap = new HashMap<String, Data>();
		for(Data data : dataList){
			String key = data.getCategory();
			if(CATEGORY_HEADER.equals(key) == false)
				this.dataMap.put(key, data);
		}
	}
		
	public Data getByGroup(String group){
		return this.dataMap.get(group);
	}
	
	public Set<String> getKeys(){
		return this.dataMap.keySet();
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datavisualization;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/**
 *
 * @author zhenyu
 */
public class CriteriaSelection_associated {
	
	List<Integer> dataList;
	Map<String, List<Integer>> groupedData;
	
	public CriteriaSelection_associated(List<Integer> dataList, Map<String, List<Integer>> groupedData){
		this.dataList = dataList;
		this.groupedData = groupedData;
	}
	
	void groupSort(String group) {
		groupedData.get(group).sort(null);
	};
	
	void numericalSortUp(){
		dataList.sort(null);
	}
	
	void numericalSortDown(){
		dataList.sort(Comparator.reverseOrder());
	}
	
	int getValue(int index){
		return dataList.get(index);
	}
}

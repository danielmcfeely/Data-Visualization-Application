/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/**
 *
 * @author zhenyu
 */
public class CriteriaSelection_associated {
	
	List<Data> dataList;
	
	public CriteriaSelection_associated(List<Data> ls){
		this.dataList = ls;

	}
	
	public void display(){
		if(dataList == null) return;
		FilterPanel fp = new FilterPanel(dataList);
	}
}

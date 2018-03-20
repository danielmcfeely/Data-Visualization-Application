package datavisualization;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/**
 *
 * @author zhenyu
 */
public class CriteriaSelection_associated {
	
	Graph gp;
	JPanel g;
	public CriteriaSelection_associated(Graph gp,JPanel g){
		this.gp = gp;
		this.g = g;
	}
	
	public void display(){
		if(gp.graphData == null) return;
		FilterPanel fp = new FilterPanel(gp,g);
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datavisualization;

import java.util.Comparator;

public class DataGroupComparator implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		return o1.getCategory().compareTo(o2.getCategory());
	}

}

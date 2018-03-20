

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Import {

    private static final String COMMA_DELIMITER = ",";
    
    public static List<Data> importData(String path){
       List<Data> dataList = new ArrayList<Data>();
        
       BufferedReader br = null;
        try
        {
            //Look into open filepath, argrument from a picker
            br = new BufferedReader(new FileReader(path));
            
            //dataList = new ArrayList<Data>();
            
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) 
            {
                String[] dataDetails = line.split(COMMA_DELIMITER);
                
                if(dataDetails.length > 0 )
                {
                    Data data = new Data(dataDetails[0],
                            Integer.parseInt(dataDetails[1]),Integer.parseInt(dataDetails[2]),
                            Integer.parseInt(dataDetails[3]));
                    dataList.add(data);
                }
            }
            
            for(Data d : dataList)
            {
                System.out.println(d.getCategory()+"   "+d.getValue1()+"   "
                		+d.getValue2()+"   "+d.getValue3());
            }
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }
        return dataList;
    }
}

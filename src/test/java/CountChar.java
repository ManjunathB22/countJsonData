import org.json.JSONException;
import org.json.simple.*;
import org.json.simple.parser.*;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CountChar {

    @Test
    public void countChar() throws JSONException, FileNotFoundException {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("/Users/manjunathb/IdeaProjects/ImmersionTask/src/test/resources/samplejsondata.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String nameStr = (String)jsonObject.get("String");
            int count=0;
            for(int i=0;i<nameStr.length();i++){
                if(nameStr.charAt(i)!=' ')
                    count++;
            }
            System.out.println("Number of character in String "+count);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

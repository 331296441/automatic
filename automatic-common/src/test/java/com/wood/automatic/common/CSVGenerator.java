import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVGenerator {

    public static void generateCSV(String input, String output) {
        JSONArray jsonArray = JSONArray.parseArray(input);

        List<String[]> data = new ArrayList<>();

        // 遍历 JSON 数组
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            // 提取列标题
            Iterator<String> keys = jsonObject.keySet().iterator();
            List<String> headers = new ArrayList<>();
            while (keys.hasNext()) {
                headers.add(keys.next());
            }

            // 提取列值
            List<String> values = new ArrayList<>();
            for (String header : headers) {
                values.add(jsonObject.getString(header));
            }

            // 添加到数据列表
            data.add(values.toArray(new String[0]));
        }

        // 写入 CSV 文件
        try (CSVWriter writer = new CSVWriter(new FileWriter(output))) {
            // 写入列标题
            writer.writeNext(headers.toArray(new String[0]));

            // 写入数据
            writer.writeAll(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String input = "[{\"name\":\"name1\",\"id\":1,\"script\":\"{test:test1}\"},{\"name\":\"name2\",\"id\":2,\"script\":\"{test:test2}\"}]";
        String output = "output.csv";
        generateCSV(input, output);
    }
}
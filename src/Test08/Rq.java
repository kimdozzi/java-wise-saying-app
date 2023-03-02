package Test08;

import java.util.HashMap;
import java.util.Map;

public class Rq {
    private String actionCode;
    private Map<String, String> params = new HashMap<>();

    public Rq(String command) {
        String[] commandBits = command.split("\\?", 2); // 최대 두개까지 나논다.
        actionCode = commandBits[0];

        String[] paramBits = commandBits[1].split("&");

        for(String param : paramBits) {
            String[] paramStrBits = param.split("=", 2);
            String key = paramStrBits[0];
            String value = paramStrBits[1];

            params.put(key, value);
        }
    }

    public String getActionCode() {
        return actionCode;
    }

    public String getParam(String name) {
        return params.get(name);
    }
}

package Test08;

import java.util.HashMap;
import java.util.Map;

public class Rq {
    private String actionCode; // 삭제, 등록, 목록, 수정, 종료 등의 코드
    private Map<String, String> params; // 등록번호(key)와 작가이름(Value)을 담기 위한 HashMap

    public Rq(String command) {
        String[] commandBits = command.split("\\?", 2); // 최대 두개까지 나눈다.
        actionCode = commandBits[0]; // ?를 기준으로 나눈 왼쪽(actionCode)를 저장해준다.

        params = new HashMap<>(); // hashMap 초기화

        if(commandBits.length == 1) return;
        // 만약, 삭제?id=1 꼴이 아니라 just 목록,등록 등이면
        // 아래 코드를 실행할 필요가 없으므로 함수 종료

        String[] paramBits = commandBits[1].split("&"); // & 기준으로 분리

        for(String param : paramBits) { // 분리한 데이터를 조회
            String[] paramStrBits = param.split("=", 2); // = 기준으로 또다시 분리

            if(paramStrBits.length == 1) continue; // 분리된게 없다면 continue

            String key = paramStrBits[0]; // 분리된게 있다면 각 key, value를 저장
            String value = paramStrBits[1];

            params.put(key, value); // 데이터 저장
        }
    }

    public String getActionCode() {
        return actionCode;
    }

    public String getParam(String name) {
        return params.get(name);
    }
    public int getIntParam(String name, int defaultValue) {
        try {
            return Integer.parseInt(getParam(name));
        } catch (NumberFormatException e) { }
        return defaultValue;
    }
}

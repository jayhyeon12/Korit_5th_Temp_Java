package com.study.ch16;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

class ArrayService {
    private String[] strArray;

    public void add(String str) {
        String[] newArray = new String[strArray.length + 1];
        for (int i = 0; i < strArray.length; i++) {
            newArray[i] = strArray[i];

        }
        strArray = newArray;

        strArray[strArray.length - 1] = str;
    }

    public void remove(int index) {
        // 크기가 1 작은 새로운 배열 생성
        // 매개변수로 받은 인덱스 값을 기준으로 작은 인덱스는 그대로, 큰 인덱스는 한 칸씩 앞으로 옮김
        // strArray의 배열을 새로운 배열로 바꿈

        String[] newArray = new String[strArray.length - 1];
        for (int i = 0; i < newArray.length; i++) {
                newArray[i] = strArray[i < index ? i : i + 1];
            }
            strArray = newArray;
        }

        public String get(int index) {
            return strArray[index];

        }

    }

    public int indexOf(String str) {
        if (str == null) {
            return -1;
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "Array[ ";
        for (int i = 0; i < str.length; i++) {
            result += strArray[i];
            if (i < strArray.length - 1) {
                result += ", ";

            }

        }

        result += " ]";

        return result;
    }

}
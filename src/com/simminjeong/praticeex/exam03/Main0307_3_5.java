package com.simminjeong.praticeex.exam03;

import java.util.Scanner;

public class Main0307_3_5 {

    public static void main(String[] args) {

        System.out.println("[메뉴] 1:검색 2:등록 3:삭제 4:변경 >");
        int selected = new Scanner(System.in).nextInt();

        switch (selected) {
            case 1:
                System.out.println("검색합니다");
                break;
            case 2:
                System.out.println("등록합니다");
                break;
            case 3:
                System.out.println("삭제합니다");
                break;
            case 4:
                System.out.println("변경합니다");
                break;
            default: // 아무것도 하지 않는다.
                break;
        }
    }
}

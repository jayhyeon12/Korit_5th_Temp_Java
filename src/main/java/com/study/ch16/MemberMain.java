package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    private static ArrayList<Member> members = new ArrayList<>();

    public static String inputSearchName(String label) {
        Scanner sc = new Scanner(System.in);
        System.out.print(label + " >> ");
        return sc.nextLine();

    }

    public static Member findMemberByName(String name) {
        for (Member m : members) {
            if(m.getName().equals(name)) {
                return m;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Member> members = new ArrayList<>();
        String selectedMenu = sc.nextLine();

        while (true) {
            System.out.println(" 회원 관리 프로그램 ");
            System.out.println(" 1. 회원 등록 ");
            System.out.println(" 2. 회원 이름 수정 ");
            System.out.println(" 3. 회원 주소 수정 ");
            System.out.println(" 4. 회원 이름으로 조회 ");
            System.out.println(" 5. 회원 전체 조회 ");
            System.out.println(" 6. 회원 삭제 ");
            System.out.println(" q. 프로그램 종료 ");
            selectedMenu = sc.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else if ("1".equals(selectedMenu)) {
                String name = null;
                String adr = null;

                System.out.println(" 1. 회원 등록 ");
                System.out.print(" 이름 >> ");
                name = sc.next();
                System.out.println(" 주소 >> ");
                adr = sc.nextLine();

                Member m = new Member(name, adr);
                members.add(m);
                System.out.println(" << 등록 완료 >> ");


            } else if ("2".equals(selectedMenu)) {
                String searchName = null;
                System.out.println(" 2. 회원 이름 수정 ");
                searchName = inputSearchName("수정할 회원 이름 입력 >> ");
                Member findMember = findMemberByName(searchName);
                searchName = sc.nextLine();

                if (findMember  == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다");
                    continue;
                }
                System.out.println("이름 >> ");
                String updateName = sc.nextLine();
                findMember.setName(updateName);
                System.out.println(" << 회원 이름 수정 완료 >> ");


            } else if ("3".equals(selectedMenu)) {
                String searchName= null;
                System.out.println(" 3. 회원 주소 수정 ");
                searchName = inputSearchName("수정할 회원 이름 입력 >> ");
                Member findMember = findMemberByName(searchName);
                searchName = sc.nextLine();

                if (findMember == null) {
                    System.out.println(" 미등록 이름 ");
                } else {
                    String searchAdr = null;
                    System.out.println(" 주소 >> ");
                    String updateAdr = sc.nextLine();
                    findMember.setAdr(updateAdr);
                    System.out.println(" << 회원 주소 수정 완료 >> ");
                }


            } else if ("4".equals(selectedMenu)) {
                String searchName = null;
                System.out.println(" 4. 회원 이름으로 조회 ");
                searchName = inputSearchName("조회할 회원 이름 입력  >> ");
                Member findMember = findMemberByName(searchName);
                System.out.println(" 조회할 회원 이름 입력 >> ");
                searchName = sc.nextLine();

                if (findMember == null) {
                    System.out.println("미등록 이름");
                    continue;
                }
                    System.out.println(findMember);
                    System.out.println(" << 회원 조회 완료 >> ");


            } else if ("5".equals(selectedMenu)) {
                System.out.println(" 5. 회원 전체 조회 ");
                for (Member m : members) {
                    System.out.println(members.toString());
                }
                    System.out.println(" 전체 조회 완료 ");


            } else if ("6".equals(selectedMenu)) {
                String deleteName = null;
                System.out.println(" 6. 회원 삭제 ");
                System.out.println(" 삭제할 회원 이름 입력 >> ");
                deleteName = sc.nextLine();
                Member findMember = null;
                for (Member m : members) {
                    if (m.getName().equals(deleteName)) {
                        findMember = m;
                        break;
                    }
                }
                members.remove(findMember); // members.remove(members.indexOf(findMember));
                    System.out.println(findMember);
                    System.out.println(" << 삭제 완료 >> ");
                
                } else {
                    System.out.println();

            }
            System.out.println(" 프로그램 종료 ");

        }

    }
}
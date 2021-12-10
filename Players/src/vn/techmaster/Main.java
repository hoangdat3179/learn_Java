package vn.techmaster;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Team team = new Team();
            boolean isCheck = false;
            Scanner sc = new Scanner(System.in);
            while (!isCheck){
                System.out.println("Chọn đội hình bạn muốn xây dựng: ");
                System.out.println("1 : 1GK - 4DF - 4MF - 2FW");
                System.out.println("2 : 1GK - 4DF - 3MF - 3FW");
                System.out.println("3 : 1GK - 3DF - 5MF - 2FW");
                System.out.println("0 : Thoát chương trình");
                int choose = sc.nextInt();

                switch (choose){
                    case 1:
                        team.buildTeam(4,4,2);
                        team.printList();
                        break;

                    case 2:
                        team.buildTeam(4,3,3);
                        team.printList();
                        break;

                    case 3:
                        team.buildTeam(3,5,2);
                        team.printList();
                        break;

                    case 0:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Không có lựa chọn này");
                }
            }

        }
    }

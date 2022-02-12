package service;
import model.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ApproveService {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public Approve createApprove(Employee employee){
        int id = random.nextInt(100);
        System.out.println("Nhập nội dung cần phê duyệt: ");
        String detail = sc.nextLine();
        System.out.println("Nhập chi phí cần được phê duyệt: ");
        String price = sc.nextLine();

        return new Approve(id, LocalDateTime.now().format(formatter),detail,employee,price);
    }

    public void addApprove(ArrayList<Approve> approves, Employee employee){
        approves.add(createApprove(employee));
    }

    public void show(ArrayList<Approve> approves){
        for(Approve a : approves){
            System.out.println(a);
        }
    }

    public void approved(ArrayList<Approve> approves, int id){
        for(Approve a : approves){
            if(a.getId()==id){
                System.out.println("1 - Phê duyệt");
                System.out.println("2 - Từ chối");
                int choose = sc.nextInt();
                sc.nextLine();
                switch (choose){
                    case 1:
                        a.setState(ApproveState.APPROVED);
                        break;
                    case 2:
                        a.setState(ApproveState.REJECTED);
                        System.out.println("Ghi lí do từ chối: ");
                        a.setReason(sc.nextLine());
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");
                }
            }
        }
    }
}

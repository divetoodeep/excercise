package edu.saigon.excercise.nguyenquanghuy;

import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Chon bai tap: ");
        System.out.println("1. Phuong Trinh Bac 2");
        System.out.println("2. Tinh n!");
        System.out.println("3.Tim UCLN va BCNN cua 2 so");
        int n;
        n = input.nextInt();
        switch (n) {
            case 1:
                PTBac2.giaiPT();
                break;
            case 2:
                TinhGiaiThua.calculate();
                break;
            case 3:
                BoiUoc.calculate();
                break;
            default:
                System.out.println("Nhap sai!");
        }
    }
}
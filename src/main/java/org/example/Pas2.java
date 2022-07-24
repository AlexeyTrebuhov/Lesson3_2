package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
public class Pas2  { //��������� ���������� ������  Pas2

    // ���������� ��������
    public static int Pas() {
        return (int) (Math.random() * 10000000);
    }
    ArrayList<Integer> ArrayPassport = new ArrayList<>();  // C������������ ��������� ��� �������� ������ ���������
    {
        for (int i = 0; i < 10; i++) {
            int x = Pas();
            ArrayPassport.add(x);
        }
    }

    // ����������   ����������
    public static int Priory() {
        return (int) (Math.random() * 3);
    }//  3 = ���������� ���������� ������� �����������
    static ArrayList<Integer> ArrayPriory = new ArrayList<>();  // C������������ ��������� ��� �������� ������ ����������
    static {
        for (int i = 0; i < 10; i++) {
            int y = Priory();
            ArrayPriory.add(y);
        }
    }
    // ����������  �����
    static ArrayList<ArrayList<Character>> ArrayName = new ArrayList<>();  // C������������ ��������� ��� �������� ���������
    int rand;
    Random name = new Random();
    {
        for (int i = 0; i < 10; i++) {
            ArrayList<Character> ArrayName1 = new ArrayList<>();  // C������ ��������� ��������� ���  ������ ���������
            for (int j = 0; j < 3; j++) {
                rand = name.nextInt(25) + 65; //�������� ���� �� � (65) �� Z (65+35) ASCII))
                ArrayName1.add((char) rand);
            }
            ArrayName.add(ArrayName1); // ������������� ��������� ��������� �����������
        }
    }
    public Pas2(String brain) throws InterruptedException { // ��������� ����� Pas2 (������, ������)

        Random random = new Random();
        int windows_work1 = 0;// ����������, ������� ������� ������� ���� ( ������ �������)
        int windows_work2 = 0;// ����������, ������� ������� ������� ���� ( ������ ������2

        while (true) {
            windows_work1 = random.nextInt(7);
            windows_work2 = random.nextInt(4);
            if (windows_work2 != 0) break;
        }
        int time1 = windows_work1 *1000; // ����� ������ �������������� , �������( ������� 1)
        int time2 = windows_work2 * 1000;// ����� ������ ��������������, �������  ( ������� 1)
        int sum_time = 0; // ������ ������� ������ ��������������

        System.out.println("History 1 - Initial work MFC. Collection naim, passport, prioriy");
        System.out.println(new Date() + " ,  Pause = " + time1 + "\n");
        sum_time = sum_time + time1;

        System.out.println("Name persons = " + ArrayName);
        System.out.println("Number Passport = " + ArrayPassport);
        System.out.println("Number Priory = " + ArrayPriory);
        System.out.println("---------------------------------");
        sum_time = sum_time + time1;
        Thread.sleep(time1); // ������������ ���� ����� (������� 1 )

        System.out.println("History 2 - Open window, creating a queue");
        System.out.println(new Date() + " ,  Pause = " + time2 + "\n");
        Thread.sleep(time2); // ������������ ���� ����� ( ������� 2)
        sum_time = sum_time + time2;
        ArrayList<ArrayList<Serializable>> ArrayPosetit = new ArrayList<ArrayList<Serializable>>();  // C������ ��������� ���  ������ �����������
        ArrayList<Serializable> ArrayPosetit1;  // C������ ��������� ��������� ��� ������ ����� ������ ������� ���������

        for (int i = 0; i < 10; i++) {
            ArrayPosetit1 = new ArrayList<Serializable>();
            ArrayList<Character> retval20 = ArrayName.get(i);// ��������� ��������� ���, �����  FIFO
            ArrayPosetit1.add(retval20);
            Integer retval21 = ArrayPassport.get(i);// ��������� ��������� ������� �����  FIFO
            ArrayPosetit1.add(retval21);
            Integer retval22 = ArrayPriory.get(i);// ��������� ��������� ���������, �����  FIFO
            ArrayPosetit1.add(retval22);
            ArrayPosetit.add(ArrayPosetit1);// ��������� ������ ��������� � ���������, �����  FIFO
        }

        System.out.println("Array Posetit = " + ArrayPosetit); // �������� ������ ���������� ( ���. ��������, ���������)
        System.out.println("---------------------------------");
        Thread.sleep(time2); // ������������ ���� �����  ( ������� 2)
        sum_time = sum_time + time2;


        System.out.println("History 3 - NO WORK !!!  Sort queue by priority");//  �������� ��� ����������� ��������
        System.out.println(new Date() + " ,  Pause = " + time2 + "\n");
        Thread.sleep(time2); // ������������ ���� �����  ( ������� 2)
        sum_time = sum_time + time2;

        ArrayList<Serializable> retval0 = ArrayPosetit.get(0); // ��������� ����� �� ����������
        ArrayList<Serializable> retval1 = ArrayPosetit.get(1);
        ArrayList<Serializable> retval2 = ArrayPosetit.get(2);
        ArrayList<Serializable> retval3 = ArrayPosetit.get(3);
        ArrayList<Serializable> retval4 = ArrayPosetit.get(4);
        ArrayList<Serializable> retval5 = ArrayPosetit.get(5);
        ArrayList<Serializable> retval6 = ArrayPosetit.get(6);
        ArrayList<Serializable> retval7 = ArrayPosetit.get(7);
        ArrayList<Serializable> retval8 = ArrayPosetit.get(8);
        ArrayList<Serializable> retval9 = ArrayPosetit.get(9);

        // ���������  � ���������� ������ ���� ( ���������) AXTUNG !!!

        Integer a0 = (Integer) retval0.get(2);
        Integer a1 = (Integer) retval1.get(2);
        Integer a2 = (Integer) retval2.get(2);
        Integer a3 = (Integer) retval3.get(2);
        Integer a4 = (Integer) retval4.get(2);
        Integer a5 = (Integer) retval5.get(2);
        Integer a6 = (Integer) retval6.get(2);
        Integer a7 = (Integer) retval7.get(2);
        Integer a8 = (Integer) retval8.get(2);
        Integer a9 = (Integer) retval9.get(2);

        ArrayList<ArrayList<Serializable>> ArrayNewPosetit = new ArrayList<ArrayList<Serializable>>();  // C������ ��������� ���  ������ ������������� �����������

        if (a0 == 0) {
            ArrayNewPosetit.add(retval0);
        }
        if (a1 == 0) {
            ArrayNewPosetit.add(retval1);
        }
        if (a2 == 0) {
            ArrayNewPosetit.add(retval2);
        }
        if (a3 == 0) {
            ArrayNewPosetit.add(retval3);
        }
        if (a4 == 0) {
            ArrayNewPosetit.add(retval4);
        }
        if (a5 == 0) {
            ArrayNewPosetit.add(retval5);
        }
        if (a6 == 0) {
            ArrayNewPosetit.add(retval6);
        }
        if (a7 == 0) {
            ArrayNewPosetit.add(retval7);
        }
        if (a8 == 0) {
            ArrayNewPosetit.add(retval8);
        }
        if (a9 == 0) {
            ArrayNewPosetit.add(retval9);
        }
        if (a0 == 1) {
            ArrayNewPosetit.add(retval0);
        }
        if (a1 == 1) {
            ArrayNewPosetit.add(retval1);
        }
        if (a2 == 1) {
            ArrayNewPosetit.add(retval2);
        }
        if (a3 == 1) {
            ArrayNewPosetit.add(retval3);
        }
        if (a4 == 1) {
            ArrayNewPosetit.add(retval4);
        }
        if (a5 == 1) {
            ArrayNewPosetit.add(retval5);
        }
        if (a6 == 1) {
            ArrayNewPosetit.add(retval6);
        }
        if (a7 == 1) {
            ArrayNewPosetit.add(retval7);
        }
        if (a8 == 1) {
            ArrayNewPosetit.add(retval8);
        }
        if (a9 == 1) {
            ArrayNewPosetit.add(retval9);
        }
        if (a0 == 2) {
            ArrayNewPosetit.add(retval0);
        }
        if (a1 == 2) {
            ArrayNewPosetit.add(retval1);
        }
        if (a2 == 2) {
            ArrayNewPosetit.add(retval2);
        }
        if (a3 == 2) {
            ArrayNewPosetit.add(retval3);
        }
        if (a4 == 2) {
            ArrayNewPosetit.add(retval4);
        }
        if (a5 == 2) {
            ArrayNewPosetit.add(retval5);
        }
        if (a6 == 2) {
            ArrayNewPosetit.add(retval6);
        }
        if (a7 == 2) {
            ArrayNewPosetit.add(retval7);
        }
        if (a8 == 2) {
            ArrayNewPosetit.add(retval8);
        }
        if (a9 == 2) {
            ArrayNewPosetit.add(retval9);
        }

        System.out.println("Array New Posetit  = " + ArrayNewPosetit); // �������� ������ ���������� �� ���������� ( ���. ��������, ���������)
        System.out.println("---------------------------------");
        Thread.sleep(time2); // ������������ ���� �����  ( ������� 2)
        sum_time = sum_time + time2;

        int num = 4;
        for (int i = 0; i < 9; i++) {

            ArrayNewPosetit.remove(0);
            System.out.println("History " + num +  " - Visitor served. Next");//  �������� ����������� ���������
            System.out.println(new Date() + " ,  Pause = " + time1 + "\n");
            Thread.sleep(time1); // ������������ ���� ����� ������� 1
            sum_time = sum_time + time1;
            System.out.println("The queue has decreased  = " + ArrayNewPosetit); // �������� ������ ���������� �� ���������� ( ���. ��������, ���������)
            num ++;
            System.out.println("---------------------------------");
            Thread.sleep(time2); // ������������ ���� �����  ( ������� 2)
            sum_time = sum_time + time2;

            if ( sum_time > 20000) // �� ���������� ����� ������� �������������� ������� ����
            {
                Thread.sleep(time2); // ������������ ���� �����  ( ������� 2)
                sum_time = sum_time + time2;
                Thread.sleep(time2); // ������������ ���� �����  ( ������� 2)
                sum_time = sum_time + time2;
                System.out.println(" Lunch from 12 to 13");
                System.out.println("Pause = 10 sec");
                Thread.sleep(10000); // ������������ ���� ����� (������� 1)
                System.out.println("---------------------------------");
                ArrayList<Serializable> retval77 = ArrayNewPosetit.get(3);
                System.out.println("Bay -bay!" + retval77 + "Im ran. By- By ");
                ArrayNewPosetit.remove(3);
                System.out.println("---------------------------------");
            }
            sum_time = 0;
            num = num + 1;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Pas2("1");
    }
}
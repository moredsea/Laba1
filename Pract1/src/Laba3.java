import java.util.Scanner;
public class Laba3 {
}
     class Circle {
        private double R, D, S, C;

        public void setR(double r) {
            R = r;
            D = 2 * R;
            C = 2 * Math.PI * R;
            S = Math.PI * R * R;
        }

        public double getC() {
            return C;
        }

        public double getD() {
            return D;
        }

        public double getR() {
            return R;
        }

        public double getS() {
            return S;
        }
    }

    class Human {
        private int arm;
        private int leg;
        private int head;

        public Human(int a, int l, int h) {
            arm = a;
            leg = l;
            head = h;
        }

        public Human(int a, int l) {
            arm = a;
            leg = l;
            head = 0;
        }

        public Human(int a) {
            arm = a;
            leg = 0;
            head = 0;
        }

        public void setArm(int arm) {
            this.arm = arm;
        }

        public void setLeg(int leg) {
            this.leg = leg;
        }

        public void setHead(int head) {
            this.leg = head;
        }

        public int getArm(int arm) {
            return arm;
        }

        public int getLeg(int leg) {
            return leg;
        }

        public void intoHuman() {
            System.out.println("Leg:" + this.leg + "Arm:" + this.arm + "Head:" + this.head);
        }
    }

    class Book {
        String N, C, A;
        boolean S;

        Book(String a, String n, String c, boolean s) {
            N = n;
            A = a;
            C = c;
            S = s;
        }

        void info() {
            System.out.println("Название книги: " + N);
            System.out.println("Автором книги является: " + A);
            System.out.println("Цвет книги: " + C);
            if (S)
                System.out.println("Обложка книги мягкая");
            else
                System.out.println("Обложка книги жесткая");
        }
    }
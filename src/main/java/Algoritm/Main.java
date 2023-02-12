package Algoritm;

import java.util.Arrays;

public class Main {
    static int[][] getMap() {
        return new int[][] {
                { 00, 00, 00, 00, 00, 00, 00, 00 },
                { 00, 00, -1, 00, 00, 00, 00, 00 },
                { 00, 00, -1, 00, -1, 00, -1, 00 },
                { 00, 00, -1, 00, 00, 00, -1, 00 },
                { 00, 00, -1, 00, 00, 00, -1, 00 },
                { 00, -1, -1, -1, -1, -1, -1, 00 },
                { 00, 00, -1, 00, 00, 00, -1, 00 },
                { 00, 00, -1, 00, 00, 00, -1, 00 },
                { 00, 00, 00, 00, 00, 00, -1, 00 },
                { 00, 00, 00, 00, 00, 00, -1, 00 },
                { 00, 00, 00, 00, 00, 00, 00, 00 }
        };
    }

    static void pprint(int[][] m) {
        int rows = m.length;
        int colums = m[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if (m[i][j] == -1)
                    System.out.printf("%s", " @ ");
                else if (m[i][j] == -2)
                    System.out.printf("%s", " # ");
                else
                    System.out.printf("%s", "в–‘в–‘в–‘");

                // System.out.printf("%4d", m[i][j]);в–€
            }
            System.out.println();
        }
    }


//    static void start(int[][] map, int x, int y) {
//        map[x][y] = -2;
//    }
//    static void end(int[][] map, int x, int y) {
//        map[x][y] = -3;
//    }

    public static void main(String[] args) {
        int[][] map = getMap();
        //System.out.println(map[1][2]);
//        start(map, 7, 4);
        pprint(map);
        int i_start = 1;
        int j_start = 1;
        int i_finish = 11;
        int j_finish = 5;
        int rows = map.length;
        int colums = map[0].length;
        int[] point_x = new int[rows * colums];
        int[] point_y = new int[rows * colums];
        int[] point_x_ = new int[rows * colums];
        int[] point_y_ = new int[rows * colums];
        int k = 0;
        point_x[k] = i_start;
        point_y[k] = j_start;
        int step = 1;
        boolean flag = true;
        map[i_start][j_start] = step;
       // System.out.println(map[i_start][j_start]);
        while (flag == true) {
            int m = 0;
            step += 1;
            int i_, j_; //индексы заполнеия
            while (k >= 0) {
                int i = point_x[k];
                int j = point_y[k];
                k -= 1;
                //System.out.println(map[i][j]);
                //Шаг вверх
                i_ = i + 1;
                j_ = j;
                if ( (i_ >= 0 && i_ < rows) && (j_ >= 0 && j_ < colums)) {
                    if (map[i_][j_] == 0) {
                        map[i_][j_] = step;
                        point_x_[m] = i_;
                        point_y_[m] = j_;
                        m += 1;
                        if (i_ == i_finish && j_ == j_finish) {
                            flag = false;
                            break;
                        }
                    }
                }
                //System.out.println(map[i_][j_]);
                //Шаг вправо
                i_ = i;
                j_ = j + 1;
                if ( (i_ >= 0 && i_ < rows) && (j_ >= 0 && j_ < colums)) {
                    if (map[i_][j_] == 0) {
                        map[i_][j_] = step;
                        point_x_[m] = i_;
                        point_y_[m] = j_;
                        m += 1;
                        if (i_ == i_finish && j_ == j_finish) {
                            flag = false;
                            break;
                        }
                    }
                }
                //System.out.println(map[i_][j_]);
                //Шаг вниз
                i_ = i - 1;
                j_ = j;
                if ( (i_ >= 0 && i_ < rows) && (j_ >= 0 && j_ < colums)) {
                    if (map[i_][j_] == 0) {
                        map[i_][j_] = step;
                        point_x_[m] = i_;
                        point_y_[m] = j_;
                        m += 1;
                        if (i_ == i_finish && j_ == j_finish) {
                            flag = false;
                            break;
                        }
                    }
                }
                //System.out.println(map[i_][j_]);
                //Шаг влево
                i_ = i;
                j_ = j - 1;
                if ( (i_ >= 0 && i_ < rows) && (j_ >= 0 && j_ < colums)) {
                    if (map[i_][j_] == 0) {
                        map[i_][j_] = step;
                        point_x_[m] = i_;
                        point_y_[m] = j_;
                        m += 1;
                        if (i_ == i_finish && j_ == j_finish) {
                            flag = false;
                            break;
                        }
                    }
                }
                //System.out.println(map[i_][j_]);
                for ( int l = 0; l < m; l++) {
                    point_x[l] = point_x_[l];
                    point_y[l] = point_y_[l];
                }
                k = m - 1;
                System.out.println(k);
                System.out.println(m);
//            }
        }
//        for (int i = 0; i < rows; i++) {
//            for (int m = 0; m < colums ; m++) {
//                System.out.println(map[i][m]);
//            }
//        }
        //System.out.println(Arrays.toString(map));
        //System.out.println(map[1][0]);
    }
}}

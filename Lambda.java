package edu.poly.lab01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {
    static List<Student> list = Arrays.asList(
                    new Student("Nguyễn văn Tèo", true,7.5 ),
                    new Student("Nguyễn văn Tafi", true,5.5 ),
                    new Student("Nguyễn văn Ty", true,9.5 ),
                    new Student("Nguyễn văn Tèo", true,6.5 ),
                    new Student("Nguyễn văn Tèo", true,8.0 )
                );
    public static void main(String[] args) {
        
        demo4();
                                
                            }
                        
                            private static void demo4() {
                // Demo4Inter o = (int x)->{
                //     System.out.println(x);
                // };
                // o.m1(2023); 

                // 1 doi so thi lam cach nay cho nhanh
                Demo4Inter o = x -> System.out.println(x);
                o.m1(202323);
            }
                    
                

            
        
                            private static void demo2() {
                
                list.forEach(sv -> {
                    System.out.println(">> Name: " + sv.getName());
                    System.out.println(">> Marks: " + sv.getMarks());
                    System.out.println();
                });
            }
        
                    private static void demo1() {
                List<Integer> list = Arrays.asList(1,9,4,5,7);
                list.forEach(n -> System.out.println(n));
            }

            private static void demo3() {
                Collections.sort(list ,(sv1,sv2) -> -sv1.getMarks().compareTo(sv2.getMarks()));
                list.forEach(sv -> {
                    System.out.println(">> NAme: " + sv.getName());
                    System.out.println(">> MArks: " + sv.getMarks());
                    System.out.println();
                });
            }

            private static void demo4(){
                list.forEach(sv -> {
                    System.out.println(">> Name: " + sv.getName());
                    System.out.println(">> Marks: " + sv.getMarks());
                    System.out.println();
                });
            }


}
@FunctionalInterface
interface Demo4Inter {

    void m1(int x);
    default void m2(){}
    public static void m3(){}

    
};

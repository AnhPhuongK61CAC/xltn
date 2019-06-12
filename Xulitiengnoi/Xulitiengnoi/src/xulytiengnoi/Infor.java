/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulytiengnoi;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collector;

/**
 *
 * @author phuong
 */
public class Infor {
    
    /**
     * file txt lưu các thông tin về đất nước
     * @return 
     */
    public ArrayList docFile(){
        File file= new File("Infor.txt");
        ArrayList<Country> list = new ArrayList<>();
        try(Scanner scan = new Scanner(file)) {
            while(scan.hasNext()){
                Country w = new Country();
                w.setTen(scan.nextLine());
                w.setThudo(scan.nextLine());
                w.setVitri(scan.nextLine());
                w.setDanso(scan.nextLine());
                w.setDientich(scan.nextLine());
                w.setQuocki(scan.nextLine());
                list.add(w);
            }
        } catch (Exception e) {}
        return list;
    }
    
}